package com.notasign.open.api.enums.field;


/**
 * @author Nota
 * @date 2025/5/23 14:06
 */
public enum FieldTypeEnum {

    SIGNATURE("signature",  "签名"),
    SEAL("seal",  "印章"),
    ESEAL("eseal",  "电子印章"),
    DATE_SIGN("date_sign",  "日期"),
    TEXT("text",  "文本"),
    ATTACHMENT("attachment",  "附件"),
    DRAWING("drawing",  "绘图"),
    ;

    private final String code;
    private final String remark;

    FieldTypeEnum(String code, String remark) {
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
