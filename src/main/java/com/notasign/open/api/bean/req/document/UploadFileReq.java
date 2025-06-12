package com.notasign.open.api.bean.req.document;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.resp.document.UploadFileResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

public class UploadFileReq extends BaseReq<UploadFileResp> {

    private String fileType;
    private String fileUrl;

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileUrl() {
        return fileUrl;
    }

    public void setFileUrl(String fileUrl) {
        this.fileUrl = fileUrl;
    }

    @Override
    public Class<UploadFileResp> getRespClass() {
        return UploadFileResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.FILE_UPLOAD;
    }
}
