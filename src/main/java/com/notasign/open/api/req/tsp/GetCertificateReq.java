package com.notasign.open.api.req.tsp;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.tsp.GetCertificateResp;

/**
 * 根据证书ID获取证书信息请求
 */
public class GetCertificateReq extends BaseReq<GetCertificateResp> {

    private String credentialId;

    public String getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(String credentialId) {
        this.credentialId = credentialId;
    }

    @Override
    public Class<GetCertificateResp> getRespClass() {
        return GetCertificateResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.GET_CERTIFICATE;
    }
}
