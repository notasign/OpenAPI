package com.notasign.open.api.client;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.base.ApiResponse;
import com.notasign.open.api.bean.base.BaseResponseEntity;
import com.notasign.open.api.bean.base.HttpInfoRes;
import com.notasign.open.api.config.HttpConfig;
import com.notasign.open.api.constants.RequestConstants;
import com.notasign.open.api.enums.http.SignTypeEnum;
import com.notasign.open.api.exception.ApiException;
import com.notasign.open.api.stratey.DefaultJsonStrategy;
import com.notasign.open.api.stratey.JsonStrategy;
import com.notasign.open.api.utils.crypt.NotaCryptUtil;
import com.notasign.open.api.utils.http.HttpUtil;
import com.notasign.open.api.utils.json.ParameterizedTypeBaseRes;
import com.notasign.open.api.utils.random.UUIDGenerator;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Nota
 * 2021/9/8 16:09:38
 */
public abstract class OpenApiClient {

    private final Logger log = LoggerFactory.getLogger(OpenApiClient.class);


    private final String appId;
    private final String privateKey;
    private final String serverUrl;

    /**
     * 请求服务端签名加密方式，目前仅支持HMAC-SHA256，请勿修改
     */
    private String signType = SignTypeEnum.RSA_SHA256.getType();

    /**
     * json串策率
     */
    private JsonStrategy jsonStrategy;

    /**
     * http配置
     */
    private HttpConfig httpConfig;

    public OpenApiClient(String appId, String privateKey, String serverUrl) {
        this.appId = appId;
        this.privateKey = privateKey;
        this.serverUrl = serverUrl;
    }

    public HttpConfig getHttpConfig() {
        return httpConfig;
    }

    public void setHttpConfig(HttpConfig httpConfig) {
        if (httpConfig != null) {
            this.httpConfig = httpConfig;
            HttpUtil.httpConfig = this.httpConfig;
        }
    }

    public String getSignType() {
        return signType;
    }

    public void setSignType(String signType) {
        if (signType != null) {
            this.signType = signType;
        }
    }

    public void setJsonStrategy(JsonStrategy jsonStrategy) {
        if (jsonStrategy != null) {
            this.jsonStrategy = jsonStrategy;
        }
    }

    public JsonStrategy getJsonStrategy() {
        if (this.jsonStrategy == null) {
            this.jsonStrategy = new DefaultJsonStrategy();
        }
        return this.jsonStrategy;
    }

    public String getAppId() {
        return appId;
    }

    public String getPrivateKey() {
        return privateKey;
    }

    /**
     * 根据请求返回实体类
     *
     * @param req  请求实体
     * @param path 请求路径
     * @param clzz 指定响应实体类
     * @param <T>  响应实体泛型
     * @return BaseRsp
     * @throws ApiException API异常
     */
    <T> ApiResponse<T> invokeApi(BaseReq req, String path, Class<T> clzz) throws ApiException {
        return this.httpRequest(req, path, null, clzz);
    }


    /**
     * 根据请求返回实体类
     *
     * @param req  请求实体
     * @param path 请求路径
     * @param clzz 指定响应实体类
     * @param <T>  响应实体泛型
     * @return BaseRsp
     * @throws ApiException API异常
     */
    <T> ApiResponse<List<T>> invokeApiList(BaseReq req, String path, Class<T> clzz) throws ApiException {
        return this.httpRequestList(req, path, clzz);
    }


    /**
     * 上传文件返回实体类
     *
     * @param req   请求实体
     * @param path  请求路径
     * @param files 请求文件
     * @param clzz  指定响应实体类
     * @param <T>   响应实体泛型
     * @return BaseRsp
     * @throws ApiException API异常
     */
    <T> ApiResponse<T> invokeApi(BaseReq req, String path, Map<String, File> files, Class<T> clzz) throws ApiException {
        return httpRequest(req, path, files, clzz);
    }

