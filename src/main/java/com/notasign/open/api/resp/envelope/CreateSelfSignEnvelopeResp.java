package com.notasign.open.api.resp.envelope;

import com.notasign.open.api.bean.base.BaseResp;

/**
 * @author Nota
 * @date 2025/5/22 17:36
 */
public class CreateSelfSignEnvelopeResp extends BaseResp {

    private String envelopeId;

    private String signUrl;

    private String signShortUrl;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getSignUrl() {
        return signUrl;
    }

    public void setSignUrl(String signUrl) {
        this.signUrl = signUrl;
    }

    public String getSignShortUrl() {
        return signShortUrl;
    }

    public void setSignShortUrl(String signShortUrl) {
        this.signShortUrl = signShortUrl;
    }
}
