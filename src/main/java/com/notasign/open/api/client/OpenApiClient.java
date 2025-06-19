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
import com.notasign.open.api.utils.crypt.FddCryptUtil;
import com.notasign.open.api.utils.http.HttpUtil;
import com.notasign.open.api.utils.json.ParameterizedTypeBaseRes;
import com.notasign.open.api.utils.random.UUIDGenerator;
import org.apache.commons.codec.binary.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @author Nota
 * 2021/9/8 16:09:38
 */
public abstract class OpenApiClient {

    private final Logger log = LoggerFactory.getLogger(OpenApiClient.class);


    private final String appId;
    private final String appSecret;
    private final String serverUrl;

    /**
     * 请求服务端签名加密方式，目前仅支持HMAC-SHA256，请勿修改
     */
    private String signType = SignTypeEnum.HMAC_SHA256.getType();

    /**
     * json串策率
     */
    private JsonStrategy jsonStrategy;

    /**
     * http配置
     */
    private HttpConfig httpConfig;

    public OpenApiClient(String appId, String appSecret, String serverUrl) {
        this.appId = appId;
        this.appSecret = appSecret;
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

    public String getAppSecret() {
        return appSecret;
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
        Map<String, String> bodyMap = getBodyMap(req, method);
        Map<String, String> headerMap = getSign(getHeaderMap(accessToken), bodyMap);
        path = path.replace(method, "").trim();
        String url = serverUrl + path;

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
        return apiResponse;
    }

    private HttpInfoRes httpRequest(BaseReq req, String path, Map<String, File> files) throws ApiException {
        String accessToken = req == null ? null : req.getAccessToken();
        String method = getMethod(path);
        HashMap<String, String> bodyMap = getBodyMap(req, method);
        Map<String, String> headerMap = getSign(getHeaderMap(accessToken), bodyMap);
        path = path.replace(method, "").trim();
        String url = serverUrl + path;
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


    private Map<String, String> getSign(Map<String, String> headerMap, Map<String, String> bodyMap) {
        try {
            Map<String, String> signMap = new HashMap(headerMap);
            if (null != bodyMap) {
                signMap.putAll(bodyMap);
            }
            String sortParam = FddCryptUtil.sortParameters(signMap);
            String sign = FddCryptUtil.sign(sortParam, headerMap.get(RequestConstants.TIMESTAMP), appSecret);
            headerMap.put(RequestConstants.SIGN, sign);
        } catch (Exception e) {
            log.error("计算签名失败：{}", e.getMessage(), e);
        }
        return headerMap;
    }


    private HashMap<String, String> getHeaderMap(String accessToken) {
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
        return paraMap;


    }

    private HashMap<String, String> getBodyMap(BaseReq req, String method) throws ApiException {
        if (req == null) {
            return new HashMap<>();
        }
        String bizContent;
        req.setAccessToken(null);
        bizContent = getJsonStrategy().toJson(req);

        HashMap<String, String> bodyMap = new HashMap(1);

        if (RequestConstants.METHOD_POST.equals(method) || RequestConstants.METHOD_PUT.equals(method)) {
            bodyMap.put(RequestConstants.DATA_KEY, bizContent);
        } else {
            bodyMap = (HashMap<String, String>) getJsonStrategy().toJavaBean(bizContent, Map.class);
        }
        return bodyMap;
    }


    private HttpInfoRes request(String url, String method, Map<String, String> headerMap, Map<String, String> bodyMap, Map<String, File> fileMap) throws ApiException {
        try {
            if (RequestConstants.METHOD_GET.equals(method)) {
                return HttpUtil.get(url, headerMap, bodyMap);
            } else if (RequestConstants.METHOD_POST.equals(method)) {
                return HttpUtil.postJson(url, headerMap, bodyMap.get(RequestConstants.DATA_KEY));
            } else if (RequestConstants.METHOD_PUT.equals(method)) {
                return HttpUtil.putJson(url, headerMap, bodyMap.get(RequestConstants.DATA_KEY));
            } else if (RequestConstants.METHOD_DELETE.equals(method)) {
                return HttpUtil.delete(url, headerMap, bodyMap);
            }
            return null;
        } catch (ApiException apie) {
            throw apie;
        } catch (Exception e) {
            log.error("http请求失败：{}", e.getMessage(), e);
            throw new ApiException("http请求失败");
        }
    }


    private BaseResponseEntity request(String url, Map<String, String> headerMap, Map<String, String> bodyMap) throws ApiException {
        try {
            return HttpUtil.downLoadFiles(url, headerMap, bodyMap);
        } catch (Exception e) {
            log.error("httpDownLoad请求失败：{}", e.getMessage(), e);
            throw new ApiException("httpDownLoad请求失败");
        }
    }

}
