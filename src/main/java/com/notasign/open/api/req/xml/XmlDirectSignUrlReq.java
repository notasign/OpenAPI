package com.notasign.open.api.req.xml;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.xml.XmlDirectSignResp;

import java.util.List;

/**
 * eCOC XML URL直签请求
 */
public class XmlDirectSignUrlReq extends BaseReq<XmlDirectSignResp> {

    /**
     * 凭据ID，必填
     */
    private String credentialId;

    /**
     * 凭据PIN，必填
     */
    private String credentialPin;

    /**
     * 是否启用eCOC签前/签后校验，默认true
     */
    private Boolean enableEcocValidation;

    /**
     * 签署完成回调地址
     */
    private String callbackUrl;

    /**
     * 回调载荷模式，仅支持DOWNLOAD_LINK
     */
    private String callbackPayloadMode;

    /**
     * 待签署文件URL列表，必填，最多1000个
     */
    private List<FileUrlItem> fileUrls;

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

    public Boolean getEnableEcocValidation() {
        return enableEcocValidation;
    }

    public void setEnableEcocValidation(Boolean enableEcocValidation) {
        this.enableEcocValidation = enableEcocValidation;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getCallbackPayloadMode() {
        return callbackPayloadMode;
    }

    public void setCallbackPayloadMode(String callbackPayloadMode) {
        this.callbackPayloadMode = callbackPayloadMode;
    }

    public List<FileUrlItem> getFileUrls() {
        return fileUrls;
    }

    public void setFileUrls(List<FileUrlItem> fileUrls) {
        this.fileUrls = fileUrls;
    }

    @Override
    public Class<XmlDirectSignResp> getRespClass() {
        return XmlDirectSignResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.XML_DIRECT_SIGN;
    }

    /**
     * 待签署文件项
     */
    public static class FileUrlItem {

        /**
         * 待签署XML文件URL，必填
         */
        private String fileUrl;

        /**
         * XML文档ID，最大64字符
         */
        private String xmlDocId;

        /**
         * 文件名
         */
        private String fileName;

        public String getFileUrl() {
            return fileUrl;
        }

        public void setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
        }

        public String getXmlDocId() {
            return xmlDocId;
        }

        public void setXmlDocId(String xmlDocId) {
            this.xmlDocId = xmlDocId;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }
    }
}
