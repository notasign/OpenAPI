package com.notasign.open.api.req.xml;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.xml.XmlSignItemDetailResp;

/**
 * XML签署单文件结果及issue明细查询请求
 */
public class QueryXmlSignItemDetailReq extends BaseReq<XmlSignItemDetailResp> {

    /**
     * 批次ID，路径参数
     */
    @JsonIgnore
    private String batchId;

    /**
     * XML文档ID
     */
    private String xmlDocId;

    /**
     * 原始XML文件ID
     */
    private String xmlFileId;

    /**
     * 系统业务定位ID
     */
    private String bizId;

    /**
     * 车辆VIN
     */
    private String vin;

    /**
     * issue类型：ERROR/WARNING
     */
    private String issueType;

    /**
     * issue分页游标
     */
    private Long issueCursor;

    /**
     * issue每页大小，默认100，最大200
     */
    private Integer issuePageSize;

    /**
     * issue校验层级过滤：XSD/REQUIRED/RULE/SIGNATURE/SYSTEM
     */
    private String layer;

    /**
     * issue严重级别过滤
     */
    private String severity;

    /**
     * issue错误码过滤
     */
    private String code;

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

    public String getXmlFileId() {
        return xmlFileId;
    }

    public void setXmlFileId(String xmlFileId) {
        this.xmlFileId = xmlFileId;
    }

    public String getBizId() {
        return bizId;
    }

    public void setBizId(String bizId) {
        this.bizId = bizId;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getIssueType() {
        return issueType;
    }

    public void setIssueType(String issueType) {
        this.issueType = issueType;
    }

    public Long getIssueCursor() {
        return issueCursor;
    }

    public void setIssueCursor(Long issueCursor) {
        this.issueCursor = issueCursor;
    }

    public Integer getIssuePageSize() {
        return issuePageSize;
    }

    public void setIssuePageSize(Integer issuePageSize) {
        this.issuePageSize = issuePageSize;
    }

    public String getLayer() {
        return layer;
    }

    public void setLayer(String layer) {
        this.layer = layer;
    }

    public String getSeverity() {
        return severity;
    }

    public void setSeverity(String severity) {
        this.severity = severity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    @Override
    public Class<XmlSignItemDetailResp> getRespClass() {
        return XmlSignItemDetailResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.GET_XML_SIGN_ITEM_DETAIL, batchId);
    }
}
