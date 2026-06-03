package com.notasign.open.api.bean.dto.bulksend;

import java.util.List;

/**
 * 批量发送清单项DTO
 */
public class BulkSendListItemDTO {

    private String subject;
    private String remark;
    private List<BulkRoleItemDTO> bulkRoles;
    private List<BulkCarbonCopyItemDTO> carbonCopies;

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
}
