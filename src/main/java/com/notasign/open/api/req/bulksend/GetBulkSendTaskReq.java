package com.notasign.open.api.req.bulksend;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.bulksend.BulkSendTaskDetailResp;

/**
 * 查询批量发送任务详情请求（别名路径）
 */
public class GetBulkSendTaskReq extends BaseReq<BulkSendTaskDetailResp> {

    /**
     * 批次ID，路径参数
     */
    @JsonIgnore
    private String bulkId;

    public String getBulkId() {
        return bulkId;
    }

    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    @Override
    public Class<BulkSendTaskDetailResp> getRespClass() {
        return BulkSendTaskDetailResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.BULK_TASK_GET, bulkId);
    }
}
