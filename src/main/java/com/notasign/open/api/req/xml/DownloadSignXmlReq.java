package com.notasign.open.api.req.xml;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.xml.DownloadSignXmlResp;

/**
 * @author fadada
 * @date 2025/10/13 14:28
 */
public class DownloadSignXmlReq extends BaseReq<DownloadSignXmlResp> {

    @JsonIgnore
    private String batchId;

    /**
     * 文档ID
     */
    private String xmlDocId;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getXmlDocId() {
        return xmlDocId;
    }

    public void setXmlDocId(String xmlDocId) {
        this.xmlDocId = xmlDocId;
    }

    @Override
    public Class<DownloadSignXmlResp> getRespClass() {
        return DownloadSignXmlResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.DOWNLOAD_XML_SIGNED, batchId);
    }
}
