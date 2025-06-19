package com.notasign.open.api.req.accesstoken;


import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.resp.accesstoken.GetAccessTokenResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * @author FADADA
 * @date 2025/6/4 18:40
 */
public class AccessTokenReq extends BaseReq<GetAccessTokenResp> {

    private String grantType;

    private String assertion;

    public String getGrantType() {
        return grantType;
    }

    public void setGrantType(String grantType) {
        this.grantType = grantType;
    }

    public String getAssertion() {
        return assertion;
    }

    public void setAssertion(String assertion) {
        this.assertion = assertion;
    }

    @Override
    public Class<GetAccessTokenResp> getRespClass() {
        return GetAccessTokenResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.SERVICE_GET_ACCESS_TOKEN;
    }
}
