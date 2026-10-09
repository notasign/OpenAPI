package com.notasign.open.api.resp.template;

import com.notasign.open.api.bean.base.BaseResp;
import com.notasign.open.api.bean.dto.template.TemplateFieldDTO;
import com.notasign.open.api.bean.dto.template.TemplateRoleDTO;
import com.notasign.open.api.resp.document.DocumentDTO;

import java.util.List;

/**
 * @author Nota
 * @date 2025/9/26 10:52
 */
public class GetTemplateDetailResp extends BaseResp {


    private String templateId;

    private String templateName;

    private String templateDescription;

    private String subject;

    private String remark;

    private String signatureLevel;

    private Integer expiresInDays;

    private Boolean signInOrder;

    /**
     * 文档间签署顺序：0-无序签署，1-顺序签署
     */
    private Integer docSignInOrder;

    /**
     * 是否批量发送模板
     */
    private Boolean isBulkSendTemplate;

    /**
     * 批量发送清单ID
     */
    private String bulkSendListID;

    private List<DocumentDTO> documents;

    private List<TemplateRoleDTO> roles;

    private List<TemplateFieldDTO> fields;

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public String getTemplateDescription() {
        return templateDescription;
    }

    public void setTemplateDescription(String templateDescription) {
        this.templateDescription = templateDescription;
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

    public String getSignatureLevel() {
        return signatureLevel;
    }

    public void setSignatureLevel(String signatureLevel) {
        this.signatureLevel = signatureLevel;
    }

    public Integer getExpiresInDays() {
        return expiresInDays;
    }

    public void setExpiresInDays(Integer expiresInDays) {
        this.expiresInDays = expiresInDays;
    }

    public Boolean getSignInOrder() {
        return signInOrder;
    }

    public void setSignInOrder(Boolean signInOrder) {
        this.signInOrder = signInOrder;
    }

    public Integer getDocSignInOrder() {
        return docSignInOrder;
    }

    public void setDocSignInOrder(Integer docSignInOrder) {
        this.docSignInOrder = docSignInOrder;
    }

    public Boolean getIsBulkSendTemplate() {
        return isBulkSendTemplate;
    }

    public void setIsBulkSendTemplate(Boolean isBulkSendTemplate) {
        this.isBulkSendTemplate = isBulkSendTemplate;
    }

    public String getBulkSendListID() {
        return bulkSendListID;
    }

    public void setBulkSendListID(String bulkSendListID) {
        this.bulkSendListID = bulkSendListID;
    }

    public List<DocumentDTO> getDocuments() {
        return documents;
    }

    public void setDocuments(List<DocumentDTO> documents) {
        this.documents = documents;
    }

    public List<TemplateRoleDTO> getRoles() {
        return roles;
    }

    public void setRoles(List<TemplateRoleDTO> roles) {
        this.roles = roles;
    }

    public List<TemplateFieldDTO> getFields() {
        return fields;
    }

    public void setFields(List<TemplateFieldDTO> fields) {
        this.fields = fields;
    }
}
