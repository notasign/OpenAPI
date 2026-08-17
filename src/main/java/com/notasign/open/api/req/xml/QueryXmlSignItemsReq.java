package com.notasign.open.api.req.xml;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.xml.XmlSignItemPageResp;

/**
 * XML签署文件结果分页查询请求
 */
public class QueryXmlSignItemsReq extends BaseReq<XmlSignItemPageResp> {

    /**
     * 批次ID，路径参数
     */
    @JsonIgnore
    private String batchId;

    /**
     * 页码，默认1
     */
    private Integer pageNo;

    /**
     * 每页大小，默认100，最大200
     */
    private Integer pageSize;

    /**
     * 文件级状态过滤
     */
    private String status;

    /**
     * 文件最终是否可交付过滤
     */
    private Boolean valid;

    /**
     * XML文档ID过滤
     */
    private String xmlDocId;

    /**
     * 原始XML文件ID过滤
     */
    private String xmlFileId;

    /**
     * 系统业务定位ID过滤
     */
    private String bizId;

    /**
     * 车辆VIN过滤
     */
    private String vin;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
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

    @Override
    public Class<XmlSignItemPageResp> getRespClass() {
        return XmlSignItemPageResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.GET_XML_SIGN_ITEMS, batchId);
    }
}
