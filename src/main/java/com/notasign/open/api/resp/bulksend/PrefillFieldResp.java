package com.notasign.open.api.resp.bulksend;

/**
 * 批量发送清单预填字段（对齐服务端 PrefillFieldResp）
 *
 * @author Nota
 */
public class PrefillFieldResp {

    /**
     * 控件类型
     */
    private String fieldType;

    /**
     * 控件名称
     */
    private String fieldName;

    /**
     * 预填值
     */
    private String fieldValue;

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }
}
