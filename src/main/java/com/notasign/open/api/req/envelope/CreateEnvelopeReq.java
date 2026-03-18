package com.notasign.open.api.req.envelope;


import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.dto.document.DocumentReqDTO;
import com.notasign.open.api.bean.dto.recipient.CarbonCopyReqDTO;
import com.notasign.open.api.bean.dto.recipient.ParticipantReqDTO;
import com.notasign.open.api.bean.dto.template.CreateTemplateFieldDTO;
import com.notasign.open.api.bean.dto.template.CreateTemplateRoleDTO;
import com.notasign.open.api.resp.envelope.CreateEnvelopeResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

import java.util.List;

/**
 * @author Nota
 * @date 2025/5/22 16:42
 */
public class CreateEnvelopeReq extends BaseReq<CreateEnvelopeResp> {

    private String templateId;

    private String subject;

    private String remark;

    private Long expiresTime;

    @Deprecated
    private String signatureLevel;

    private Boolean autoSend;

    private Boolean signInOrder;

    private Boolean freeformSigningMode;

    private List<DocumentReqDTO> documents;

    private List<ParticipantReqDTO> participants;

    private List<CarbonCopyReqDTO> carbonCopies;

    private CreateTemplateFieldDTO templateFields;

    private List<CreateTemplateRoleDTO> templateRoles;

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

    public Boolean getFreeformSigningMode() {
        return freeformSigningMode;
    }

    public void setFreeformSigningMode(Boolean freeformSigningMode) {
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
    public Class<CreateEnvelopeResp> getRespClass() {
        return CreateEnvelopeResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.CREATE_ENVELOPE;
    }


}
