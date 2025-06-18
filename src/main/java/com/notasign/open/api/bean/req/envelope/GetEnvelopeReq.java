package com.notasign.open.api.bean.req.envelope;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.resp.envelope.EnvelopeDetailResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * @author FADADA
 * @date 2025/6/12 18:44
 */
public class GetEnvelopeReq extends BaseReq<EnvelopeDetailResp> {

    @JsonIgnore
    private String envelopeId;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    @Override
    public Class<EnvelopeDetailResp> getRespClass() {
        return EnvelopeDetailResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.GET_ENVELOPE_DETAIL, envelopeId);
    }
}
