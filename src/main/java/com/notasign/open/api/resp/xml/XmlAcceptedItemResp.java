package com.notasign.open.api.resp.xml;

import com.notasign.open.api.bean.base.BaseResp;

/**
 * XML签署创建成功后已登记的文件定位信息
 */
public class XmlAcceptedItemResp extends BaseResp {

    /**
     * 原始XML文件ID
     */
    private Long xmlFileId;

    /**
     * XML文档ID
     */
    private String xmlDocId;

    /**
     * 文件名
     */
    private String fileName;

    public Long getXmlFileId() {
        return xmlFileId;
    }

    public void setXmlFileId(Long xmlFileId) {
        this.xmlFileId = xmlFileId;
    }

    public String getXmlDocId() {
        return xmlDocId;
    }

    public void setXmlDocId(String xmlDocId) {
        this.xmlDocId = xmlDocId;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }
}
