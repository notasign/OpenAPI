package com.notasign.open.api.bean.resp.document;


import com.notasign.open.api.bean.base.BaseResp;

public class UploadFileResp extends BaseResp {

    private String fileUrl;

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }
}
