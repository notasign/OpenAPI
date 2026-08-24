package com.notasign.open.api.req.recipient;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.resp.recipient.ParticipantSignUrlResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

import java.util.List;

/**
 * @author Nota
 * @date 2025/6/4 15:54
 */
public class ParticipantSignUrlReq extends BaseReq<ParticipantSignUrlResp> {
    @JsonIgnore
    private String envelopeId;

    private String participantId;

    private String redirectUrl;

    /**
     * 允许嵌入本签署页面的父页面 Origin 白名单（可选）。
     * null 表示未传入（走下游默认策略）；空数组等价于清空白名单
     */
    private List<String> frameAncestors;


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

    public List<String> getFrameAncestors() {
        return frameAncestors;
    }

    public void setFrameAncestors(List<String> frameAncestors) {
        this.frameAncestors = frameAncestors;
    }
}
