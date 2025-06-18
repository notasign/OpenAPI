package com.notasign.open.api.enums.envelope;


/**
 * @author FADADA
 * @date 2025/5/23 10:49
 */
public enum CaIdentifierEnum {

    DIGI_SIGN("Digi-Sign", "Digi-Sign证书机构");


    private final String code;
    private final String remark;

    CaIdentifierEnum(String code, String remark) {
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
