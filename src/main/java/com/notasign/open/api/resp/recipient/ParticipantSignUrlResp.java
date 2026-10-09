package com.notasign.open.api.resp.recipient;


import com.notasign.open.api.bean.base.BaseResp;

/**
 * @author Nota
 * @date 2025/6/4 15:56
 */
public class ParticipantSignUrlResp extends BaseResp {

    private String signUrl;

    private String signShortUrl;

    /**
     * 是否允许多次盖章
     */
    private Boolean stampAllowMultiple;

    public Boolean getStampAllowMultiple() {
        return stampAllowMultiple;
    }

    public void setStampAllowMultiple(Boolean stampAllowMultiple) {
        this.stampAllowMultiple = stampAllowMultiple;
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
