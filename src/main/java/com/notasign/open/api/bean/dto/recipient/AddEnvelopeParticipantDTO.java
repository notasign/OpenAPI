package com.notasign.open.api.bean.dto.recipient;

import java.util.List;

/**
 * 添加信封参与方DTO
 */
public class AddEnvelopeParticipantDTO {

    private String participantId;
    private String participantType;
    private String participantName;
    private String phoneCountryCode;
    private String phoneNumber;

    /**
     * 手机号投递渠道数组：SMS（短信）/ WHATSAPP（WhatsApp）
     */
    private List<String> phoneDeliveryMethod;

    private String email;
    private String signingMode;

    /**
     * 收件人角色：0-签署人（默认），1-审批人，2-查看人
     */
    private Integer partyRole;

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

    public List<String> getPhoneDeliveryMethod() {
        return phoneDeliveryMethod;
    }

    public void setPhoneDeliveryMethod(List<String> phoneDeliveryMethod) {
        this.phoneDeliveryMethod = phoneDeliveryMethod;
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

    public SignDemandDTO getSignDemand() {
        return signDemand;
    }

    public void setSignDemand(SignDemandDTO signDemand) {
        this.signDemand = signDemand;
    }
}
