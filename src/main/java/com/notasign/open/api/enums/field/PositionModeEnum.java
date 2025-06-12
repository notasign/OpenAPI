package com.notasign.open.api.enums.field;


/**
 * @author FADADA
 * @date 2025/6/7 19:38
 */
public enum PositionModeEnum {

    PIXEL("pixel", "像素值"),
    KEYWORD("keyword", "关键字定位");

    private final String code;
    private final String remark;

    PositionModeEnum(String code, String remark) {
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
