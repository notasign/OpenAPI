package com.notasign.open.api.bean.dto.recipient;

/**
 * CA限定配置DTO
 */
public class CaScopeDTO {

    /**
     * 限定模式：unrestricted-不限定，specified-限定指定CA
     */
    private String mode;

    /**
     * CA提供方，mode=specified时有效，
     * 可选值：digisign-id-one/zxca/iamsmart/vinotek/fpt
     */
    private String caProvider;

    /**
     * 是否启用DS KYC校验
     */
    private Boolean dsKycEnabled;

    public String getMode() {
        return mode;
    }

    public void setMode(String mode) {
        this.mode = mode;
    }

    public String getCaProvider() {
        return caProvider;
    }

    public void setCaProvider(String caProvider) {
        this.caProvider = caProvider;
    }

    public Boolean getDsKycEnabled() {
        return dsKycEnabled;
    }

    public void setDsKycEnabled(Boolean dsKycEnabled) {
        this.dsKycEnabled = dsKycEnabled;
    }
}
