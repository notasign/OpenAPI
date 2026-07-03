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
}
