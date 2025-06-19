package com.notasign.open.api.req.envelope;


import com.notasign.open.api.bean.base.BasePageReq;
import com.notasign.open.api.resp.envelope.GetEnvelopesResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * @author Nota
 * @date 2025/6/3 10:39
 */
public class GetEnvelopesReq extends BasePageReq {

    private String subject;

    private String envelopeStatus;

    private String startCreateTime;

    private String endCreateTime;

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getEnvelopeStatus() {
        return envelopeStatus;
    }

    public void setEnvelopeStatus(String envelopeStatus) {
        this.envelopeStatus = envelopeStatus;
    }

    public String getStartCreateTime() {
        return startCreateTime;
    }

    public void setStartCreateTime(String startCreateTime) {
        this.startCreateTime = startCreateTime;
    }

    public String getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(String endCreateTime) {
        this.endCreateTime = endCreateTime;
    }

    @Override
    public Class getRespClass() {
        return GetEnvelopesResp.class;
    }

    @Override
    public String getApi(String... params) {
        return OpenApiUrlConstants.GET_ENVELOPES;
    }
}
