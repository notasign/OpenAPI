package com.notasign.open.api.bean.resp.document;


import com.notasign.open.api.bean.base.BaseResp;

public class UploadFileResp extends BaseResp {

    private String fddFileUrl;

    public String getFddFileUrl() {
        return fddFileUrl;
    }

    public void setFddFileUrl(String fddFileUrl) {
        this.fddFileUrl = fddFileUrl;
    }
}
