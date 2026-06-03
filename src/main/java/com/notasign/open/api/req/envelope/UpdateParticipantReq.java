package com.notasign.open.api.req.envelope;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.base.EmptyResp;
import com.notasign.open.api.bean.dto.recipient.SignDemandDTO;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * 更新信封参与方请求
 */
public class UpdateParticipantReq extends BaseReq<EmptyResp> {

    @JsonIgnore
    private String envelopeId;

    @JsonIgnore
    private String participantId;

    private String participantName;
    private String phoneCountryCode;
    private String phoneNumber;
    private String email;
    private String signingMode;
    private SignDemandDTO signDemand;

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

    public String getParticipantName() {
        return participantName;
    }

    public void setParticipantName(String participantName) {
        this.participantName = participantName;
    }

    public String getPhoneCountryCode() {
        return phoneCountryCode;
    }

    public void setPhoneCountryCode(String phoneCountryCode) {
        this.phoneCountryCode = phoneCountryCode;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSigningMode() {
        return signingMode;
    }

    public void setSigningMode(String signingMode) {
        this.signingMode = signingMode;
    }

    public SignDemandDTO getSignDemand() {
        return signDemand;
    }

    public void setSignDemand(SignDemandDTO signDemand) {
        this.signDemand = signDemand;
    }

    @Override
    public Class<EmptyResp> getRespClass() {
        return EmptyResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.UPDATE_PARTICIPANT, envelopeId, participantId);
    }
}
