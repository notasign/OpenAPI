package com.notasign.open.api.utils.http;

import com.notasign.open.api.bean.base.BaseResponseEntity;
import com.notasign.open.api.bean.base.HttpInfoRes;
import com.notasign.open.api.config.HttpConfig;
import com.notasign.open.api.constants.RequestConstants;
import com.notasign.open.api.exception.ApiException;
import org.apache.http.*;
import org.apache.http.client.config.RequestConfig;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.methods.HttpPut;
import org.apache.http.client.methods.HttpDelete;
import org.apache.http.client.methods.HttpUriRequest;
import org.apache.http.config.Registry;
import org.apache.http.config.RegistryBuilder;
import org.apache.http.conn.socket.ConnectionSocketFactory;
import org.apache.http.conn.socket.PlainConnectionSocketFactory;
import org.apache.http.conn.ssl.SSLConnectionSocketFactory;
import org.apache.http.entity.ContentType;
import org.apache.http.entity.StringEntity;
import org.apache.http.entity.mime.HttpMultipartMode;
import org.apache.http.entity.mime.MultipartEntityBuilder;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.impl.conn.PoolingHttpClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLException;
import javax.net.ssl.TrustManager;
import java.io.File;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.SocketTimeoutException;
import java.net.URI;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @author Nota
 * 2021/9/8 16:09:38
 */
public class HttpUtil {
    private static Logger log = LoggerFactory.getLogger(HttpUtil.class);

    private static int DEFAULT_MAX_PER_ROUTE = 350;

    private static int DEFAULT_SOCKET_MAX_TOTAL = 400;

    public static HttpConfig httpConfig;

    private static volatile CloseableHttpClient closeableHttpClient;

    /**
     * 支持热加载的信任管理器，服务端更换HTTPS证书后更新信任库文件即可自动生效
     */
    private static volatile DynamicTrustManager dynamicTrustManager;

    private static Lock lock = new ReentrantLock();

    private HttpUtil() {
    }

    private static HttpGet getHttpGet(String url, Map<String, String> params, String encode) {
        StringBuilder buf = new StringBuilder(url);
        if (params != null) {
            // 地址增加?或者&
            String flag = (url.indexOf('?') == -1) ? "?" : "&";
            // 添加参数
            for (Map.Entry<String, String> entry : params.entrySet()) {
                buf.append(flag);
                buf.append(entry.getKey());
                buf.append("=");
                try {
                    String param = entry.getValue();
                    if (param == null) {
                        param = "";
                    }
                    buf.append(URLEncoder.encode(param, encode));
                } catch (UnsupportedEncodingException e) {
                    log.error("URLEncoder Error,encode=" + encode + ",param=" + entry.getValue(), e);
                }
                flag = "&";

            }
        }
        return new HttpGet(buf.toString());
    }

    /**
     * 上传文件 post
     *
     * @param url    请求地址
     * @param params 请求参数
     * @param files  请求文件
     * @return HttpPost
     */
    private static HttpPost getHttpPost(String url, Map<String, String> params, Map<String, File> files) {
        HttpPost httpPost = new HttpPost(url);
        MultipartEntityBuilder multipartEntityBuilder = MultipartEntityBuilder.create();
        if (files != null && !files.isEmpty()) {
            for (Map.Entry<String, File> kv : files.entrySet()) {
                multipartEntityBuilder.addBinaryBody(kv.getKey(), kv.getValue());
            }
        }
        if (params != null && !params.isEmpty()) {
            for (Map.Entry<String, String> entry : params.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                multipartEntityBuilder.addTextBody(key, value, ContentType.TEXT_PLAIN.withCharset(RequestConstants.CHARSET_UTF8));
            }
            multipartEntityBuilder.setMode(HttpMultipartMode.RFC6532);
        }
        HttpEntity httpEntity = multipartEntityBuilder.build();
        httpPost.setEntity(httpEntity);
        return httpPost;
    }

