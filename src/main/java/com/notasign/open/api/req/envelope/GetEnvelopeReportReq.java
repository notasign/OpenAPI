package com.notasign.open.api.req.envelope;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.resp.envelope.GetEnvelopeReportResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * @author Nota
 * @date 2025/6/12 18:44
 */
public class GetEnvelopeReportReq extends BaseReq<GetEnvelopeReportResp> {

    @JsonIgnore
    private String envelopeId;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    @Override
    public Class<GetEnvelopeReportResp> getRespClass() {
        return GetEnvelopeReportResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.GET_ENVELOPE_REPORT_URL, envelopeId);
    }
}
