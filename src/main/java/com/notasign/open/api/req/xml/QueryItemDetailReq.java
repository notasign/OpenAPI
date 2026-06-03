package com.notasign.open.api.req.xml;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.xml.QueryItemDetailResp;

import java.util.List;

/**
 * 查询文件结果明细请求
 */
public class QueryItemDetailReq extends BaseReq<List<QueryItemDetailResp>> {

    @JsonIgnore
    private String jobId;

    @JsonIgnore
    private String bizId;

    public String getJobId() { return jobId; }
    public void setJobId(String jobId) { this.jobId = jobId; }
    public String getBizId() { return bizId; }
    public void setBizId(String bizId) { this.bizId = bizId; }

    @Override
    public Class<List<QueryItemDetailResp>> getRespClass() {
        return (Class<List<QueryItemDetailResp>>) (Class<?>) List.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.GET_XML_VALIDATION_ITEM_DETAIL, jobId, bizId);
    }
}
