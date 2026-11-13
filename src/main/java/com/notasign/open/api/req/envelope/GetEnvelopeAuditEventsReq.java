package com.notasign.open.api.req.envelope;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.envelope.EnvelopeAuditEventResp;

/**
 * 查询信封审计事件请求
 */
public class GetEnvelopeAuditEventsReq extends BaseReq<EnvelopeAuditEventResp> {

    /**
     * 信封ID，路径参数
     */
    @JsonIgnore
    private String envelopeId;

    /**
     * 操作说明文案语言，取值为平台支持的语言代码（如 en、th、vi）；缺失默认 en
     */
    private String language;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    @Override
    public Class<EnvelopeAuditEventResp> getRespClass() {
        return EnvelopeAuditEventResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.GET_ENVELOPE_AUDIT_EVENTS, envelopeId);
    }
}
