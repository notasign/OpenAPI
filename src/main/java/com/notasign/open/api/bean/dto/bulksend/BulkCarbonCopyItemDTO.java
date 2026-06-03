package com.notasign.open.api.bean.dto.bulksend;

/**
 * 批量发送抄送方项DTO
 */
public class BulkCarbonCopyItemDTO {

    private String carbonCopyId;
    private String carbonCopyName;
    private String phoneNumber;
    private String email;

    public String getCarbonCopyId() {
        return carbonCopyId;
    }

    public void setCarbonCopyId(String carbonCopyId) {
        this.carbonCopyId = carbonCopyId;
    }

    public String getCarbonCopyName() {
        return carbonCopyName;
    }

    public void setCarbonCopyName(String carbonCopyName) {
        this.carbonCopyName = carbonCopyName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
