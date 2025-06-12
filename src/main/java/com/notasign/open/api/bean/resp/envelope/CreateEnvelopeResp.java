package com.notasign.open.api.bean.resp.envelope;


import com.notasign.open.api.bean.base.BaseResp;

/**
 * @author FADADA
 * @date 2025/5/22 17:36
 */
public class CreateEnvelopeResp extends BaseResp {

    private String envelopeId;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }
}
