package com.notasign.open.api.req.bulksend;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.bulksend.GetBulkSendTaskEditUrlResp;

/**
 * 获取批量发送任务编辑链接请求
 */
public class GetBulkSendTaskEditUrlReq extends BaseReq<GetBulkSendTaskEditUrlResp> {

    /**
     * 批次ID
     */
    private String bulkId;

    /**
     * 编辑完成后的回调跳转地址
     */
    private String redirectUrl;

    /**
     * 编辑页UI控制选项
     */
    private UiOptions uiOptions;

    public String getBulkId() {
        return bulkId;
    }

    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
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

    @Override
    public Class<GetBulkSendTaskEditUrlResp> getRespClass() {
        return GetBulkSendTaskEditUrlResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.BULK_TASK_EDIT_URL;
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
