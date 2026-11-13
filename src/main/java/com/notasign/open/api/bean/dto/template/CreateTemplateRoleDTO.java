package com.notasign.open.api.bean.dto.template;

import com.notasign.open.api.bean.dto.recipient.TemplateRoleSignDemandDTO;

import java.util.List;

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

    /**
     * 手机号投递渠道数组：SMS（短信）/ WHATSAPP（WhatsApp）
     */
    private List<String> phoneDeliveryMethod;
    
    private String email;
    
    private String signingMode;

    /**
     * 角色类型：signer-签署人（默认），eseal-电子印章，bulkSigners-批量签署人
     */
    private String roleType;

    /**
     * 批量签署人角色名，roleType=bulkSigners时必填，最大128字符
     */
    private String bulkSignersRoleName;

    /**
     * 参与方颜色
     */
    private String partyColor;

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

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
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

    public TemplateRoleSignDemandDTO getSignDemand() {
        return signDemand;
    }

    public void setSignDemand(TemplateRoleSignDemandDTO signDemand) {
        this.signDemand = signDemand;
    }
}
