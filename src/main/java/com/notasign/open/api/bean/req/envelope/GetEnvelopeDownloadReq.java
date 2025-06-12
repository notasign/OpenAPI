package com.notasign.open.api.bean.req.envelope;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.resp.envelope.GetEnvelopeDownloadResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * @author FADADA
 * @date 2025/6/4 15:04
 */

public class GetEnvelopeDownloadReq extends BaseReq<GetEnvelopeDownloadResp> {

    @JsonIgnore
    private String envelopeId;

    private String customFileName;

    @Override
    public Class<GetEnvelopeDownloadResp> getRespClass() {
        return GetEnvelopeDownloadResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.GET_ENVELOPE_DOWNLOAD_URL, envelopeId);
    }

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getCustomFileName() {
        return customFileName;
    }

    public void setCustomFileName(String customFileName) {
        this.customFileName = customFileName;
    }
}
