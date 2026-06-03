package com.notasign.open.api.resp.xml;

import com.notasign.open.api.bean.base.BaseResp;

/**
 * XML校验任务重跑响应
 */
public class RerunValidationJobResp extends BaseResp {

    private String jobId;
    private String status;
    private Integer rerunItemCount;
    private String effectiveFromLayer;

    public String getJobId() { return jobId; }
    public void setJobId(String jobId) { this.jobId = jobId; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Integer getRerunItemCount() { return rerunItemCount; }
    public void setRerunItemCount(Integer rerunItemCount) { this.rerunItemCount = rerunItemCount; }
    public String getEffectiveFromLayer() { return effectiveFromLayer; }
    public void setEffectiveFromLayer(String effectiveFromLayer) { this.effectiveFromLayer = effectiveFromLayer; }
}
