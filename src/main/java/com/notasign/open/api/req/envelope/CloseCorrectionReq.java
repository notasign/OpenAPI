package com.notasign.open.api.req.envelope;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.resp.envelope.EnvelopeCorrectionStatusResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * 关闭信封更正请求
 */
public class CloseCorrectionReq extends BaseReq<EnvelopeCorrectionStatusResp> {

    @JsonIgnore
    private String envelopeId;

    private Boolean saveChanges;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public Boolean getSaveChanges() {
        return saveChanges;
    }

    public void setSaveChanges(Boolean saveChanges) {
        this.saveChanges = saveChanges;
    }

    @Override
    public Class<EnvelopeCorrectionStatusResp> getRespClass() {
        return EnvelopeCorrectionStatusResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.CLOSE_CORRECTION, envelopeId);
    }
}
