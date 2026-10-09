package com.notasign.open.api.bean.dto.template;


import com.notasign.open.api.bean.dto.field.CheckboxFieldConfigDTO;
import com.notasign.open.api.bean.dto.field.CrossPageSealConfigDTO;
import com.notasign.open.api.bean.dto.field.DrawingFieldConfigDTO;
import com.notasign.open.api.bean.dto.field.ESealFieldConfigDTO;
import com.notasign.open.api.bean.dto.field.ImageFieldConfigDTO;
import com.notasign.open.api.bean.dto.field.PositionDTO;
import com.notasign.open.api.bean.dto.field.RadioFieldConfigDTO;
import com.notasign.open.api.bean.dto.field.TextFieldConfigDTO;

/**
 * 模板控件回显（对齐服务端 TemplateFieldDTO）
 *
 * @author Nota
 * @date 2025/8/22 15:52
 */
public class TemplateFieldDTO {

    private String documentId;
    private String roleName;
    private String fieldId;
    private String fieldName;
    private String fieldType;
    private String fieldValue;
    private Boolean isRequired;

    /**
     * 签署日期控件日期格式（仅 fieldType=date_sign）
     */
    private String signDateFormat;

    /**
     * 控件位置
     */
    private PositionDTO position;

    /**
     * 骑缝章配置（仅骑缝章控件）
     */
    private CrossPageSealConfigDTO crossPageSealConfig;

    /**
     * eSeal 控件配置（仅 fieldType=eseal 的非骑缝章控件）
     */
    private ESealFieldConfigDTO esealFieldConfig;

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

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
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

    public String getSignDateFormat() {
        return signDateFormat;
    }

    public void setSignDateFormat(String signDateFormat) {
        this.signDateFormat = signDateFormat;
    }

    public PositionDTO getPosition() {
        return position;
    }

    public void setPosition(PositionDTO position) {
        this.position = position;
    }

    public CrossPageSealConfigDTO getCrossPageSealConfig() {
        return crossPageSealConfig;
    }

    public void setCrossPageSealConfig(CrossPageSealConfigDTO crossPageSealConfig) {
        this.crossPageSealConfig = crossPageSealConfig;
    }

    public ESealFieldConfigDTO getEsealFieldConfig() {
        return esealFieldConfig;
    }

    public void setEsealFieldConfig(ESealFieldConfigDTO esealFieldConfig) {
        this.esealFieldConfig = esealFieldConfig;
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
