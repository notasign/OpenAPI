package com.notasign.open.api.resp.envelope;


import com.notasign.open.api.bean.base.BaseResp;

/**
 * @author FADADA
 * @date 2025/6/9 17:28
 */
public class GetEnvelopeReportResp extends BaseResp {

    private String reportUrl;

    public String getReportUrl() {
        return reportUrl;
    }

    public void setReportUrl(String reportUrl) {
        this.reportUrl = reportUrl;
    }
}
