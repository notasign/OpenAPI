package com.notasign.open.api.resp.recipient;


/**
 * @author Nota
 * @date 2025/6/3 16:06
 */
public class CarbonCopyDTO {
    private String carbonCopyId;
    private String carbonCopyName;

    /**
     * 抄送方邮箱（未设置时为 null）
     */
    private String email;

    /**
     * 抄送方手机区号（未设置时为 null）
     */
    private String mobileAreaCode;

    /**
     * 抄送方手机号（未设置时为 null）
     */
    private String mobile;

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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobileAreaCode() {
        return mobileAreaCode;
    }

    public void setMobileAreaCode(String mobileAreaCode) {
        this.mobileAreaCode = mobileAreaCode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }
}
