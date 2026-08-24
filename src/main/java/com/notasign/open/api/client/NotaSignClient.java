package com.notasign.open.api.client;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.base.ApiResponse;
import com.notasign.open.api.bean.base.BaseResp;
import com.notasign.open.api.bean.base.BaseResponseEntity;
import com.notasign.open.api.exception.ApiException;

/**
 * 通用信封客户端，使用参数绑定返回类方式
 */
public class NotaSignClient extends OpenApiClient {

    private final String userCode;

    public NotaSignClient(String appId, String appSecret, String serverUrl, String userCode) {
        super(appId, appSecret, serverUrl);
        this.userCode = userCode;
    }

    public <T extends BaseResp> ApiResponse<T> execute(BaseReq<T> req) throws ApiException {
        return this.invokeApi(req, req.getApi(), req.getRespClass());
    }

    /**
     * 执行文件下载请求（如下载批量发送清单模板）。
     * <p>
     * 响应为文件流而非JSON，文件内容见 {@link BaseResponseEntity#getContent()}，
     * 内容类型见 {@link BaseResponseEntity#getContentType()}。
     *
     * @param req 请求实体
     * @return ApiResponse，data 为文件流实体
     * @throws ApiException API异常
     */
    public ApiResponse<BaseResponseEntity> executeDownload(BaseReq<?> req) throws ApiException {
        return this.invokeApiDownload(req, req.getApi());
    }


}
