package com.notasign.open.api.client;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.base.ApiResponse;
import com.notasign.open.api.bean.base.BaseResp;
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


}
