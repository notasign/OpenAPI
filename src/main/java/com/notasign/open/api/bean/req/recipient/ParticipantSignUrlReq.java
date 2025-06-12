package com.notasign.open.api.bean.req.recipient;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.resp.recipient.ParticipantSignUrlResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * @author FADADA
 * @date 2025/6/4 15:54
 */
public class ParticipantSignUrlReq extends BaseReq<ParticipantSignUrlResp> {
    @JsonIgnore
    private String envelopeId;

    private String recipientId;

    private String redirectUrl;


    @Override
    public Class<ParticipantSignUrlResp> getRespClass() {
        return ParticipantSignUrlResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.GET_RECIPIENT_SIGN_URL, envelopeId);
    }

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getRecipientId() {
        return recipientId;
    }

    public void setRecipientId(String recipientId) {
        this.recipientId = recipientId;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
}
