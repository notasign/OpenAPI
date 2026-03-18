package com.notasign.open.api.bean.dto.document;


/**
 * @author Nota
 * @date 2025/5/22 16:53
 */
public class SelfSignDocumentReqDTO {

    private String documentId;

    private String documentName;

    private String documentFileId;

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
}