    /**
     * 下载返回对应实体类
     *
     * @param req  请求实体
     * @param path 请求路径
     * @return BaseRes
     * @throws ApiException API异常
     */
    ApiResponse<BaseResponseEntity> invokeApiDownload(BaseReq req, String path) throws ApiException {
        String accessToken = req.getAccessToken();
        String method = getMethod(path);
        path = path.replace(method, "").trim();
        String url = serverUrl + path;

        Map<String, String> bodyMap = getBodyMap(req, method);
        Map<String, String> headerMap = getSign(getHeaderMap(accessToken, path), bodyMap, method);

        BaseResponseEntity baseResponseEntity = request(url, headerMap, bodyMap);
        ApiResponse<BaseResponseEntity> res;

        if (baseResponseEntity.getData() != null) {
            res = getJsonStrategy().toJavaBean(baseResponseEntity.getData(), ApiResponse.class);
        } else {
            res = new ApiResponse();
            res.setData(baseResponseEntity);
        }
        res.setHttpStatusCode(baseResponseEntity.getHttpStatusCode());
        return res;
    }

    private <T> ApiResponse<List<T>> httpRequestList(BaseReq req, String path, Class<T> clzz)
            throws ApiException {
        HttpInfoRes httpInfoRes = this.httpRequest(req, path, null);
        if (httpInfoRes == null) {
            return null;
        }

        ApiResponse apiResponse = getJsonStrategy().toJavaBean(httpInfoRes.getBody(), ApiResponse.class);
        apiResponse.setHttpStatusCode(httpInfoRes.getHttpStatusCode());
        Object data = apiResponse.getData();
        if (data != null) {
            String jsonStr;
            if (data instanceof String) {
                jsonStr = String.valueOf(data);
            } else {
                jsonStr = getJsonStrategy().toJson(data);
            }
            List<T> lists = getJsonStrategy().toList(jsonStr, clzz);
            apiResponse.setData(lists);
        }
        return apiResponse;
    }

    private <T> ApiResponse<T> httpRequest(BaseReq req, String path, Map<String, File> files, Class<T> clzz)
            throws ApiException {
        HttpInfoRes httpInfoRes = this.httpRequest(req, path, files);
        if (httpInfoRes == null) {
            return null;
        }
        ApiResponse<T> apiResponse = getJsonStrategy().toJavaBean(httpInfoRes.getBody(), new ParameterizedTypeBaseRes(clzz));
        apiResponse.setHttpStatusCode(httpInfoRes.getHttpStatusCode());
        apiResponse.setRequestId(httpInfoRes.getRequestId());
        return apiResponse;
    }

    private HttpInfoRes httpRequest(BaseReq req, String path, Map<String, File> files) throws ApiException {
        String accessToken = req == null ? null : req.getAccessToken();
        String method = getMethod(path);
        path = path.replace(method, "").trim();
        String url = serverUrl + path;
        HashMap<String, String> bodyMap = getBodyMap(req, method);
        Map<String, String> headerMap = getSign(getHeaderMap(accessToken, path), bodyMap, method);
        return request(url, method, headerMap, bodyMap, files);
    }

    private String getMethod(String path) {
        String method;
        if (path.startsWith(RequestConstants.METHOD_POST)) {
            method = RequestConstants.METHOD_POST;
        } else if (path.startsWith(RequestConstants.METHOD_GET)) {
            method = RequestConstants.METHOD_GET;
        } else if (path.startsWith(RequestConstants.METHOD_PUT)) {
            method = RequestConstants.METHOD_PUT;
        } else if (path.startsWith(RequestConstants.METHOD_DELETE)) {
            method = RequestConstants.METHOD_DELETE;
        } else {
            throw new IllegalArgumentException("path值非法");
        }
        return method;
    }


    private Map<String, String> getSign(Map<String, String> headerMap, Map<String, String> bodyMap, String method) {
        try {
            Map<String, String> signMap = new HashMap<>(headerMap);

            if (bodyMap != null && !bodyMap.isEmpty()) {
                if (RequestConstants.METHOD_POST.equals(method) || RequestConstants.METHOD_PUT.equals(method)) {
                    signMap.putAll(bodyMap);
                } else {
                    signMap.put(RequestConstants.DATA_KEY, NotaCryptUtil.sortParameters(bodyMap));
                }
            }

            String sortParam = NotaCryptUtil.sortParameters(signMap);
            String sign = NotaCryptUtil.sign(sortParam, privateKey);
            headerMap.put(RequestConstants.SIGN, sign);
            log.debug("签名计算成功，method: {}, bodyMap size: {}", method, bodyMap != null ? bodyMap.size() : 0);
        } catch (Exception e) {
            log.error("计算签名失败 - method: {}, bodyMap: {}, error: {}",
                     method, bodyMap, e.getMessage(), e);
        }
        return headerMap;
    }