    /**
     * post请求(表单格式)
     *
     * @param url    请求路径
     * @param params 请求参数
     * @return HttpPost
     */
    private static HttpPost getHttpPost(String url, Map<String, String> params, String charset) throws UnsupportedEncodingException {
        HttpPost httpPost = new HttpPost(url);
        if (params != null && !params.isEmpty()) {
            List<NameValuePair> list = new ArrayList<>();
            for (Map.Entry<String, String> entry : params.entrySet()) {
                String key = entry.getKey();
                String value = entry.getValue();
                BasicNameValuePair basicNameValuePair = new BasicNameValuePair(key, value);
                list.add(basicNameValuePair);
            }
            UrlEncodedFormEntity httpEntity = new UrlEncodedFormEntity(list, charset);
            httpPost.setEntity(httpEntity);
        }
        return httpPost;
    }

    /**
     * post请求(JSON格式)
     *
     * @param url    请求路径
     * @param jsonBody JSON请求体
     * @return HttpPost
     */
    private static HttpPost getHttpPost(String url, String jsonBody) {
        HttpPost httpPost = new HttpPost(url);
        if (jsonBody != null && !jsonBody.isEmpty()) {
            StringEntity entity = new StringEntity(jsonBody, ContentType.APPLICATION_JSON);
            httpPost.setEntity(entity);
        }
        return httpPost;
    }

    public static HttpInfoRes post(String url, Map<String, String> reqHeader, Map<String, String> params,
                                   Map<String, File> files) throws ApiException {
        try {
            // 初始化httpClient
            CloseableHttpClient httpClient = getHttpClient(httpConfig);
            // 创建http请求 设置请求参数
            HttpPost httpPost;
            if (files == null || files.isEmpty()) {
                httpPost = getHttpPost(url, params, RequestConstants.CHARSET_UTF8);
            } else {
                httpPost = getHttpPost(url, params, files);
            }
            httpPost.setConfig(getRequestConfig(httpConfig));
            return executeHttpRequest(httpClient, httpPost, reqHeader);
        } catch (ApiException e) {
            throw e;
        } catch (Exception e) {
            printStackTrace(e);
            log.error("url=[{}] http请求失败：{}", url, e.getMessage(), e);
            throw new ApiException("请求失败: " + e.getMessage(), e);
        }
    }

    /**
     * post请求(JSON格式)
     *
     * @param url      请求路径
     * @param reqHeader 请求头
     * @param jsonBody JSON请求体
     * @return HttpInfoRes
     * @throws ApiException 异常
     */
    public static HttpInfoRes postJson(String url, Map<String, String> reqHeader, String jsonBody) throws ApiException {
        try {
            CloseableHttpClient httpClient = getHttpClient(httpConfig);
            HttpPost httpPost = getHttpPost(url, jsonBody);
            httpPost.setConfig(getRequestConfig(httpConfig));
            return executeHttpRequest(httpClient, httpPost, reqHeader);
        } catch (ApiException e) {
            throw e;
        } catch (Exception e) {
            printStackTrace(e);
            log.error("url=[{}] http请求失败：{}", url, e.getMessage(), e);
            throw new ApiException("请求失败: " + e.getMessage(), e);
        }
    }

