package com.notasign.open.api.req.intesi;


import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.intesi.GetCredentialResp;

/**
 * @author fadada
 * @date 2025/10/13 15:21
 */
public class GetCredentialReq extends BaseReq<GetCredentialResp> {

    private String tspUserId;
    public String getTspUserId() {
        return tspUserId;
    }

    public void setTspUserId(String tspUserId) {
        this.tspUserId = tspUserId;
    }

    @Override
    public Class<GetCredentialResp> getRespClass() {
        return GetCredentialResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.GET_CREDENTIAL;
    }
}
