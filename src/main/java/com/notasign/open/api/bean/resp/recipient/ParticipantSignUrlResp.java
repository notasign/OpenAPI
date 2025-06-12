package com.notasign.open.api.bean.resp.recipient;


/**
 * @author FADADA
 * @date 2025/6/4 15:56
 */
public class ParticipantSignUrlResp {

    private String signUrl;

    private String signShortUrl;

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
