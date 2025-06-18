package com.notasign.open.api.enums.oauth;


/**
 * @author FADADA
 * @date 2025/6/5 15:06
 */
public enum OauthGrantTypeEnum {

    JWT("jwt-bearer","jwt授权"),
    ;

    private final String code;
    private final String remark;

    OauthGrantTypeEnum(String code, String remark) {
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
