package com.notasign.open.api.bean.dto.bulksend;

/**
 * 批量发送抄送方项DTO
 */
public class BulkCarbonCopyItemDTO {

    /**
     * 抄送方参与方ID（清单文件 participantId 列）
     */
    private String participantId;
    private String carbonCopyId;
    private String carbonCopyName;
    private String phoneCountryCode;
    private String phoneNumber;
    private String email;

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

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

    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }

    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
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