    /**
     * 获取client
     *
     * @param httpConfig http配置
     * @return CloseableHttpClient client
     * @throws ApiException 异常
     */
    public static CloseableHttpClient getHttpClient(HttpConfig httpConfig) throws ApiException {
        if (closeableHttpClient != null) {
            return closeableHttpClient;
        }
        try {
            lock.lock();
            if (closeableHttpClient != null) {
                return closeableHttpClient;
            }
            // 使用支持热加载的DynamicTrustManager构建SSLContext：
            // 服务端更换HTTPS证书后，更新信任库文件即可自动生效，无需重建HttpClient、无需重启应用
            DynamicTrustManager dynamicTm = new DynamicTrustManager(
                    httpConfig == null ? null : httpConfig.getTrustStorePath(),
                    httpConfig == null ? null : httpConfig.getTrustStorePassword());
            SSLContext ctx = SSLContext.getInstance("TLSv1.2");
            if (httpConfig != null && Boolean.TRUE.equals(httpConfig.getTrustAllCerts())) {
                // 信任所有证书（跳过证书链校验），临时止血方案，生产不建议长期开启
                ctx.init(null, new TrustManager[]{new InsecureTrustManager()}, null);
            } else {
                ctx.init(null, new TrustManager[]{dynamicTm}, null);
            }
            dynamicTrustManager = dynamicTm;
            SSLConnectionSocketFactory sslsf = new SSLConnectionSocketFactory(ctx);
            Registry<ConnectionSocketFactory> sfr = RegistryBuilder.<ConnectionSocketFactory>create()
                    .register("http", PlainConnectionSocketFactory.getSocketFactory())
                    .register("https", sslsf)
                    .build();
            PoolingHttpClientConnectionManager connectionManager = new PoolingHttpClientConnectionManager(sfr);
            Integer defaultMaxPerRoute = DEFAULT_MAX_PER_ROUTE;
            Integer defaultSocketMaxTotal = DEFAULT_SOCKET_MAX_TOTAL;
            if (httpConfig != null && httpConfig.getDefaultMaxPerRoute() != null && httpConfig.getDefaultMaxPerRoute() > 0) {
                defaultMaxPerRoute = httpConfig.getDefaultMaxPerRoute();
            }
            if (httpConfig != null && httpConfig.getDefaultSocketMaxTotal() != null && httpConfig.getDefaultSocketMaxTotal() > 0) {
                defaultSocketMaxTotal = httpConfig.getDefaultSocketMaxTotal();
            }
            connectionManager.setDefaultMaxPerRoute(defaultMaxPerRoute);
            connectionManager.setMaxTotal(defaultSocketMaxTotal);
            connectionManager.setValidateAfterInactivity(3000);
            connectionManager.closeExpiredConnections();
            closeableHttpClient = HttpClients.custom().setConnectionManager(connectionManager).build();
        } catch (Exception e) {
            printStackTrace(e);
            log.error("HttpClient生成失败：{}", e.getMessage(), e);
            throw new ApiException("HttpClient生成失败: " + e.getMessage(), e);
        } finally {
            lock.unlock();
        }
        return closeableHttpClient;
    }


    public static HttpInfoRes get(String url, Map<String, String> reqHeader, Map<String, String> params) throws ApiException {
        // 初始化httpClient
        CloseableHttpClient httpClient = getHttpClient(httpConfig);
        // 创建http请求 设置请求参数
        HttpGet httpGet = getHttpGet(url, params, RequestConstants.CHARSET_UTF8);
        // 设置超时时间、代理配置
        httpGet.setConfig(getRequestConfig(httpConfig));
        return executeHttpRequest(httpClient, httpGet, reqHeader);
    }

    public static HttpInfoRes put(String url, Map<String, String> reqHeader, Map<String, String> params,
                                 Map<String, File> files) throws ApiException {
        try {
            CloseableHttpClient httpClient = getHttpClient(httpConfig);
            HttpPut httpPut = new HttpPut(url);
            httpPut.setConfig(getRequestConfig(httpConfig));

            if (files != null && !files.isEmpty()) {
                MultipartEntityBuilder builder = MultipartEntityBuilder.create();
                for (Map.Entry<String, File> entry : files.entrySet()) {
                    builder.addBinaryBody(entry.getKey(), entry.getValue());
                }
                if (params != null) {
                    for (Map.Entry<String, String> entry : params.entrySet()) {
                        builder.addTextBody(entry.getKey(), entry.getValue(),
                            ContentType.TEXT_PLAIN.withCharset(RequestConstants.CHARSET_UTF8));
                    }
                }
                httpPut.setEntity(builder.build());
            } else if (params != null && !params.isEmpty()) {
                List<NameValuePair> formParams = new ArrayList<>();
                for (Map.Entry<String, String> entry : params.entrySet()) {
                    formParams.add(new BasicNameValuePair(entry.getKey(), entry.getValue()));
                }
                httpPut.setEntity(new UrlEncodedFormEntity(formParams, RequestConstants.CHARSET_UTF8));
            }

            return executeHttpRequest(httpClient, httpPut, reqHeader);
        } catch (ApiException e) {
            // 保持上层异常语义（如请求超时）直接透传，避免二次包裹丢失根因
            throw e;
        } catch (Exception e) {
            printStackTrace(e);
            log.error("PUT请求失败 url={}", url, e);
            throw new ApiException("PUT请求失败: " + e.getMessage(), e);
        }
    }

