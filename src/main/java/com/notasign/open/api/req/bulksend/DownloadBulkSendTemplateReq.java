package com.notasign.open.api.req.bulksend;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.base.EmptyResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * 下载批量发送文件模板请求。
 * <p>
 * 直接返回模板文件流（非JSON响应），请通过 {@code NotaSignClient#executeDownload} 调用，
 * 文件内容见 {@code BaseResponseEntity#getContent()}。
 */
public class DownloadBulkSendTemplateReq extends BaseReq<EmptyResp> {

    /**
     * 模板文件类型：csv/xlsx，默认csv
     */
    private String fileType;

    /**
     * 模板语言（如 zh/en），默认zh
     */
    private String language;

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public Class<EmptyResp> getRespClass() {
        return EmptyResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.BULK_LIST_TEMPLATE_DOWNLOAD;
    }
}
