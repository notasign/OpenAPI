package com.notasign.open.api.bean.req.envelope;


import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.req.document.DocumentReq;
import com.notasign.open.api.bean.req.recipient.CarbonCopyReq;
import com.notasign.open.api.bean.req.recipient.ParticipantReq;
import com.notasign.open.api.bean.resp.envelope.CreateEnvelopeResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

import java.util.List;

/**
 * @author FADADA
 * @date 2025/5/22 16:42
 */
public class CreateEnvelopeReq extends BaseReq<CreateEnvelopeResp> {

    private String templateId;

    private String subject;

    private String remark;

    private Long expiresTime;

    private String certCA;

    private Boolean autoPublish;

    private Boolean signInOrder;

    private List<DocumentReq> documents;

    private List<ParticipantReq> participants;

    private List<CarbonCopyReq> carbonCopies;

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

    public String getCertCA() {
        return certCA;
    }

    public void setCertCA(String certCA) {
        this.certCA = certCA;
    }

    public Boolean getAutoPublish() {
        return autoPublish;
    }

    public void setAutoPublish(Boolean autoPublish) {
        this.autoPublish = autoPublish;
    }

    public Boolean getSignInOrder() {
        return signInOrder;
    }

    public void setSignInOrder(Boolean signInOrder) {
        this.signInOrder = signInOrder;
    }

    public List<DocumentReq> getDocuments() {
        return documents;
    }

    public void setDocuments(List<DocumentReq> documents) {
        this.documents = documents;
    }

    public List<ParticipantReq> getParticipants() {
        return participants;
    }

    public void setParticipants(List<ParticipantReq> participants) {
        this.participants = participants;
    }

    public List<CarbonCopyReq> getCarbonCopies() {
        return carbonCopies;
    }

    public void setCarbonCopies(List<CarbonCopyReq> carbonCopies) {
        this.carbonCopies = carbonCopies;
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
