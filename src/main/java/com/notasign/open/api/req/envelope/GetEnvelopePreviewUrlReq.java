package com.notasign.open.api.req.envelope;


import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.envelope.GetEnvelopePreviewUrlResp;

/**
 * @author fadada
 * @date 2025/6/5 19:54
 */

public class GetEnvelopePreviewUrlReq extends BaseReq<GetEnvelopePreviewUrlResp> {

    private String envelopeId;
    private String redirectUrl;

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

    @Override
    public Class<GetEnvelopePreviewUrlResp> getRespClass() {
        return GetEnvelopePreviewUrlResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.GET_ENVELOPE_PREVIEW_URL;
    }
}
