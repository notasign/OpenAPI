package com.notasign.open.api.enums.envelope;


/**
 * @author FADADA
 * @date 2025/6/16 19:48
 */
public enum SignatureLevelEnum {

    SES("SES", "标准电子签名"),
    SES_EKyC("SES+EKyC", "增强电子签名"),
    AES("AES", "高级电子签名");

    private final String code;
    private final String remark;

    SignatureLevelEnum(String code, String remark) {
        this.code = code;
        this.remark = remark;
    }

    public String getCode() {
        return code;
    }

    public String getRemark() {
        return remark;
    }
}
