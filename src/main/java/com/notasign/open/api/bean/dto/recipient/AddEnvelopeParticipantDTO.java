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
    private String email;
    private String signingMode;
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

    public SignDemandDTO getSignDemand() {
        return signDemand;
    }

    public void setSignDemand(SignDemandDTO signDemand) {
        this.signDemand = signDemand;
    }
}
