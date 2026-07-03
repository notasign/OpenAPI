package com.notasign.open.api.bean.dto.field;

/**
 * 签署控件信息
 *
 * @author Nota
 * @date 2025/8/26 14:23
 */
public class SignFieldDTO {

    private String fieldDocId;

    private String fieldId;

    private String fieldName;

    private StampFieldConfigDTO stampConfig;

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

    public StampFieldConfigDTO getStampConfig() {
        return stampConfig;
    }

    public void setStampConfig(StampFieldConfigDTO stampConfig) {
        this.stampConfig = stampConfig;
    }
}
