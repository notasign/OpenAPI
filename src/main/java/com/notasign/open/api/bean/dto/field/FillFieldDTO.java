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

    /**
     * 单选框预填配置，fieldType=radio时有效
     */
    private RadioFieldConfigDTO radioConfig;

    /**
     * 复选框预填配置，fieldType=checkbox时有效
     */
    private CheckboxFieldConfigDTO checkboxConfig;

    /**
     * 图片控件预填配置，fieldType=img时有效
     */
    private ImageFieldConfigDTO imageConfig;

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

    public RadioFieldConfigDTO getRadioConfig() {
        return radioConfig;
    }

    public void setRadioConfig(RadioFieldConfigDTO radioConfig) {
        this.radioConfig = radioConfig;
    }

    public CheckboxFieldConfigDTO getCheckboxConfig() {
        return checkboxConfig;
    }

    public void setCheckboxConfig(CheckboxFieldConfigDTO checkboxConfig) {
        this.checkboxConfig = checkboxConfig;
    }

    public ImageFieldConfigDTO getImageConfig() {
        return imageConfig;
    }

    public void setImageConfig(ImageFieldConfigDTO imageConfig) {
        this.imageConfig = imageConfig;
    }
}
