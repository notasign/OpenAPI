package com.notasign.open.api.resp.tsp;

import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;

/**
 * 证书信息响应
 */
public class GetCertificateResp extends BaseResp {

    private CredentialsInfoKey key;
    private String description;
    private CredentialsInfoCert cert;
    private String authMode;
    private Boolean multisign;

    public CredentialsInfoKey getKey() {
        return key;
    }

    public void setKey(CredentialsInfoKey key) {
        this.key = key;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CredentialsInfoCert getCert() {
        return cert;
    }

    public void setCert(CredentialsInfoCert cert) {
        this.cert = cert;
    }

    public String getAuthMode() {
        return authMode;
    }

    public void setAuthMode(String authMode) {
        this.authMode = authMode;
    }

    public Boolean getMultisign() {
        return multisign;
    }

    public void setMultisign(Boolean multisign) {
        this.multisign = multisign;
    }

    public static class CredentialsInfoKey {
        private String status;
        private List<String> alg;
        private Integer len;

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public List<String> getAlg() {
            return alg;
        }

        public void setAlg(List<String> alg) {
            this.alg = alg;
        }

        public Integer getLen() {
            return len;
        }

        public void setLen(Integer len) {
            this.len = len;
        }
    }

    public static class CredentialsInfoCert {
        private List<String> certificates;
        private String issuerDN;
        private String serialNumber;
        private String subjectDN;
        private String validFrom;
        private String validTo;

        public List<String> getCertificates() {
            return certificates;
        }

        public void setCertificates(List<String> certificates) {
            this.certificates = certificates;
        }

        public String getIssuerDN() {
            return issuerDN;
        }

        public void setIssuerDN(String issuerDN) {
            this.issuerDN = issuerDN;
        }

        public String getSerialNumber() {
            return serialNumber;
        }

        public void setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
        }

        public String getSubjectDN() {
            return subjectDN;
        }

        public void setSubjectDN(String subjectDN) {
            this.subjectDN = subjectDN;
        }

        public String getValidFrom() {
            return validFrom;
        }

        public void setValidFrom(String validFrom) {
            this.validFrom = validFrom;
        }

        public String getValidTo() {
            return validTo;
        }

        public void setValidTo(String validTo) {
            this.validTo = validTo;
        }
    }
}
