package com.notasign.open.api.bean.resp.envelope;


import com.notasign.open.api.bean.base.BaseResp;

/**
 * @author FADADA
 * @date 2025/6/4 14:40
 */
public class GetEnvelopeDownloadResp extends BaseResp {

    private String downloadUrl;

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}
