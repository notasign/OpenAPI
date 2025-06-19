package com.notasign.open.api.req.recipient;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.resp.recipient.ParticipantSignUrlResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * @author Nota
 * @date 2025/6/4 15:54
 */
public class ParticipantSignUrlReq extends BaseReq<ParticipantSignUrlResp> {
    @JsonIgnore
    private String envelopeId;

    private String participantId;

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

    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }
}
