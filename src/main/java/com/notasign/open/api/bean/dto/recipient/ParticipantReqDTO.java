package com.notasign.open.api.bean.dto.recipient;


import com.notasign.open.api.bean.dto.field.CheckboxFieldConfigDTO;
import com.notasign.open.api.bean.dto.field.ImageFieldConfigDTO;
import com.notasign.open.api.bean.dto.field.RadioFieldConfigDTO;

import java.util.List;

/**
 * @author Nota
 * @date 2025/5/22 16:58
 */

public class ParticipantReqDTO {

    private String participantId;

    private String participantType;

    private String participantName;

    private String phoneCountryCode;

    private String phoneNumber;

    private String email;

    private String signingMode;

    /**
     * 收件人角色：0-签署人（默认），1-审批人，2-查看人
     */
    private Integer partyRole;

    /**
     * 批量签署人角色名，participantType=bulkSigners时必填，最大128字符
     */
    private String bulkSignersRoleName;

    /**
     * 参与方颜色
     */
    private String partyColor;

    private List<SignField> signFields;

    private List<FillField> fillFields;

    private SignDemandDTO signDemand;

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public String getParticipantType() {
        return participantType;
    }

    public void setParticipantType(String participantType) {
        this.participantType = participantType;
    }

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }

    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSigningMode() {
        return signingMode;
    }

    public void setSigningMode(String signingMode) {
        this.signingMode = signingMode;
    }

    public Integer getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(Integer partyRole) {
        this.partyRole = partyRole;
    }

    public String getBulkSignersRoleName() {
        return bulkSignersRoleName;
    }

    public void setBulkSignersRoleName(String bulkSignersRoleName) {
        this.bulkSignersRoleName = bulkSignersRoleName;
    }

    public String getPartyColor() {
        return partyColor;
    }

    public void setPartyColor(String partyColor) {
        this.partyColor = partyColor;
    }

    public List<SignField> getSignFields() {
        return signFields;
    }

    public void setSignFields(List<SignField> signFields) {
        this.signFields = signFields;
    }

    public List<FillField> getFillFields() {
        return fillFields;
    }

    public void setFillFields(List<FillField> fillFields) {
        this.fillFields = fillFields;
    }

    public SignDemandDTO getSignDemand() {
        return signDemand;
    }

    public void setSignDemand(SignDemandDTO signDemand) {
        this.signDemand = signDemand;
    }

    public static class SignField {

        private String fieldDocId;

        private String fieldId;

        private String fieldName;

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
    }

    public static class FillField {

        private String fieldDocId;

        private String fieldId;

        private String fieldName;

        private String fieldValue;

        /**
         * 单选框控件配置（预填 selectedValue 时使用）
         */
        private RadioFieldConfigDTO radioConfig;

        /**
         * 复选框控件配置（预填 selectedValues 时使用）
         */
        private CheckboxFieldConfigDTO checkboxConfig;

        /**
         * 图片控件配置（预填 fileId 时使用）
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
}
