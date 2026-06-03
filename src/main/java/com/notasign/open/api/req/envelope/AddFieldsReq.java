package com.notasign.open.api.req.envelope;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.base.EmptyResp;
import com.notasign.open.api.bean.dto.field.DocumentFieldReqDTO;
import com.notasign.open.api.constants.OpenApiUrlConstants;

import java.util.List;

/**
 * 添加信封控件请求
 */
public class AddFieldsReq extends BaseReq<EmptyResp> {

    @JsonIgnore
    private String envelopeId;

    @JsonIgnore
    private String documentId;

    private String participantId;

    private List<DocumentFieldReqDTO> fields;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public List<DocumentFieldReqDTO> getFields() {
        return fields;
    }

    public void setFields(List<DocumentFieldReqDTO> fields) {
        this.fields = fields;
    }

    @Override
    public Class<EmptyResp> getRespClass() {
        return EmptyResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.ADD_FIELDS, envelopeId, documentId);
    }
}
