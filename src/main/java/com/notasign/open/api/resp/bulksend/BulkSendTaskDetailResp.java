package com.notasign.open.api.resp.bulksend;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.notasign.open.api.bean.base.BaseResp;

/**
 * 批量发送任务详情响应
 */
public class BulkSendTaskDetailResp extends BaseResp {

    /**
     * 批次ID
     */
    private String bulkId;

    /**
     * 批次名称
     */
    private String bulkName;

    /**
     * 批次状态：pending-未启动，running-执行中，ended-已结束
     */
    private String bulkStatus;

    /**
     * 来源类型：TEMPLATE-来源于模板，ENVELOPE-来源于信封
     */
    private String sourceType;

    /**
     * 来源ID，即templateId或envelopeId
     */
    private String sourceId;

    /**
     * 批量发送清单ID
     */
    @JsonProperty("bulkSendListID")
    private String bulkSendListID;

    /**
     * 信封数
     */
    private Integer bulkSize;

    /**
     * 创建时间，Unix标准时间戳（毫秒）
     */
    private String createTime;

    /**
     * 发送时间，Unix标准时间戳（毫秒）
     */
    private String updateTime;

    /**
     * 签署中的信封数
     */
    private Integer signingNumber;

    /**
     * 已完成的信封数
     */
    private Integer signedNumber;

    /**
     * 已拒签的信封数
     */
    private Integer rejectedNumber;

    /**
     * 已撤销的信封数
     */
    private Integer cancelledNumber;

    /**
     * 已逾期的信封数
     */
    private Integer expiredNumber;

    /**
     * 当前页码
     */
    private Integer pageNumber;

    /**
     * 每页记录数
     */
    private Integer pageSize;

    /**
     * 总页数
     */
    private Integer totalPage;

    /**
     * 总记录数
     */
    private Integer totalCount;

    public String getBulkId() {
        return bulkId;
    }

    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    public String getBulkName() {
        return bulkName;
    }

    public void setBulkName(String bulkName) {
        this.bulkName = bulkName;
    }

    public String getBulkStatus() {
        return bulkStatus;
    }

    public void setBulkStatus(String bulkStatus) {
        this.bulkStatus = bulkStatus;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public String getBulkSendListID() {
        return bulkSendListID;
    }

    public void setBulkSendListID(String bulkSendListID) {
        this.bulkSendListID = bulkSendListID;
    }

    public Integer getBulkSize() {
        return bulkSize;
    }

    public void setBulkSize(Integer bulkSize) {
        this.bulkSize = bulkSize;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public Integer getSigningNumber() {
        return signingNumber;
    }

    public void setSigningNumber(Integer signingNumber) {
        this.signingNumber = signingNumber;
    }

    public Integer getSignedNumber() {
        return signedNumber;
    }

    public void setSignedNumber(Integer signedNumber) {
        this.signedNumber = signedNumber;
    }

    public Integer getRejectedNumber() {
        return rejectedNumber;
    }

    public void setRejectedNumber(Integer rejectedNumber) {
        this.rejectedNumber = rejectedNumber;
    }

    public Integer getCancelledNumber() {
        return cancelledNumber;
    }

    public void setCancelledNumber(Integer cancelledNumber) {
        this.cancelledNumber = cancelledNumber;
    }

    public Integer getExpiredNumber() {
        return expiredNumber;
    }

    public void setExpiredNumber(Integer expiredNumber) {
        this.expiredNumber = expiredNumber;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
