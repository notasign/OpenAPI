package com.notasign.open.api.resp.xml;

import com.notasign.open.api.bean.base.BaseResp;

/**
 * 创建XML校验任务响应
 */
public class CreateValidationJobResp extends BaseResp {

    private String jobId;
    private String status;

    public String getJobId() { return jobId; }
    public void setJobId(String jobId) { this.jobId = jobId; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
}
