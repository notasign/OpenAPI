package com.notasign.open.api.req.document;


import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.document.GetFileUploadUrlResp;

public class GetUploadUrlReq extends BaseReq<GetFileUploadUrlResp> {

    private String fileType;

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    @Override
    public Class<GetFileUploadUrlResp> getRespClass() {
        return GetFileUploadUrlResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.GET_FILE_UPLOAD_URL;
    }
}