    /**
     * PUT请求(JSON格式)
     *
     * @param url      请求路径
     * @param reqHeader 请求头
     * @param jsonBody JSON请求体
     * @return HttpInfoRes
     * @throws ApiException 异常
     */
    public static HttpInfoRes putJson(String url, Map<String, String> reqHeader, String jsonBody) throws ApiException {
        try {
            CloseableHttpClient httpClient = getHttpClient(httpConfig);
            HttpPut httpPut = new HttpPut(url);
            httpPut.setConfig(getRequestConfig(httpConfig));

            if (jsonBody != null && !jsonBody.isEmpty()) {
                StringEntity entity = new StringEntity(jsonBody, ContentType.APPLICATION_JSON);
                httpPut.setEntity(entity);
            }

            return executeHttpRequest(httpClient, httpPut, reqHeader);
        } catch (ApiException e) {
            // 保持上层异常语义（如请求超时）直接透传，避免二次包裹丢失根因
            throw e;
        } catch (Exception e) {
            printStackTrace(e);
            log.error("PUT请求失败 url={}", url, e);
            throw new ApiException("PUT请求失败: " + e.getMessage(), e);
        }
    }

    public static HttpInfoRes delete(String url, Map<String, String> reqHeader, Map<String, String> params) throws ApiException {
        try {
            CloseableHttpClient httpClient = getHttpClient(httpConfig);
            HttpDelete httpDelete = new HttpDelete(url);
            httpDelete.setConfig(getRequestConfig(httpConfig));

            if (params != null && !params.isEmpty()) {
                String queryString = params.entrySet().stream()
                    .map(entry -> {
                        try {
                            return entry.getKey() + "=" + URLEncoder.encode(entry.getValue(), RequestConstants.CHARSET_UTF8);
                        } catch (UnsupportedEncodingException e) {
                            log.error("参数编码失败", e);
                            return "";
                        }
                    })
                    .filter(s -> !s.isEmpty())
                    .collect(Collectors.joining("&"));

                if (!queryString.isEmpty()) {
                    httpDelete.setURI(URI.create(url + "?" + queryString));
                }
            }

            return executeHttpRequest(httpClient, httpDelete, reqHeader);
        } catch (ApiException e) {
            // 保持上层异常语义（如请求超时）直接透传，避免二次包裹丢失根因
            throw e;
        } catch (Exception e) {
            printStackTrace(e);
            log.error("DELETE请求失败 url={}", url, e);
            throw new ApiException("DELETE请求失败: " + e.getMessage(), e);
        }
    }


