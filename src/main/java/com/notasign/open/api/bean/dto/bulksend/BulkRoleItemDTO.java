package com.notasign.open.api.bean.dto.bulksend;

/**
 * 批量角色项DTO
 */
public class BulkRoleItemDTO {

    private String bulkRoleName;
    private String participantId;
    private String participantName;
    private String phoneCountryCode;
    private String phoneNumber;
    private String email;
    private String accessCode;

    public String getBulkRoleName() {
        return bulkRoleName;
    }

    public void setBulkRoleName(String bulkRoleName) {
        this.bulkRoleName = bulkRoleName;
    }

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
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

    public String getAccessCode() {
        return accessCode;
    }

    public void setAccessCode(String accessCode) {
        this.accessCode = accessCode;
    }
}
