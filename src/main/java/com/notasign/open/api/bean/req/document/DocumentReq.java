package com.notasign.open.api.bean.req.document;


import com.notasign.open.api.bean.req.field.DocumentFieldReq;

import java.util.List;

/**
 * @author FADADA
 * @date 2025/5/22 16:53
 */
public class DocumentReq {

    private String documentId;

    private String documentName;

    private String documentFileId;

    private List<DocumentFieldReq> documentFields;

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

    public List<DocumentFieldReq> getDocumentFields() {
        return documentFields;
    }

    public void setDocumentFields(List<DocumentFieldReq> documentFields) {
        this.documentFields = documentFields;
    }
}
