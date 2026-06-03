package com.notasign.open.api.resp.envelope;

import com.notasign.open.api.bean.base.BaseResp;

/**
 * 信封更正状态响应
 */
public class EnvelopeCorrectionStatusResp extends BaseResp {

    private String envelopeId;
    private String status;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
