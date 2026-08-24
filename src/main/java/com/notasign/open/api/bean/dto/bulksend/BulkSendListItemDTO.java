package com.notasign.open.api.bean.dto.bulksend;

import java.util.List;

/**
 * 批量发送清单项DTO
 */
public class BulkSendListItemDTO {

    private String subject;
    private String remark;

    /**
     * 信封过期时间（yyyy/MM/dd 或 yyyy-MM-dd）
     */
    private String expiresTime;

    /**
     * 提醒频率（0=无, 1=每日, 2=每周, 3=每月, 5=半月）
     */
    private Integer remindFrequency;

    private List<BulkRoleItemDTO> bulkRoles;
    private List<BulkCarbonCopyItemDTO> carbonCopies;

    /**
     * 预填字段列表
     */
    private List<PrefillFieldItemDTO> prefillFields;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public List<BulkRoleItemDTO> getBulkRoles() {
        return bulkRoles;
    }

    public void setBulkRoles(List<BulkRoleItemDTO> bulkRoles) {
        this.bulkRoles = bulkRoles;
    }

    public List<BulkCarbonCopyItemDTO> getCarbonCopies() {
        return carbonCopies;
    }

    public void setCarbonCopies(List<BulkCarbonCopyItemDTO> carbonCopies) {
        this.carbonCopies = carbonCopies;
    }

    public String getExpiresTime() {
        return expiresTime;
    }

    public void setExpiresTime(String expiresTime) {
        this.expiresTime = expiresTime;
    }

    public Integer getRemindFrequency() {
        return remindFrequency;
    }

    public void setRemindFrequency(Integer remindFrequency) {
        this.remindFrequency = remindFrequency;
    }

    public List<PrefillFieldItemDTO> getPrefillFields() {
        return prefillFields;
    }

    public void setPrefillFields(List<PrefillFieldItemDTO> prefillFields) {
        this.prefillFields = prefillFields;
    }
}
