package com.notasign.open.api.bean.dto.document;


import com.notasign.open.api.bean.dto.field.DocumentFieldReqDTO;

import java.util.List;

/**
 * @author FADADA
 * @date 2025/5/22 16:53
 */
public class DocumentReqDTO {

    private String documentId;

    private String documentName;

    private String documentFileId;

    private List<DocumentFieldReqDTO> documentFields;

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public String getDocumentFileId() {
        return documentFileId;
    }

    public void setDocumentFileId(String documentFileId) {
        this.documentFileId = documentFileId;
    }

    public List<DocumentFieldReqDTO> getDocumentFields() {
        return documentFields;
    }

    public void setDocumentFields(List<DocumentFieldReqDTO> documentFields) {
        this.documentFields = documentFields;
    }
}
