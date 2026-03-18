package com.notasign.open.api.bean.dto.recipient;

import java.util.List;

/**
 * @author Nota
 * @date 2025/5/22 17:08
 */
public class SignDemandDTO {

    private int orderNo;

    private List<JoinCheckConfiguration> identityVerifications;

    private String signatureType;

    private ESealConfigDTO esealConfig;

    private List<String> signatureOptions;


    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public List<JoinCheckConfiguration> getIdentityVerifications() {
        return identityVerifications;
    }

    public void setIdentityVerifications(List<JoinCheckConfiguration> identityVerifications) {
        this.identityVerifications = identityVerifications;
    }

    public String getSignatureType() {
        return signatureType;
    }

    public void setSignatureType(String signatureType) {
        this.signatureType = signatureType;
    }

    public ESealConfigDTO getEsealConfig() {
        return esealConfig;
    }

    public void setEsealConfig(ESealConfigDTO esealConfig) {
        this.esealConfig = esealConfig;
    }

    public List<String> getSignatureOptions() {
        return signatureOptions;
    }

    public void setSignatureOptions(List<String> signatureOptions) {
        this.signatureOptions = signatureOptions;
    }

    public static class JoinCheckConfiguration {

        private String verificationMethod;

        private String accessCode;

        private String verificationEmail;

        public String getVerificationMethod() {
            return verificationMethod;
        }

        public void setVerificationMethod(String verificationMethod) {
            this.verificationMethod = verificationMethod;
        }

        public String getAccessCode() {
            return accessCode;
        }

        public void setAccessCode(String accessCode) {
            this.accessCode = accessCode;
        }

        public String getVerificationEmail() {
            return verificationEmail;
        }

        public void setVerificationEmail(String verificationEmail) {
            this.verificationEmail = verificationEmail;
        }
    }

}
