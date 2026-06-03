package com.notasign.open.api.req.xml;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.xml.RerunValidationJobResp;

import java.util.List;

/**
 * 重跑XML校验任务请求
 */
public class RerunValidationJobReq extends BaseReq<RerunValidationJobResp> {

    @JsonIgnore
    private String jobId;

    private String mode = "FAILED_ONLY";
    private String fromLayer = "XSD";
    private List<Long> targetItemIds;
    private List<String> targetBizIds;

    public String getJobId() { return jobId; }
    public void setJobId(String jobId) { this.jobId = jobId; }
    public String getMode() { return mode; }
    public void setMode(String mode) { this.mode = mode; }
    public String getFromLayer() { return fromLayer; }
    public void setFromLayer(String fromLayer) { this.fromLayer = fromLayer; }
    public List<Long> getTargetItemIds() { return targetItemIds; }
    public void setTargetItemIds(List<Long> targetItemIds) { this.targetItemIds = targetItemIds; }
    public List<String> getTargetBizIds() { return targetBizIds; }
    public void setTargetBizIds(List<String> targetBizIds) { this.targetBizIds = targetBizIds; }

    @Override
    public Class<RerunValidationJobResp> getRespClass() {
        return RerunValidationJobResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.RERUN_XML_VALIDATION, jobId);
    }
}
