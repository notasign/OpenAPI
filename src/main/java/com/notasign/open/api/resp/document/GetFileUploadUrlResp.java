package com.notasign.open.api.resp.document;


import com.notasign.open.api.bean.base.BaseResp;

public class GetFileUploadUrlResp extends BaseResp {

    private String fileUrl;

    private String fileUploadUrl;

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    public String getFileUploadUrl() {
        return fileUploadUrl;
    }

    public void setFileUploadUrl(String fileUploadUrl) {
        this.fileUploadUrl = fileUploadUrl;
    }
}