    private HashMap<String, String> getHeaderMap(String accessToken, String reuqestUrl) {
        HashMap<String, String> paraMap = new HashMap();
        paraMap.put(RequestConstants.APP_ID, appId);
        paraMap.put(RequestConstants.API_SUB_VERSION, RequestConstants.CURRENT_SUB_VERSION);
        paraMap.put(RequestConstants.SIGN_TYPE, signType);
        if (accessToken != null) {
            paraMap.put(RequestConstants.ACCESS_TOKEN, accessToken);
            paraMap.remove(RequestConstants.DATA_KEY);
        } else {
            paraMap.remove(RequestConstants.DATA_KEY);
        }
        paraMap.put(RequestConstants.TIMESTAMP, String.valueOf(System.currentTimeMillis()));
        paraMap.put(RequestConstants.NONCE, UUIDGenerator.getUuid());
        paraMap.put(RequestConstants.REQUEST_URL, reuqestUrl);
        return paraMap;
    }

    private HashMap<String, String> getBodyMap(BaseReq req, String method) throws ApiException {
        HashMap<String, String> bodyMap = new HashMap<>();
        if (req == null) {
            return bodyMap;
        }

        req.setAccessToken(null);
        String bizContent = getJsonStrategy().toJson(req);

        if (RequestConstants.METHOD_POST.equals(method) || RequestConstants.METHOD_PUT.equals(method)) {
            bodyMap.put(RequestConstants.DATA_KEY, bizContent);
            return bodyMap;
        }

        // 确保所有value都转换为String类型
        Map<String, Object> rawMap = getJsonStrategy().toJavaBean(bizContent, Map.class);
        if (rawMap != null) {
            for (Map.Entry<String, Object> entry : rawMap.entrySet()) {
                bodyMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
        }
        return bodyMap;
    }


    private HttpInfoRes request(String url, String method, Map<String, String> headerMap, Map<String, String> bodyMap, Map<String, File> fileMap) throws ApiException {
        try {
            switch (method) {
                case RequestConstants.METHOD_GET:
                    return HttpUtil.get(url, headerMap, bodyMap);
                case RequestConstants.METHOD_POST:
                    return HttpUtil.postJson(url, headerMap,
                            bodyMap != null ? bodyMap.get(RequestConstants.DATA_KEY) : null);
                case RequestConstants.METHOD_PUT:
                    return HttpUtil.putJson(url, headerMap,
                            bodyMap != null ? bodyMap.get(RequestConstants.DATA_KEY) : null);
                case RequestConstants.METHOD_DELETE:
                    return HttpUtil.delete(url, headerMap, bodyMap);
                default:
                    log.error("不支持的HTTP方法: {}", method);
                    throw new ApiException("不支持的HTTP方法: " + method);
            }
        } catch (ApiException e) {
            log.error("API请求失败 - method: {}, url: {}, error: {}", method, url, e.getMessage(), e);
            throw e;
        } catch (Exception e) {
            log.error("HTTP请求异常 - method: {}, url: {}, error: {}", method, url, e.getMessage(), e);
            throw new ApiException("HTTP请求异常: " + e.getMessage());
        }
    }


    private BaseResponseEntity request(String url, Map<String, String> headerMap, Map<String, String> bodyMap) throws ApiException {
        try {
            return HttpUtil.downLoadFiles(url, headerMap, bodyMap);
        } catch (ApiException e) {
            // HttpUtil已携带原始异常根因，直接透传避免二次包裹丢失
            throw e;
        } catch (Exception e) {
            e.printStackTrace();
            log.error("httpDownLoad请求失败：{}", e.getMessage(), e);
            throw new ApiException("httpDownLoad请求失败: " + e.getMessage(), e);
        }
    }

}
