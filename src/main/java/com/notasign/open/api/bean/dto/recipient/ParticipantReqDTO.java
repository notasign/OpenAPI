package com.notasign.open.api.bean.dto.recipient;


import java.util.List;

/**
 * @author Nota
 * @date 2025/5/22 16:58
 */

public class ParticipantReqDTO {

    private String participantId;

    private String participantName;

    private String phoneCountryCode;

    private String phoneNumber;

    private String email;

    private String signingMode;

    private List<SignField> signFields;

    private List<FillField> fillFields;

    private SignDemandDTO signDemand;

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
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
}