    public static HttpInfoRes executeHttpRequest(CloseableHttpClient client, HttpUriRequest request, Map<String, String> reqHeader) throws ApiException {
        CloseableHttpResponse response = null;
        try {
            if (reqHeader != null && !reqHeader.isEmpty()) {
                for (Map.Entry<String, String> entry : reqHeader.entrySet()) {
                    request.addHeader(entry.getKey(), entry.getValue());
                }
            }
            response = client.execute(request);
            reqesutAndResponseLog(request, response);
            return buildHttpInfoRes(response);
        } catch (SocketTimeoutException eto) {
            printStackTrace(eto);
            log.error("请求链接超时：{}", eto.getMessage(), eto);
            throw new ApiException("请求超时: " + eto.getMessage(), eto);
        } catch (Exception e) {
            // 服务端HTTPS证书更换后，静态client中缓存的SSLContext不会重新加载信任证书库，
            // 新建TLS连接时会因信任链校验失败出现PKIX path building failed。
            // PKIX失败发生在TLS握手阶段，HTTP报文尚未发出，重建client并重试一次是安全的。
            if (isSslTrustFailure(e)) {
                log.warn("检测到SSL证书信任异常，重新加载信任库并重试: {}", e.getMessage(), e);
                // SSLContext持有DynamicTrustManager引用，reload后新握手即使用新信任库，
                // 无需重建HttpClient与连接池，直接重试一次
                if (dynamicTrustManager != null) {
                    dynamicTrustManager.reload();
                }
                CloseableHttpClient retryClient = getHttpClient(httpConfig);
                try {
                    response = retryClient.execute(request);
                    reqesutAndResponseLog(request, response);
                    return buildHttpInfoRes(response);
                } catch (Exception retryException) {
                    printStackTrace(retryException);
                    log.error("信任库重载后重试仍失败：{}", retryException.getMessage(), retryException);
                    throw new ApiException("请求失败: " + retryException.getMessage(), retryException);
                }
            }
            printStackTrace(e);
            log.error("executeHttpRequest请求失败：{}", e.getMessage(), e);
            throw new ApiException("请求失败: " + e.getMessage(), e);
        } finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    log.error("CloseableHttpResponse关闭失败：{}", e.getMessage(), e);
                }
            }
        }
    }

    /**
     * 构建响应结果
     *
     * @param response http响应
     * @return HttpInfoRes
     * @throws IOException 读取响应体失败
     */
    private static HttpInfoRes buildHttpInfoRes(CloseableHttpResponse response) throws IOException {
        HttpInfoRes httpInfoRes = HttpInfoRes.getInstance();
        if (response.getEntity() != null) {
            httpInfoRes.setBody(EntityUtils.toString(response.getEntity()));
        }
        setResponseRequestId(response, httpInfoRes);
        httpInfoRes.setHttpStatusCode(response.getStatusLine().getStatusCode());
        return httpInfoRes;
    }

    /**
     * 判断异常链中是否存在SSL证书信任校验失败异常（如PKIX path building failed）
     *
     * @param e 原始异常
     * @return 是否为证书信任失败
     */
    private static boolean isSslTrustFailure(Throwable e) {
        Throwable cause = e;
        while (cause != null) {
            if (cause instanceof SSLException) {
                String message = cause.getMessage();
                if (message != null && (message.contains("PKIX")
                        || message.contains("unable to find valid certification path")
                        || message.contains("certificate_unknown")
                        || message.contains("certificate verify failed"))) {
                    return true;
                }
            }
            cause = cause.getCause();
        }
        return false;
    }

    /**
     * 打印异常堆栈到标准错误流。
     * 调用方环境日志框架未配置时（如无log4j配置），log.error不会产生任何输出，
     * 此处兜底直接打印，确保请求失败时异常堆栈始终可见，便于排查PKIX等问题。
     *
     * @param e 异常
     */
    private static void printStackTrace(Throwable e) {
        e.printStackTrace();
    }

    /**
     * 重建HttpClient。
     * 服务端HTTPS证书更换后，旧client的SSLContext不会重新加载信任证书库，
     * 更新cacerts后调用本方法可免重启恢复，也可用于定时主动刷新。
     */
    public static void refreshHttpClient() {
        refreshHttpClient(closeableHttpClient);
    }

    /**
     * 重建指定引用的HttpClient。
     * 仅当当前单例引用与传入引用一致时才关闭重建，避免并发重建时误关闭新client。
     *
     * @param oldClient 需要重建的client引用
     */
    private static void refreshHttpClient(CloseableHttpClient oldClient) {
        lock.lock();
        try {
            if (oldClient == null || closeableHttpClient != oldClient) {
                // 已被其他线程重建，无需处理
                return;
            }
            closeableHttpClient = null;
            try {
                oldClient.close();
                log.info("旧HttpClient已关闭，重建后将重新加载信任证书库");
            } catch (IOException e) {
                log.warn("旧HttpClient关闭失败：{}", e.getMessage(), e);
            }
        } finally {
            lock.unlock();
        }
    }

    /**
     * 设置响应requestId
     * @param response
     * @param httpInfoRes
     */
    private static void setResponseRequestId(CloseableHttpResponse response, HttpInfoRes httpInfoRes) {
        Header[] responseHeaders = response.getHeaders(RequestConstants.FDD_REQEUST_ID);
        if (responseHeaders != null && responseHeaders.length > 0) {
            httpInfoRes.setRequestId(responseHeaders[0].getValue());
        }
    }

    /**
     * 下载文件
     *
     * @param url       请求路径
     * @param reqHeader 请求头
     * @param params    请求参数
     * @return ApiResponseEntity
     * @throws ApiException 异常
     */
    public static BaseResponseEntity downLoadFiles(String url, Map<String, String> reqHeader, Map<String, String> params) throws ApiException {
        BaseResponseEntity entity = new BaseResponseEntity();

        CloseableHttpResponse response = null;
        // 初始化httpClient
        CloseableHttpClient httpClient = getHttpClient(httpConfig);
        try {
            // 创建http请求 设置请求参数
            HttpPost httpPost = getHttpPost(url, params, RequestConstants.CHARSET_UTF8);
            if (reqHeader != null) {
                for (Entry<String, String> entry : reqHeader.entrySet()) {
                    httpPost.addHeader(entry.getKey(), entry.getValue());
                }
            }
            httpPost.setConfig(getRequestConfig(httpConfig));
            response = httpClient.execute(httpPost);
            reqesutAndResponseLog(httpPost, response);
            entity.setHttpStatusCode(response.getStatusLine().getStatusCode());
            HttpEntity respEntity = response.getEntity();
            Header contentType = respEntity.getContentType();

            if (contentType.getValue().contains(ContentType.APPLICATION_JSON.getMimeType())) {
                entity.setData(EntityUtils.toString(respEntity));
            } else {
                byte[] bytes = EntityUtils.toByteArray(response.getEntity());
                entity.setContent(bytes);
                entity.setContentType(contentType.getValue());
            }
        } catch (Exception e) {
            printStackTrace(e);
            log.error("文件下载失败：{}", e.getMessage(), e);
            throw new ApiException("文件下载失败: " + e.getMessage(), e);
        } finally {
            if (response != null) {
                try {
                    response.close();
                } catch (IOException e) {
                    log.error("CloseableHttpResponse关闭失败：{}", e.getMessage(), e);
                }
            }
        }

        return entity;
    }


    /**
     * 请求响应日志打印
     *
     * @param request  请求
     * @param response 响应
     */
    private static void reqesutAndResponseLog(HttpUriRequest request, HttpResponse response) {
        String requestId = "";
        String nonce = "";
        String url = "";
        // 请求url
        URI uri = request.getURI();
        if (uri != null) {
            // log.info("request url = [{}]", uri.toString());
            url = uri.toString();
        }
        // 获取请求头里面的nonce
        Header[] requestHeaders = request.getHeaders(RequestConstants.NONCE);
        if (requestHeaders != null && requestHeaders.length > 0) {
            //log.info("request header {}= [{}]", RequestConstants.NONCE, requestHeaders[0].getValue());
            nonce = requestHeaders[0].getValue();
        }

        // 获取响应头里面的requestId
        Header[] responseHeaders = response.getHeaders(RequestConstants.FDD_REQEUST_ID);
        if (responseHeaders != null && responseHeaders.length > 0) {
            //  log.info("response header {}= [{}]", RequestConstants.FDD_REQEUST_ID, responseHeaders[0].getValue());
            requestId = responseHeaders[0].getValue();
        }
        log.info("request url:{},request header {}= [{}], response header {}= [{}]", url, RequestConstants.NONCE, nonce, RequestConstants.FDD_REQEUST_ID, requestId);
    }

    /**
     * 设置超时时间和代理
     *
     * @return 请求配置
     */
    private static RequestConfig getRequestConfig(HttpConfig httpConfig) {
        RequestConfig.Builder custom = RequestConfig.custom();
        if (httpConfig != null) {
            if (httpConfig.getReadTimeout() != null) {
                custom.setSocketTimeout(httpConfig.getReadTimeout());
            }
            if (httpConfig.getConnectTimeout() != null) {
                custom.setConnectTimeout(httpConfig.getConnectTimeout());
            }
            // 设置代理
            if (Boolean.TRUE.equals(httpConfig.getProxyFlag())) {
                HttpHost proxy = new HttpHost(httpConfig.getProxyHost(), httpConfig.getProxyPort(), "http");
                custom.setProxy(proxy);
            }
        }
        return custom.build();
    }

    /**
     * 信任所有证书的TrustManager实现。
     * 仅当 HttpConfig.trustAllCerts=true 时启用，跳过证书链校验。
     * 会引入中间人攻击风险，仅用于第三方证书更换、信任库暂未就绪时的临时止血。
     */
    private static class InsecureTrustManager implements javax.net.ssl.X509TrustManager {
        @Override
        public void checkClientTrusted(java.security.cert.X509Certificate[] chain, String authType) {
        }

        @Override
        public void checkServerTrusted(java.security.cert.X509Certificate[] chain, String authType) {
        }

        @Override
        public java.security.cert.X509Certificate[] getAcceptedIssuers() {
            return new java.security.cert.X509Certificate[0];
        }
    }
}
