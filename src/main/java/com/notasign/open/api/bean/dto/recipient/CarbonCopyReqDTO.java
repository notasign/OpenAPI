package com.notasign.open.api.bean.dto.recipient;


/**
 * @author Nota
 * @date 2025/5/22 17:09
 */

public class CarbonCopyReqDTO {

    private String carbonCopyId;

    private String carbonCopyName;

    /**
     * 抄送方参与人ID（批量发送清单场景）
     */
    private String participantId;

    private String phoneCountryCode;

    private String phoneNumber;

    private String email;

    public String getCarbonCopyId() {
        return carbonCopyId;
    }

    public void setCarbonCopyId(String carbonCopyId) {
        this.carbonCopyId = carbonCopyId;
    }

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
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
