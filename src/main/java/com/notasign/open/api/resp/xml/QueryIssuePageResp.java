package com.notasign.open.api.resp.xml;

import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;

/**
 * XML校验问题分页响应
 */
public class QueryIssuePageResp extends BaseResp {

    private String jobId;
    private String bizId;
    private Integer attemptNo;
    private Long total;
    private Integer pageNo;
    private Integer pageSize;
    private List<QueryItemDetailResp.IssueDetail> records;

    public String getJobId() { return jobId; }
    public void setJobId(String jobId) { this.jobId = jobId; }
    public String getBizId() { return bizId; }
    public void setBizId(String bizId) { this.bizId = bizId; }
    public Integer getAttemptNo() { return attemptNo; }
    public void setAttemptNo(Integer attemptNo) { this.attemptNo = attemptNo; }
    public Long getTotal() { return total; }
    public void setTotal(Long total) { this.total = total; }
    public Integer getPageNo() { return pageNo; }
    public void setPageNo(Integer pageNo) { this.pageNo = pageNo; }
    public Integer getPageSize() { return pageSize; }
    public void setPageSize(Integer pageSize) { this.pageSize = pageSize; }
    public List<QueryItemDetailResp.IssueDetail> getRecords() { return records; }
    public void setRecords(List<QueryItemDetailResp.IssueDetail> records) { this.records = records; }
}
