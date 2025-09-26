package com.notasign.open.api.bean.dto.field;

/**
 * @author Nota
 * @date 2025/9/26 10:46
 */
public class FillFieldDTO {

    private String fieldDocId;

    private String fieldId;

    private String fieldName;

    private String fieldValue;

    public String getFieldDocId() {
        return fieldDocId;
    }

    public void setFieldDocId(String fieldDocId) {
        this.fieldDocId = fieldDocId;
    }

    public String getFieldId() {
        return fieldId;
    }

    public void setFieldId(String fieldId) {
        this.fieldId = fieldId;
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
