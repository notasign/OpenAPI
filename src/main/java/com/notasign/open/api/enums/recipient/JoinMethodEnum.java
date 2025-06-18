package com.notasign.open.api.enums.recipient;

/**
 * @author FADADA
 * @date 2025/6/1 14:11
 */
public enum JoinMethodEnum {

    ACCESS_CODE("access_code", "访问码"),
    ;

    private final String code;
    private final String remark;

    JoinMethodEnum(String code, String remark) {
        this.code = code;
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }
}
