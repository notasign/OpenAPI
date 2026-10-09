package com.notasign.open.api.utils.http;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLEngine;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509ExtendedTrustManager;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.net.Socket;
import java.security.KeyStore;
import java.security.cert.CertificateException;
import java.security.cert.X509Certificate;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicLong;

/**
 * 支持热加载的X509信任管理器
 *
 * 背景：HttpClient为静态单例时，SSLContext仅在首次创建时加载一次信任证书库，
 * 服务端更换HTTPS证书后，新连接握手会报PKIX path building failed，
 * 即使更新了cacerts文件，旧client也不会重新读取。
 *
 * 本类将信任库加载从SSLContext初始化中剥离，SSLContext初始化时持有本类实例，
 * 之后替换内部委托TrustManager即可实现信任库热更新：
 * 1. 每次TLS握手前按最小时间间隔检查信任库文件lastModified，变化则自动重载；
 * 2. 提供reload()供业务在更新证书后主动触发；
 * 两种方式均无需重建HttpClient、无需重启应用。
 *
 * 信任库来源优先级：
 * 1. 显式指定的trustStorePath（支持JKS/PKCS12）；
 * 2. JVM系统属性javax.net.ssl.trustStore；
 * 3. java.home下lib/security/jssecacerts（存在时）或cacerts。
 *
 * @author Nota
 */
public class DynamicTrustManager extends X509ExtendedTrustManager {

    private static final Logger log = LoggerFactory.getLogger(DynamicTrustManager.class);

    /**
     * JVM默认cacerts密码
     */
    private static final char[] DEFAULT_TRUST_STORE_PASSWORD = "changeit".toCharArray();

    /**
     * 握手时检查文件变化的最小间隔（毫秒），避免高并发握手频繁触发文件状态检查
     */
    private static final long CHECK_INTERVAL_MILLIS = 10_000L;

    /**
     * 信任库文件
     */
    private final File trustStoreFile;

    /**
     * 信任库密码
     */
    private final char[] trustStorePassword;

    /**
     * 当前生效的委托TrustManager，替换引用即热生效
     */
    private volatile X509ExtendedTrustManager delegate;

    /**
     * 当前delegate对应的信任库文件最后修改时间
     */
    private volatile long loadedLastModified;

    /**
     * 懒检查节流时间戳
     */
    private final AtomicLong lastCheckAt = new AtomicLong(0L);

    /**
     * reload互斥标记，防止并发重复加载
     */
    private final AtomicBoolean reloading = new AtomicBoolean(false);

