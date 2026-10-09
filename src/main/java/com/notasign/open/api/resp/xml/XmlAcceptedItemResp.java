package com.notasign.open.api.resp.xml;

/**
 * XML签署已受理项（对齐服务端 XmlAcceptedItemResp）
 *
 * @author Nota
 */
public class XmlAcceptedItemResp {

    /**
     * XML文件ID
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
