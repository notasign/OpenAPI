package com.notasign.open.api.bean.dto.field;


/**
 * @author Nota
 * @date 2025/5/22 16:54
 */

public class DocumentFieldReqDTO {

    private String fieldId;

    private String fieldName;

    private String fieldType;

    private String fieldValue;

    private Boolean isRequired;

    private String toolTips;

    private PositionDTO position;

    private StampFieldConfigDTO stampConfig;

    private AttachmentFieldConfigDTO attachmentConfig;

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

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public Boolean getRequired() {
        return isRequired;
    }

    public void setRequired(Boolean required) {
        isRequired = required;
    }

    public String getToolTips() {
        return toolTips;
    }

    public void setToolTips(String toolTips) {
        this.toolTips = toolTips;
    }

    public PositionDTO getPosition() {
        return position;
    }

    public void setPosition(PositionDTO position) {
        this.position = position;
    }

    public StampFieldConfigDTO getStampConfig() {
        return stampConfig;
    }

    public void setStampConfig(StampFieldConfigDTO stampConfig) {
        this.stampConfig = stampConfig;
    }

    public AttachmentFieldConfigDTO getAttachmentConfig() {
        return attachmentConfig;
    }

    public void setAttachmentConfig(AttachmentFieldConfigDTO attachmentConfig) {
        this.attachmentConfig = attachmentConfig;
    }
}
