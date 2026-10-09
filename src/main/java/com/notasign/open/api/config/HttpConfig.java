package com.notasign.open.api.config;

/**
 * @author Nota
 * 2021/9/8 17:53:20
 */
public class HttpConfig {
    /**
     * http连接超时时间
     */
    private Integer connectTimeout;
    /**
     * http读超时时间
     */
    private Integer readTimeout;
    /**
     * httpclient 每路由(域名)最大的连接数
     */
    private Integer defaultMaxPerRoute;
    /**
     * httpclient socket最大的连接数
     */
    private Integer defaultSocketMaxTotal;
    /**
     * http是否打开代理
     */
    private Boolean proxyFlag = false;
    /**
     * http代理ip
     */
    private String proxyHost;
    /**
     * http代理端口号
     */
    private Integer proxyPort;
    /**
     * 自定义信任证书库文件路径（支持JKS/PKCS12），null时使用JVM默认cacerts。
     * 配置后信任库支持热加载：服务端更换证书后更新该文件即可自动生效，无需重启应用
     */
    private String trustStorePath;
    /**
     * 信任证书库密码
     */
    private String trustStorePassword;


    public HttpConfig() {
    }

    public HttpConfig(int connectTimeout, int readTimeout, Boolean proxyFlag, String proxyHost, Integer proxyPort) {
        this.connectTimeout = connectTimeout;
        this.readTimeout = readTimeout;
        this.proxyFlag = proxyFlag;
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
    }

    public HttpConfig(int connectTimeout, int readTimeout, Boolean proxyFlag, String proxyHost, Integer proxyPort, Integer defaultMaxPerRoute, Integer defaultSocketMaxTotal) {
        this.connectTimeout = connectTimeout;
        this.readTimeout = readTimeout;
        this.proxyFlag = proxyFlag;
        this.proxyHost = proxyHost;
        this.proxyPort = proxyPort;
        this.defaultMaxPerRoute = defaultMaxPerRoute;
        this.defaultSocketMaxTotal = defaultSocketMaxTotal;
    }

    public Integer getDefaultMaxPerRoute() {
        return defaultMaxPerRoute;
    }

    public void setDefaultMaxPerRoute(Integer defaultMaxPerRoute) {
        this.defaultMaxPerRoute = defaultMaxPerRoute;
    }

    public Integer getDefaultSocketMaxTotal() {
        return defaultSocketMaxTotal;
    }

    public void setDefaultSocketMaxTotal(Integer defaultSocketMaxTotal) {
        this.defaultSocketMaxTotal = defaultSocketMaxTotal;
    }

    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public Integer getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    public Boolean getProxyFlag() {
        return proxyFlag;
    }

    public void setProxyFlag(Boolean proxyFlag) {
        this.proxyFlag = proxyFlag;
    }

    public String getProxyHost() {
        return proxyHost;
    }

    public void setProxyHost(String proxyHost) {
        this.proxyHost = proxyHost;
    }

    public Integer getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(Integer proxyPort) {
        this.proxyPort = proxyPort;
    }

    public String getTrustStorePath() {
        return trustStorePath;
    }

    public void setTrustStorePath(String trustStorePath) {
        this.trustStorePath = trustStorePath;
    }

    public String getTrustStorePassword() {
        return trustStorePassword;
    }

    public void setTrustStorePassword(String trustStorePassword) {
        this.trustStorePassword = trustStorePassword;
    }
}
