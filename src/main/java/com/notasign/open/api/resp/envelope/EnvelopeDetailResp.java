package com.notasign.open.api.resp.envelope;


import com.notasign.open.api.bean.base.BaseResp;
import com.notasign.open.api.resp.document.DocumentDTO;
import com.notasign.open.api.resp.field.DocumentFieldDTO;
import com.notasign.open.api.resp.recipient.CarbonCopyDTO;
import com.notasign.open.api.resp.recipient.ParticipantDTO;

import java.util.List;

/**
 * @author FADADA
 * @date 2025/6/3 15:52
 */
public class EnvelopeDetailResp extends BaseResp {

    private String envelopeId;
    private String senderAccountId;
    private String senderMemberId;
    private String senderName;
    private String subject;
    private String remark;
    private Boolean signInOrder;
    private String envelopeStatus;
    private String terminationNote;
    private String signatureLevel;
    private String caIdentifier;
    private String createTime;
    private String sendTime;
    private String finishTime;
    private String expiresTime;
    private List<DocumentDTO> documents;
    private List<ParticipantDTO> participants;
    private List<CarbonCopyDTO> carbonCopies;
    private List<DocumentFieldDTO> fields;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getSenderAccountId() {
        return senderAccountId;
    }

    public void setSenderAccountId(String senderAccountId) {
        this.senderAccountId = senderAccountId;
    }

    public String getSenderMemberId() {
        return senderMemberId;
    }

    public void setSenderMemberId(String senderMemberId) {
        this.senderMemberId = senderMemberId;
    }

    public String getSenderName() {
        return senderName;
    }

    public void setSenderName(String senderName) {
        this.senderName = senderName;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Boolean getSignInOrder() {
        return signInOrder;
    }

    public void setSignInOrder(Boolean signInOrder) {
        this.signInOrder = signInOrder;
    }

    public String getEnvelopeStatus() {
        return envelopeStatus;
    }

    public void setEnvelopeStatus(String envelopeStatus) {
        this.envelopeStatus = envelopeStatus;
    }

    public String getTerminationNote() {
        return terminationNote;
    }

    public void setTerminationNote(String terminationNote) {
        this.terminationNote = terminationNote;
    }

    public String getSignatureLevel() {
        return signatureLevel;
    }

    public void setSignatureLevel(String signatureLevel) {
        this.signatureLevel = signatureLevel;
    }

    public String getCaIdentifier() {
        return caIdentifier;
    }

    public void setCaIdentifier(String caIdentifier) {
        this.caIdentifier = caIdentifier;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getSendTime() {
        return sendTime;
    }

    public void setSendTime(String sendTime) {
        this.sendTime = sendTime;
    }

    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public String getExpiresTime() {
        return expiresTime;
    }

    public void setExpiresTime(String expiresTime) {
        this.expiresTime = expiresTime;
    }

    public List<DocumentDTO> getDocuments() {
        return documents;
    }

    public void setDocuments(List<DocumentDTO> documents) {
        this.documents = documents;
    }

    public List<ParticipantDTO> getParticipants() {
        return participants;
    }

    public void setParticipants(List<ParticipantDTO> participants) {
        this.participants = participants;
    }

    public List<CarbonCopyDTO> getCarbonCopies() {
        return carbonCopies;
    }

    public void setCarbonCopies(List<CarbonCopyDTO> carbonCopies) {
        this.carbonCopies = carbonCopies;
    }

    public List<DocumentFieldDTO> getFields() {
        return fields;
    }

    public void setFields(List<DocumentFieldDTO> fields) {
        this.fields = fields;
    }
}
