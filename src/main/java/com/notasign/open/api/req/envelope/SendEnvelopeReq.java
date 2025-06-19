package com.notasign.open.api.req.envelope;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * @author Nota
 * @date 2025/6/12 18:44
 */
public class SendEnvelopeReq extends BaseReq<Void> {

    @JsonIgnore
    private String envelopeId;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    @Override
    public Class<Void> getRespClass() {
        return Void.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.PUBLISH_ENVELOPE, envelopeId);
    }
}
