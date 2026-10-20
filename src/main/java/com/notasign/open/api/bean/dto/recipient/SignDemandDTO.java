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

    /**
     * 签名布局样式：horizontal-横向，vertical-纵向，adaptive-自适应（默认）
     */
    private String layoutMode;

    /**
     * 阻塞信息，仅参与方被阻塞时返回
     */
    private BlockInfoDTO blockInfo;

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

    /**
     * 收件人语言（通知文案与签署界面语言），取值为平台支持的语言代码（如 th、vi）；
     * 不传/传空时按系统默认规则解析（未注册收件人邮件用英文、已注册用账号设置语言、签署页未注册用浏览器语言）；
     * 仅本地化系统文案与界面，不翻译自定义的邮件标题/正文
     */
    private String language;

    /**
     * 收件人级通知文案覆盖（邮件标题/正文），不传时回退信封级 subject/remark
     */
    private CustomNotificationDTO customNotification;


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

    public String getLayoutMode() {
        return layoutMode;
    }

    public void setLayoutMode(String layoutMode) {
        this.layoutMode = layoutMode;
    }

    public BlockInfoDTO getBlockInfo() {
        return blockInfo;
    }

    public void setBlockInfo(BlockInfoDTO blockInfo) {
        this.blockInfo = blockInfo;
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

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public CustomNotificationDTO getCustomNotification() {
        return customNotification;
    }

    public void setCustomNotification(CustomNotificationDTO customNotification) {
        this.customNotification = customNotification;
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
