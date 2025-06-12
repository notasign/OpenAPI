package com.notasign.open.api.bean.resp.document;


import com.notasign.open.api.bean.base.BaseResp;

public class GetFileUploadUrlResp extends BaseResp {

    private String fddFileUrl;

    private String uploadUrl;

    public String getFddFileUrl() {
        return fddFileUrl;
    }

    public void setFddFileUrl(String fddFileUrl) {
        this.fddFileUrl = fddFileUrl;
    }

    public String getUploadUrl() {
        return uploadUrl;
    }

    public void setUploadUrl(String uploadUrl) {
        this.uploadUrl = uploadUrl;
    }
}
