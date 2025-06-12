package com.notasign.open.api.bean.req.envelope;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * @author FADADA
 * @date 2025/6/4 09:34
 */
public class CancelEnvelopeReq extends BaseReq<Void> {

    @JsonIgnore
    private String envelopeId;

    private String reason;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public Class<Void> getRespClass() {
        return Void.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.REVOKE_ENVELOPE, envelopeId);
    }
}
