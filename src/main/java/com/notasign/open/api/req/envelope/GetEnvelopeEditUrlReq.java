package com.notasign.open.api.req.envelope;


import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.resp.envelope.GetEnvelopeEditUrlResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * @author Nota
 * @date 2025/6/5 19:54
 */
public class GetEnvelopeEditUrlReq extends BaseReq<GetEnvelopeEditUrlResp> {

    private String envelopeId;

    private String redirectUrl;

    /**
     * 编辑页UI控制选项
     */
    private UiOptions uiOptions;

    @Override
    public Class<GetEnvelopeEditUrlResp> getRespClass() {
        return GetEnvelopeEditUrlResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.GET_ENVELOPE_EDIT_URL;
    }

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public UiOptions getUiOptions() {
        return uiOptions;
    }

    public void setUiOptions(UiOptions uiOptions) {
        this.uiOptions = uiOptions;
    }

    /**
     * 编辑页UI控制选项
     */
    public static class UiOptions {

        /**
         * 是否隐藏发送按钮
         */
        private Boolean hideSendButton;

        /**
         * 禁用的编辑区域，可选值：documents/recipients/carbonCopies/envelopeSettings
         */
        private java.util.List<String> disableScopes;

        public Boolean getHideSendButton() {
            return hideSendButton;
        }

        public void setHideSendButton(Boolean hideSendButton) {
            this.hideSendButton = hideSendButton;
        }

        public java.util.List<String> getDisableScopes() {
            return disableScopes;
        }

        public void setDisableScopes(java.util.List<String> disableScopes) {
            this.disableScopes = disableScopes;
        }
    }
}
