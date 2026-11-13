package com.notasign.open.api.resp.recipient;

import com.notasign.open.api.bean.dto.recipient.SignDemandDTO;

import java.util.List;

/**
 * @author Nota
 * @date 2025/6/3 15:56
 */
public class ParticipantDTO {
    private String participantId;
    private String participantType;
    private String participantName;

    /**
     * 收件人角色：0=签署人 1=审批人 2=查看人
     */
    private Integer partyRole;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 电话国家码
     */
    private String phoneCountryCode;

    /**
     * 电话号码
     */
    private String phoneNumber;

    /**
     * 签署模式：remoteSigning-通知签署；embeddedSigning-内嵌签署；autoSigning-自动签署
     */
    private String signMode;

    /**
     * 手机号投递渠道数组：SMS（短信）/ WHATSAPP（WhatsApp）
     */
    private List<String> phoneDeliveryMethod;

    private String joinStatus;
    private String joinTime;
    private String signStatus;

    /**
     * 审批状态：wait_approve/approved/approval_declined（仅审批人返回）
     */
    private String approvalStatus;

    /**
     * 审批时间（仅审批人返回）
     */
    private String approvalTime;

    /**
     * 审批拒绝原因（仅审批人返回）
     */
    private String approvalRejectReason;

    /**
     * 查看状态：wait_view/viewed（仅查看人返回）
     */
    private String viewStatus;

    /**
     * 查看时间（仅查看人返回）
     */
    private String viewTime;

    private String fillStatus;
    private String fillTime;
    private String signTime;
    private String rejectNote;
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

    public Integer getPartyRole() {
        return partyRole;
    }

    public void setPartyRole(Integer partyRole) {
        this.partyRole = partyRole;
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

    public String getSignMode() {
        return signMode;
    }

    public void setSignMode(String signMode) {
        this.signMode = signMode;
    }

    public List<String> getPhoneDeliveryMethod() {
        return phoneDeliveryMethod;
    }

    public void setPhoneDeliveryMethod(List<String> phoneDeliveryMethod) {
        this.phoneDeliveryMethod = phoneDeliveryMethod;
    }

    public String getJoinStatus() {
        return joinStatus;
    }

    public void setJoinStatus(String joinStatus) {
        this.joinStatus = joinStatus;
    }

    public String getJoinTime() {
        return joinTime;
    }

    public void setJoinTime(String joinTime) {
        this.joinTime = joinTime;
    }

    public String getSignStatus() {
        return signStatus;
    }

    public void setSignStatus(String signStatus) {
        this.signStatus = signStatus;
    }

    public String getApprovalStatus() {
        return approvalStatus;
    }

    public void setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
    }

    public String getApprovalTime() {
        return approvalTime;
    }

    public void setApprovalTime(String approvalTime) {
        this.approvalTime = approvalTime;
    }

    public String getApprovalRejectReason() {
        return approvalRejectReason;
    }

    public void setApprovalRejectReason(String approvalRejectReason) {
        this.approvalRejectReason = approvalRejectReason;
    }

    public String getViewStatus() {
        return viewStatus;
    }

    public void setViewStatus(String viewStatus) {
        this.viewStatus = viewStatus;
    }

    public String getViewTime() {
        return viewTime;
    }

    public void setViewTime(String viewTime) {
        this.viewTime = viewTime;
    }

    public String getFillStatus() {
        return fillStatus;
    }

    public void setFillStatus(String fillStatus) {
        this.fillStatus = fillStatus;
    }

    public String getFillTime() {
        return fillTime;
    }

    public void setFillTime(String fillTime) {
        this.fillTime = fillTime;
    }

    public String getSignTime() {
        return signTime;
    }

    public void setSignTime(String signTime) {
        this.signTime = signTime;
    }

    public String getRejectNote() {
        return rejectNote;
    }

    public void setRejectNote(String rejectNote) {
        this.rejectNote = rejectNote;
    }

    public SignDemandDTO getSignDemand() {
        return signDemand;
    }

    public void setSignDemand(SignDemandDTO signDemand) {
        this.signDemand = signDemand;
    }
}
