package com.notasign.open.api.resp.field;


import com.notasign.open.api.bean.dto.field.CheckboxFieldConfigDTO;
import com.notasign.open.api.bean.dto.field.CrossPageSealConfigDTO;
import com.notasign.open.api.bean.dto.field.DrawingFieldConfigDTO;
import com.notasign.open.api.bean.dto.field.ESealFieldConfigDTO;
import com.notasign.open.api.bean.dto.field.ImageFieldConfigDTO;
import com.notasign.open.api.bean.dto.field.PositionDTO;
import com.notasign.open.api.bean.dto.field.RadioFieldConfigDTO;
import com.notasign.open.api.bean.dto.field.StampFieldConfigDTO;
import com.notasign.open.api.bean.dto.field.TextFieldConfigDTO;

/**
 * 文档控件回显（对齐服务端 DocumentFieldDTO）
 *
 * @author Nota
 * @date 2025/6/3 16:10
 */
public class DocumentFieldDTO {

    private String documentId;
    private String fieldId;
    private String fieldName;
    private String participantId;
    private String fieldType;

    /**
     * 签署日期控件日期格式（仅 fieldType=date_sign）
     */
    private String signDateFormat;

    /**
     * 字段值（单选框为选中项 optionValue，复选框为选中项 optionValue 的 JSON 数组字符串）
     */
    private String fieldValue;

    /**
     * 是否必填
     */
    private Boolean isRequired;

    /**
     * 是否骑缝章 0-否 1-是
     */
    private Integer isCrossPage;

    /**
     * 控件位置
     */
    private PositionDTO position;

    /**
     * 图章/电子印章控件配置（仅 fieldType=stamp/eseal）
     */
    private StampFieldConfigDTO stampConfig;

    /**
     * eSeal 控件配置（仅 fieldType=eseal 的非骑缝章控件）
     */
    private ESealFieldConfigDTO esealFieldConfig;

    /**
     * 骑缝章配置（仅骑缝章控件）
     */
    private CrossPageSealConfigDTO crossPageSealConfig;

    /**
     * 单选框控件配置（仅 fieldType=radio）
     */
    private RadioFieldConfigDTO radioConfig;

    /**
     * 复选框控件配置（仅 fieldType=checkbox）
     */
    private CheckboxFieldConfigDTO checkboxConfig;

    /**
     * 手绘控件配置（仅 fieldType=drawing）
     */
    private DrawingFieldConfigDTO drawingConfig;

    /**
     * 批量预填字段名称
     */
    private String bulkPrefillFieldName;

    /**
     * 文本控件配置（仅 fieldType=text）
     */
    private TextFieldConfigDTO textConfig;

    /**
     * 图片控件配置（仅 fieldType=image）
     */
    private ImageFieldConfigDTO imageConfig;

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
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

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getSignDateFormat() {
        return signDateFormat;
    }

    public void setSignDateFormat(String signDateFormat) {
        this.signDateFormat = signDateFormat;
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

    public Integer getIsCrossPage() {
        return isCrossPage;
    }

    public void setIsCrossPage(Integer isCrossPage) {
        this.isCrossPage = isCrossPage;
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

    public ESealFieldConfigDTO getEsealFieldConfig() {
        return esealFieldConfig;
    }

    public void setEsealFieldConfig(ESealFieldConfigDTO esealFieldConfig) {
        this.esealFieldConfig = esealFieldConfig;
    }

    public CrossPageSealConfigDTO getCrossPageSealConfig() {
        return crossPageSealConfig;
    }

    public void setCrossPageSealConfig(CrossPageSealConfigDTO crossPageSealConfig) {
        this.crossPageSealConfig = crossPageSealConfig;
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

    public DrawingFieldConfigDTO getDrawingConfig() {
        return drawingConfig;
    }

    public void setDrawingConfig(DrawingFieldConfigDTO drawingConfig) {
        this.drawingConfig = drawingConfig;
    }

    public String getBulkPrefillFieldName() {
        return bulkPrefillFieldName;
    }

    public void setBulkPrefillFieldName(String bulkPrefillFieldName) {
        this.bulkPrefillFieldName = bulkPrefillFieldName;
    }

    public TextFieldConfigDTO getTextConfig() {
        return textConfig;
    }

    public void setTextConfig(TextFieldConfigDTO textConfig) {
        this.textConfig = textConfig;
    }

    public ImageFieldConfigDTO getImageConfig() {
        return imageConfig;
    }

    public void setImageConfig(ImageFieldConfigDTO imageConfig) {
        this.imageConfig = imageConfig;
    }
}
