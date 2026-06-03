package com.notasign.open.api.req.envelope;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.base.EmptyResp;
import com.notasign.open.api.bean.dto.recipient.AddEnvelopeParticipantDTO;
import com.notasign.open.api.constants.OpenApiUrlConstants;

import java.util.List;

/**
 * 添加信封参与方请求
 */
public class AddParticipantsReq extends BaseReq<EmptyResp> {

    @JsonIgnore
    private String envelopeId;

    private List<AddEnvelopeParticipantDTO> participants;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public List<AddEnvelopeParticipantDTO> getParticipants() {
        return participants;
    }

    public void setParticipants(List<AddEnvelopeParticipantDTO> participants) {
        this.participants = participants;
    }

    @Override
    public Class<EmptyResp> getRespClass() {
        return EmptyResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.ADD_PARTICIPANTS, envelopeId);
    }
}
