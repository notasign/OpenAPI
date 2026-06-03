package com.notasign.open.api.req.xml;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.xml.QueryIssuePageResp;

/**
 * 分页查询XML校验问题请求
 */
public class QueryValidationIssueReq extends BaseReq<QueryIssuePageResp> {

    @JsonIgnore
    private String jobId;

    @JsonIgnore
    private String bizId;

    private Integer pageNo = 1;
    private Integer pageSize = 500;
    private String severity;
    private String layer;
    private Integer attemptNo;

    public String getJobId() { return jobId; }
    public void setJobId(String jobId) { this.jobId = jobId; }
    public String getBizId() { return bizId; }
    public void setBizId(String bizId) { this.bizId = bizId; }
    public Integer getPageNo() { return pageNo; }
    public void setPageNo(Integer pageNo) { this.pageNo = pageNo; }
    public Integer getPageSize() { return pageSize; }
    public void setPageSize(Integer pageSize) { this.pageSize = pageSize; }
    public String getSeverity() { return severity; }
    public void setSeverity(String severity) { this.severity = severity; }
    public String getLayer() { return layer; }
    public void setLayer(String layer) { this.layer = layer; }
    public Integer getAttemptNo() { return attemptNo; }
    public void setAttemptNo(Integer attemptNo) { this.attemptNo = attemptNo; }

    @Override
    public Class<QueryIssuePageResp> getRespClass() {
        return QueryIssuePageResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.GET_XML_VALIDATION_ITEM_ISSUES, jobId, bizId);
    }
}
