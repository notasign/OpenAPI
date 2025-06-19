package com.notasign.open.api.resp.envelope;


import com.notasign.open.api.bean.base.BaseResp;

/**
 * @author FADADA
 * @date 2025/6/5 19:56
 */
public class GetEnvelopeEditUrlResp extends BaseResp {

    private String editUrl;

    public String getEditUrl() {
        return editUrl;
    }

    public void setEditUrl(String editUrl) {
        this.editUrl = editUrl;
    }
}