    /**
     * 构造并完成首次信任库加载
     *
     * @param trustStorePath     信任库文件路径，null时自动定位JVM默认信任库
     * @param trustStorePassword 信任库密码，null时按默认规则处理
     */
    public DynamicTrustManager(String trustStorePath, String trustStorePassword) {
        this.trustStoreFile = resolveTrustStoreFile(trustStorePath);
        this.trustStorePassword = resolvePassword(trustStorePassword);
        this.delegate = doLoad();
    }

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        maybeReload();
        requireDelegate().checkClientTrusted(chain, authType);
    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType) throws CertificateException {
        maybeReload();
        requireDelegate().checkServerTrusted(chain, authType);
    }

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType, Socket socket) throws CertificateException {
        maybeReload();
        requireDelegate().checkClientTrusted(chain, authType, socket);
    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType, Socket socket) throws CertificateException {
        maybeReload();
        requireDelegate().checkServerTrusted(chain, authType, socket);
    }

    @Override
    public void checkClientTrusted(X509Certificate[] chain, String authType, SSLEngine engine) throws CertificateException {
        maybeReload();
        requireDelegate().checkClientTrusted(chain, authType, engine);
    }

    @Override
    public void checkServerTrusted(X509Certificate[] chain, String authType, SSLEngine engine) throws CertificateException {
        maybeReload();
        requireDelegate().checkServerTrusted(chain, authType, engine);
    }

    @Override
    public X509Certificate[] getAcceptedIssuers() {
        X509ExtendedTrustManager tm = delegate;
        return tm == null ? new X509Certificate[0] : tm.getAcceptedIssuers();
    }

    /**
     * 主动重新加载信任库，线程安全可重复调用。
     * 更新cacerts或自定义truststore文件后调用，新握手即使用新信任库。
     */
    public void reload() {
        if (!reloading.compareAndSet(false, true)) {
            return;
        }
        try {
            X509ExtendedTrustManager newDelegate = doLoad();
            if (newDelegate != null) {
                this.delegate = newDelegate;
                log.info("信任库重载完成: {}", trustStoreFile == null ? "JVM默认" : trustStoreFile.getAbsolutePath());
            }
        } finally {
            reloading.set(false);
        }
    }

    /**
     * 握手时懒检查：信任库文件变化则自动重载
     */
    private void maybeReload() {
        File file = this.trustStoreFile;
        if (file == null) {
            return;
        }
        long now = System.currentTimeMillis();
        long last = lastCheckAt.get();
        if (now - last < CHECK_INTERVAL_MILLIS) {
            return;
        }
        if (!lastCheckAt.compareAndSet(last, now)) {
            return;
        }
        long currentModified = safeLastModified(file);
        if (currentModified > loadedLastModified) {
            log.info("检测到信任库文件变化，自动重新加载: {}", file.getAbsolutePath());
            reload();
        }
    }

    /**
     * 加载信任库并构建TrustManager
     *
     * @return 委托TrustManager
     */
    private X509ExtendedTrustManager doLoad() {
        Exception loadError = null;
        try {
            KeyStore keyStore = loadKeyStore();
            if (keyStore != null) {
                X509ExtendedTrustManager tm = buildTrustManager(keyStore);
                if (tm != null) {
                    this.loadedLastModified = safeLastModified(trustStoreFile);
                    return tm;
                }
            }
        } catch (Exception e) {
            loadError = e;
        }
        // 指定文件不可用（不存在/密码错误/格式不支持等）时降级为JVM默认，保证初始化不中断
        if (loadError != null) {
            log.warn("信任库文件加载失败，降级为JVM默认信任管理器: {}", loadError.getMessage(), loadError);
        }
        try {
            X509ExtendedTrustManager tm = buildTrustManager(null);
            if (tm != null) {
                this.loadedLastModified = safeLastModified(trustStoreFile);
                return tm;
            }
        } catch (Exception fallbackError) {
            log.error("JVM默认信任管理器初始化失败: {}", fallbackError.getMessage(), fallbackError);
        }
        return null;
    }

    /**
     * 构建信任管理器
     *
     * @param keyStore 信任库，null时使用JVM默认
     * @return X509ExtendedTrustManager
     * @throws Exception 构建失败
     */
    private X509ExtendedTrustManager buildTrustManager(KeyStore keyStore) throws Exception {
        TrustManagerFactory factory = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
        factory.init(keyStore);
        for (TrustManager tm : factory.getTrustManagers()) {
            if (tm instanceof X509ExtendedTrustManager) {
                return (X509ExtendedTrustManager) tm;
            }
        }
        return null;
    }

    /**
     * 读取信任库文件
     *
     * @return KeyStore，文件不存在时返回null（使用JVM默认）
     * @throws Exception 读取或解析失败
     */
    private KeyStore loadKeyStore() throws Exception {
        if (trustStoreFile == null || !trustStoreFile.exists()) {
            return null;
        }
        String configuredType = System.getProperty("javax.net.ssl.trustStoreType");
        String[] candidates = (configuredType != null && !configuredType.trim().isEmpty())
                ? new String[]{configuredType.trim()}
                : new String[]{KeyStore.getDefaultType(), "JKS"};
        Exception lastError = null;
        for (String storeType : candidates) {
            try (InputStream in = new FileInputStream(trustStoreFile)) {
                KeyStore keyStore = KeyStore.getInstance(storeType);
                keyStore.load(in, trustStorePassword);
                return keyStore;
            } catch (Exception e) {
                lastError = e;
            }
        }
        throw lastError != null ? lastError
                : new IllegalStateException("信任库读取失败: " + trustStoreFile.getAbsolutePath());
    }

    /**
     * 解析信任库文件位置
     *
     * @param explicitPath 显式配置路径
     * @return 信任库文件
     */
    private static File resolveTrustStoreFile(String explicitPath) {
        if (explicitPath != null && !explicitPath.trim().isEmpty()) {
            return new File(explicitPath.trim());
        }
        String sysPropPath = System.getProperty("javax.net.ssl.trustStore");
        if (sysPropPath != null && !sysPropPath.trim().isEmpty()) {
            return new File(sysPropPath.trim());
        }
        String javaHome = System.getProperty("java.home");
        File jssecacerts = new File(javaHome, "lib" + File.separator + "security" + File.separator + "jssecacerts");
        if (jssecacerts.exists()) {
            return jssecacerts;
        }
        return new File(javaHome, "lib" + File.separator + "security" + File.separator + "cacerts");
    }

    /**
     * 解析信任库密码
     *
     * @param explicitPassword 显式配置密码
     * @return 密码
     */
    private static char[] resolvePassword(String explicitPassword) {
        if (explicitPassword != null && !explicitPassword.isEmpty()) {
            return explicitPassword.toCharArray();
        }
        String sysPropPassword = System.getProperty("javax.net.ssl.trustStorePassword");
        if (sysPropPassword != null && !sysPropPassword.isEmpty()) {
            return sysPropPassword.toCharArray();
        }
        return DEFAULT_TRUST_STORE_PASSWORD;
    }

    /**
     * 读取文件最后修改时间，异常或文件不存在时返回0
     *
     * @param file 文件
     * @return 最后修改时间戳
     */
    private static long safeLastModified(File file) {
        if (file == null || !file.exists()) {
            return 0L;
        }
        try {
            return file.lastModified();
        } catch (Exception e) {
            return 0L;
        }
    }

    /**
     * 获取委托TrustManager，未初始化时抛出异常
     *
     * @return 委托TrustManager
     * @throws CertificateException 未初始化
     */
    private X509ExtendedTrustManager requireDelegate() throws CertificateException {
        X509ExtendedTrustManager tm = this.delegate;
        if (tm == null) {
            throw new CertificateException("信任管理器未初始化");
        }
        return tm;
    }
}
