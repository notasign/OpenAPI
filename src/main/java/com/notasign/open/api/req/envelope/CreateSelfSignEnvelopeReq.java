package com.notasign.open.api.req.envelope;


import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.dto.document.SelfSignDocumentReqDTO;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.envelope.CreateSelfSignEnvelopeResp;

import java.util.List;

/**
 * @author Nota
 * @date 2025/5/22 16:42
 */
public class CreateSelfSignEnvelopeReq extends BaseReq<CreateSelfSignEnvelopeResp> {

    private String templateId;

    private String subject;

    private List<SelfSignDocumentReqDTO> documents;

    private String redirectUrl;

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

    public List<SelfSignDocumentReqDTO> getDocuments() {
        return documents;
    }

    public void setDocuments(List<SelfSignDocumentReqDTO> documents) {
        this.documents = documents;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    @Override
    public Class getRespClass() {
        return CreateSelfSignEnvelopeResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.CREATE_SELF_SIGN_DOCS;
    }
}
