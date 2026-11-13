package com.notasign.open.api.req.envelope;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.base.EmptyResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * @author Nota
 * @date 2025/6/12 18:44
 */
public class SendEnvelopeReq extends BaseReq<EmptyResp> {

    @JsonIgnore
    private String envelopeId;

    /**
     * 自由签署模式：allow-允许，disallow-不允许
     */
    private String freeformSigningMode;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getFreeformSigningMode() {
        return freeformSigningMode;
    }

    public void setFreeformSigningMode(String freeformSigningMode) {
        this.freeformSigningMode = freeformSigningMode;
    }

    @Override
    public Class<EmptyResp> getRespClass() {
        return EmptyResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.PUBLISH_ENVELOPE, envelopeId);
    }
}
