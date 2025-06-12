package com.notasign.open.api.bean.req.document;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.resp.document.FileConversionResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

import java.util.List;

public class FileConversionReq extends BaseReq<FileConversionResp> {

    private List<FileUrlInfo> fddFileUrlList;

    @Override
    public Class<FileConversionResp> getRespClass() {
        return FileConversionResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.FILE_CONVERSION;
    }


    public static class FileUrlInfo {
        private String fddFileUrl;

        private String fileName;

        private String fileType;

        public String getFddFileUrl() {
            return fddFileUrl;
        }

        public void setFddFileUrl(String fddFileUrl) {
            this.fddFileUrl = fddFileUrl;
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

    public List<FileUrlInfo> getFddFileUrlList() {
        return fddFileUrlList;
    }

    public void setFddFileUrlList(List<FileUrlInfo> fddFileUrlList) {
        this.fddFileUrlList = fddFileUrlList;
    }
}
