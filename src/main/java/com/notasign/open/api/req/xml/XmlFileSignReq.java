package com.notasign.open.api.req.xml;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.xml.XmlFileSignResp;

import java.util.List;

/**
 * @author fadada
 * @date 2025/10/11 18:22
 */
public class XmlFileSignReq extends BaseReq<XmlFileSignResp> {

    private String credentialId;

    private String credentialPin;

    private List<XmlDoc> xmlDocs;

    public String getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(String credentialId) {
        this.credentialId = credentialId;
    }

    public String getCredentialPin() {
        return credentialPin;
    }

    public void setCredentialPin(String credentialPin) {
        this.credentialPin = credentialPin;
    }

    public List<XmlDoc> getXmlDocs() {
        return xmlDocs;
    }

    public void setXmlDocs(List<XmlDoc> xmlDocs) {
        this.xmlDocs = xmlDocs;
    }

    @Override
    public Class<XmlFileSignResp> getRespClass() {
        return XmlFileSignResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.XML_SIGN;
    }

    public static class XmlDoc {

        private String xmlDocId;

        private String xmlDocName;

        private String xmlFileId;

        public String getXmlDocId() {
            return xmlDocId;
        }

        public void setXmlDocId(String xmlDocId) {
            this.xmlDocId = xmlDocId;
        }

        public String getXmlDocName() {
            return xmlDocName;
        }

        public void setXmlDocName(String xmlDocName) {
            this.xmlDocName = xmlDocName;
        }

        public String getXmlFileId() {
            return xmlFileId;
        }

        public void setXmlFileId(String xmlFileId) {
            this.xmlFileId = xmlFileId;
        }
    }
}
