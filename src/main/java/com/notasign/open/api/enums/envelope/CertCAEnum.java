package com.notasign.open.api.enums.envelope;

/**
 * @author FADADA
 * @date 2025/6/10 17:45
 */
public enum CertCAEnum {

    NOT_CA("NOT_CA", "NOT CA"),

    DIGI_SIGN("digiSign", "digiSignCa"),
    ;

    private final String code;
    private final String remark;

    CertCAEnum(String code, String remark) {
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
