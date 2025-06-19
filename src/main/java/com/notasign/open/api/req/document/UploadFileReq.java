package com.notasign.open.api.req.document;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.resp.document.UploadFileResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

public class UploadFileReq extends BaseReq<UploadFileResp> {

    private String fileType;
    private String fileDownloadUrl;

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileDownloadUrl() {
        return fileDownloadUrl;
    }

    public void setFileDownloadUrl(String fileDownloadUrl) {
        this.fileDownloadUrl = fileDownloadUrl;
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
