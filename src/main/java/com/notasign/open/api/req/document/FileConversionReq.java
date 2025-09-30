package com.notasign.open.api.req.document;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.resp.document.FileConversionResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

import java.util.List;

public class FileConversionReq extends BaseReq<FileConversionResp> {

    private List<FileUrlInfo> fileUrls;

    @Override
    public Class<FileConversionResp> getRespClass() {
        return FileConversionResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.FILE_CONVERSION;
    }


    public static class FileUrlInfo {
        private String fileUrl;

        private String fileName;

        private String fileType;

        public String getFileUrl() {
            return fileUrl;
        }

        public void setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getFileType() {
            return fileType;
        }

        public void setFileType(String fileType) {
            this.fileType = fileType;
        }
    }

    public List<FileUrlInfo> getFileUrls() {
        return fileUrls;
    }

    public void setFileUrls(List<FileUrlInfo> fileUrls) {
        this.fileUrls = fileUrls;
    }
}
