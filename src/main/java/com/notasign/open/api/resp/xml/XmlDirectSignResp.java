package com.notasign.open.api.resp.xml;

import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;

/**
 * eCOC XML URL直签响应
 */
public class XmlDirectSignResp extends BaseResp {

    /**
     * 批次ID
     */
    private String batchId;

    /**
     * 批次状态
     */
    private String status;

    /**
     * 是否启用eCOC签前/签后校验
     */
    private Boolean validationEnabled;

    /**
     * 文件数
     */
    private Integer fileCount;

    /**
     * 是否启用回调
     */
    private Boolean callbackEnabled;

    /**
     * 后续可选操作提示
     */
    private List<String> nextActions;

    /**
     * 已登记的文件定位信息
     */
    private List<XmlAcceptedItemResp> acceptedItems;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Boolean getValidationEnabled() {
        return validationEnabled;
    }

    public void setValidationEnabled(Boolean validationEnabled) {
        this.validationEnabled = validationEnabled;
    }

    public Integer getFileCount() {
        return fileCount;
    }

    public void setFileCount(Integer fileCount) {
        this.fileCount = fileCount;
    }

    public Boolean getCallbackEnabled() {
        return callbackEnabled;
    }

    public void setCallbackEnabled(Boolean callbackEnabled) {
        this.callbackEnabled = callbackEnabled;
    }

    public List<String> getNextActions() {
        return nextActions;
    }

    public void setNextActions(List<String> nextActions) {
        this.nextActions = nextActions;
    }

    public List<XmlAcceptedItemResp> getAcceptedItems() {
        return acceptedItems;
    }

    public void setAcceptedItems(List<XmlAcceptedItemResp> acceptedItems) {
        this.acceptedItems = acceptedItems;
    }
}
