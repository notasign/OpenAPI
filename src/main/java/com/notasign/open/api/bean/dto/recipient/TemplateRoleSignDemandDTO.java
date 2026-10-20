package com.notasign.open.api.bean.dto.recipient;

import java.util.List;

/**
 * @author Fadada
 * @date 2025/5/22 17:08
 */
public class TemplateRoleSignDemandDTO {

    private ESealConfigDTO esealConfig;

    private List<String> signatureOptions;

    private BlockConfigDTO blockConfig;

    private List<SignDemandDTO.JoinCheckConfiguration> identityVerifications;

    private ReadingRequirementDTO readingRequirement;

    private List<String> terms;

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
     * 不传/传空时按系统默认规则解析；基于模板创建信封时带入为已覆盖值
     */
    private String language;

    /**
     * 收件人级通知文案覆盖（邮件标题/正文），不传时回退信封级 subject/remark；
     * 基于模板创建信封时带入为已覆盖值
     */
    private CustomNotificationDTO customNotification;

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

    public List<SignDemandDTO.JoinCheckConfiguration> getIdentityVerifications() {
        return identityVerifications;
    }

    public void setIdentityVerifications(List<SignDemandDTO.JoinCheckConfiguration> identityVerifications) {
        this.identityVerifications = identityVerifications;
    }

    public ReadingRequirementDTO getReadingRequirement() {
        return readingRequirement;
    }

    public void setReadingRequirement(ReadingRequirementDTO readingRequirement) {
        this.readingRequirement = readingRequirement;
    }

    public List<String> getTerms() {
        return terms;
    }

    public void setTerms(List<String> terms) {
        this.terms = terms;
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
}
