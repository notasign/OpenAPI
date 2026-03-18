package com.notasign.open.api.bean.dto.template;

import com.notasign.open.api.bean.dto.recipient.TemplateRoleSignDemandDTO;

/**
 * @author Nota
 * @date 2025/8/26 14:06
 */
public class CreateTemplateRoleDTO {
    
    private String roleName;

    private String participantId;
    
    private String participantName;
    
    private String phoneCountryCode;
    
    private String phoneNumber;
    
    private String email;
    
    private String signingMode;

    private TemplateRoleSignDemandDTO signDemand;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

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
}
