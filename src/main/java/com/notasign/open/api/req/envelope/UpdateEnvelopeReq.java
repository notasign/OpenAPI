package com.notasign.open.api.req.envelope;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.base.EmptyResp;
import com.notasign.open.api.bean.dto.document.DocumentReqDTO;
import com.notasign.open.api.bean.dto.recipient.CarbonCopyReqDTO;
import com.notasign.open.api.bean.dto.recipient.ParticipantReqDTO;
import com.notasign.open.api.bean.dto.template.CreateTemplateFieldDTO;
import com.notasign.open.api.bean.dto.template.CreateTemplateRoleDTO;
import com.notasign.open.api.constants.OpenApiUrlConstants;

import java.util.List;

/**
 * @author Nota
 * @date 2025/5/22 16:42
 */
public class UpdateEnvelopeReq extends BaseReq<EmptyResp> {

    @JsonIgnore
    private String envelopeId;

    private String templateId;

    private String subject;

    private String remark;

    private Long expiresTime;

    private String signatureLevel;

    private Boolean autoSend;

    private Boolean signInOrder;

    private Boolean docSignInOrder;

    private String freeformSigningMode;

    private List<DocumentReqDTO> documents;

    private List<ParticipantReqDTO> participants;

    private List<CarbonCopyReqDTO> carbonCopies;

    private CreateTemplateFieldDTO templateFields;

    private List<CreateTemplateRoleDTO> templateRoles;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
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

    public Long getExpiresTime() {
        return expiresTime;
    }

    public void setExpiresTime(Long expiresTime) {
        this.expiresTime = expiresTime;
    }

    public String getSignatureLevel() {
        return signatureLevel;
    }

    public void setSignatureLevel(String signatureLevel) {
        this.signatureLevel = signatureLevel;
    }

    public Boolean getAutoSend() {
        return autoSend;
    }

    public void setAutoSend(Boolean autoSend) {
        this.autoSend = autoSend;
    }

    public Boolean getSignInOrder() {
        return signInOrder;
    }

    public void setSignInOrder(Boolean signInOrder) {
        this.signInOrder = signInOrder;
    }

    public Boolean getDocSignInOrder() {
        return docSignInOrder;
    }

    public void setDocSignInOrder(Boolean docSignInOrder) {
        this.docSignInOrder = docSignInOrder;
    }

    public String getFreeformSigningMode() {
        return freeformSigningMode;
    }

    public void setFreeformSigningMode(String freeformSigningMode) {
        this.freeformSigningMode = freeformSigningMode;
    }

    public List<DocumentReqDTO> getDocuments() {
        return documents;
    }

    public void setDocuments(List<DocumentReqDTO> documents) {
        this.documents = documents;
    }

    public List<ParticipantReqDTO> getParticipants() {
        return participants;
    }

    public void setParticipants(List<ParticipantReqDTO> participants) {
        this.participants = participants;
    }

    public List<CarbonCopyReqDTO> getCarbonCopies() {
        return carbonCopies;
    }

    public void setCarbonCopies(List<CarbonCopyReqDTO> carbonCopies) {
        this.carbonCopies = carbonCopies;
    }

    public CreateTemplateFieldDTO getTemplateFields() {
        return templateFields;
    }

    public void setTemplateFields(CreateTemplateFieldDTO templateFields) {
        this.templateFields = templateFields;
    }

    public List<CreateTemplateRoleDTO> getTemplateRoles() {
        return templateRoles;
    }

    public void setTemplateRoles(List<CreateTemplateRoleDTO> templateRoles) {
        this.templateRoles = templateRoles;
    }

    @Override
    public Class<EmptyResp> getRespClass() {
        return EmptyResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.UPDATE_ENVELOPE, envelopeId);
    }


}
