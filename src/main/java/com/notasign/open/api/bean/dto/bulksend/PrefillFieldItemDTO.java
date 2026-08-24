package com.notasign.open.api.bean.dto.bulksend;

/**
 * 批量发送预填字段项
 */
public class PrefillFieldItemDTO {

    /**
     * 预填字段名（任务内唯一）
     */
    private String fieldName;

    /**
     * 字段类型：1=text
     */
    private Integer fieldType;

    /**
     * 预填字段值
     */
    private String fieldValue;

    public String getFieldName() {
        return fieldName;
    }

    public void setFieldName(String fieldName) {
        this.fieldName = fieldName;
    }

    public Integer getFieldType() {
        return fieldType;
    }

    public void setFieldType(Integer fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }
}
