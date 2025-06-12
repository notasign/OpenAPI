package com.notasign.open.api.bean.resp.envelope;


import com.notasign.open.api.bean.resp.document.DocumentDTO;
import com.notasign.open.api.bean.resp.field.DocumentFieldDTO;
import com.notasign.open.api.bean.resp.recipient.CarbonCopyDTO;
import com.notasign.open.api.bean.resp.recipient.ParticipantDTO;

import java.time.LocalDateTime;
import java.util.List;

/**
 * @author FADADA
 * @date 2025/6/3 15:52
 */
public class EnvelopeDetailResp {

    private String envelopeId;
    private String senderAccountId;
    private String senderMemberId;
    private String senderName;
    private String subject;
    private String remark;
    private Boolean signInOrder;
    private String envelopeStatus;
    private String terminationNote;
    private String signCaCert;
    private LocalDateTime createTime;
    private LocalDateTime publishTime;
    private LocalDateTime finishTime;
    private LocalDateTime deadlineTime;
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

    public String getSignCaCert() {
        return signCaCert;
    }

    public void setSignCaCert(String signCaCert) {
        this.signCaCert = signCaCert;
    }

    public LocalDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(LocalDateTime createTime) {
        this.createTime = createTime;
    }

    public LocalDateTime getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(LocalDateTime publishTime) {
        this.publishTime = publishTime;
    }

    public LocalDateTime getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(LocalDateTime finishTime) {
        this.finishTime = finishTime;
    }

    public LocalDateTime getDeadlineTime() {
        return deadlineTime;
    }

    public void setDeadlineTime(LocalDateTime deadlineTime) {
        this.deadlineTime = deadlineTime;
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
