package com.notasign.open.api.req.envelope;


import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.resp.envelope.GetEnvelopeEditUrlResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * @author Nota
 * @date 2025/6/5 19:54
 */
public class GetEnvelopeEditUrlReq extends BaseReq<GetEnvelopeEditUrlResp> {

    private String envelopeId;

    private String redirectUrl;

    @Override
    public Class<GetEnvelopeEditUrlResp> getRespClass() {
        return GetEnvelopeEditUrlResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.GET_ENVELOPE_EDIT_URL;
    }

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
}
