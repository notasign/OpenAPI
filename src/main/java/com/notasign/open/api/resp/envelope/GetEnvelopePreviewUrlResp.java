package com.notasign.open.api.resp.envelope;


import com.notasign.open.api.bean.base.BaseResp;

/**
 * @author fadada
 * @date 2025/6/5 19:56
 */
public class GetEnvelopePreviewUrlResp extends BaseResp {

    private String previewUrl;

    public String getPreviewUrl() {
        return previewUrl;
    }

    public void setPreviewUrl(String previewUrl) {
        this.previewUrl = previewUrl;
    }
}
