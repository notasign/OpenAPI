package com.notasign.open.api.bean.dto.field;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * @author Nota
 * @date 2025/5/22 16:54
 */

public class DocumentFieldReqDTO {

    private String fieldId;

    private String fieldName;

    private String fieldType;

    private String fieldValue;

    @JsonProperty("isRequired")
    private Boolean isRequired;

    private String toolTips;

    private PositionDTO position;

    private StampFieldConfigDTO stampConfig;

    private AttachmentFieldConfigDTO attachmentConfig;

    private DrawingFieldConfigDTO drawingConfig;

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

    public Boolean getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Boolean isRequired) {
        this.isRequired = isRequired;
    }

    /**
     * @deprecated 使用 {@link #getIsRequired()} 代替，保持与 JSON 字段名 isRequired 一致
     */
    @Deprecated
    public Boolean getRequired() {
        return isRequired;
    }

    /**
     * @deprecated 使用 {@link #setIsRequired(Boolean)} 代替，保持与 JSON 字段名 isRequired 一致
     */
    @Deprecated
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

    public DrawingFieldConfigDTO getDrawingConfig() {
        return drawingConfig;
    }

    public void setDrawingConfig(DrawingFieldConfigDTO drawingConfig) {
        this.drawingConfig = drawingConfig;
    }
}
