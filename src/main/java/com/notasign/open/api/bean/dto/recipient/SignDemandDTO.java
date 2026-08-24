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

    private BlockConfigDTO blockConfig;

    private List<String> terms;

    private ReadingRequirementDTO readingRequirement;

    /**
     * CA限定配置
     */
    private CaScopeDTO caScope;

    /**
     * 是否允许参与方更名，仅签署人（signer）生效
     */
    private Boolean allowParticipantRename;


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

    public BlockConfigDTO getBlockConfig() {
        return blockConfig;
    }

    public void setBlockConfig(BlockConfigDTO blockConfig) {
        this.blockConfig = blockConfig;
    }

    public List<String> getTerms() {
        return terms;
    }

    public void setTerms(List<String> terms) {
        this.terms = terms;
    }

    public ReadingRequirementDTO getReadingRequirement() {
        return readingRequirement;
    }

    public void setReadingRequirement(ReadingRequirementDTO readingRequirement) {
        this.readingRequirement = readingRequirement;
    }

    public CaScopeDTO getCaScope() {
        return caScope;
    }

    public void setCaScope(CaScopeDTO caScope) {
        this.caScope = caScope;
    }

    public Boolean getAllowParticipantRename() {
        return allowParticipantRename;
    }

    public void setAllowParticipantRename(Boolean allowParticipantRename) {
        this.allowParticipantRename = allowParticipantRename;
    }

    public static class JoinCheckConfiguration {

        private String verificationMethod;

        private String accessCode;

        private String verificationEmail;

        /**
         * 手机区号 (verificationMethod=sms时使用, 如 +86, +62)
         */
        private String verificationAreaCode;

        /**
         * 手机号码 (verificationMethod=sms时使用)
         */
        private String verificationPhone;

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

        public String getVerificationAreaCode() {
            return verificationAreaCode;
        }

        public void setVerificationAreaCode(String verificationAreaCode) {
            this.verificationAreaCode = verificationAreaCode;
        }

        public String getVerificationPhone() {
            return verificationPhone;
        }

        public void setVerificationPhone(String verificationPhone) {
            this.verificationPhone = verificationPhone;
        }
    }

}
