package com.notasign.open.api.bean.dto.recipient;


/**
 * @author FADADA
 * @date 2025/5/22 17:09
 */

public class CarbonCopyReqDTO {

    private String carbonCopyId;

    private String carbonCopyName;

    private String phoneCountryCode;

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
