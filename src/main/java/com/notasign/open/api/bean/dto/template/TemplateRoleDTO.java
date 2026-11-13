package com.notasign.open.api.bean.dto.template;

import com.notasign.open.api.bean.dto.recipient.TemplateRoleSignDemandDTO;

import java.util.List;

/**
 * @author Nota
 * @date 2025/8/22 15:47
 */
public class TemplateRoleDTO {

    private String roleName;

    /**
     * 收件人角色：0=签署人 1=审批人 2=查看人，旧模板缺省时返回 0
     */
    private Integer partyRole;

    private String name;

    private String email;

    private String phoneCountryCode;

    private String phoneNumber;

    /**
     * 手机号投递渠道数组：SMS（短信）/ WHATSAPP（WhatsApp）
     */
    private List<String> phoneDeliveryMethod;

    /**
     * 签署顺序号，仅有序签署时返回
     */
    private Integer orderNo;

    /**
     * 角色类型：signer-签署人，eseal-电子印章，bulkSigners-批量签署人
     */
    private String roleType;

    /**
     * 参与方角色类型：1-固定单个参与方，2-批量参与方
     */
    private Integer partyRoleType;

    /**
     * 签署需求信息
     */
    private TemplateRoleSignDemandDTO signDemand;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public Integer getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(Integer partyRole) {
        this.partyRole = partyRole;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public String getRoleType() {
        return roleType;
    }

    public void setRoleType(String roleType) {
        this.roleType = roleType;
    }

    public Integer getPartyRoleType() {
        return partyRoleType;
    }

    public void setPartyRoleType(Integer partyRoleType) {
        this.partyRoleType = partyRoleType;
    }

    public TemplateRoleSignDemandDTO getSignDemand() {
        return signDemand;
    }

    public void setSignDemand(TemplateRoleSignDemandDTO signDemand) {
        this.signDemand = signDemand;
    }
}
