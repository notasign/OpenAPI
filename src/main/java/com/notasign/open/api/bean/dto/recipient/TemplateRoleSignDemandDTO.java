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
}
