package com.notasign.open.api.req.xml;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.xml.QueryValidationItemResp;

/**
 * 分页查询校验文件结果请求
 */
public class QueryValidationItemReq extends BaseReq<QueryValidationItemResp> {

    @JsonIgnore
    private String jobId;

    private Integer pageNo = 1;
    private Integer pageSize = 100;
    private String status;
    private Boolean valid;
    private String bizId;
    private String fileName;

    public String getJobId() { return jobId; }
    public void setJobId(String jobId) { this.jobId = jobId; }
    public Integer getPageNo() { return pageNo; }
    public void setPageNo(Integer pageNo) { this.pageNo = pageNo; }
    public Integer getPageSize() { return pageSize; }
    public void setPageSize(Integer pageSize) { this.pageSize = pageSize; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Boolean getValid() { return valid; }
    public void setValid(Boolean valid) { this.valid = valid; }
    public String getBizId() { return bizId; }
    public void setBizId(String bizId) { this.bizId = bizId; }
    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }

    @Override
    public Class<QueryValidationItemResp> getRespClass() {
        return QueryValidationItemResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.GET_XML_VALIDATION_ITEMS, jobId);
    }
}
