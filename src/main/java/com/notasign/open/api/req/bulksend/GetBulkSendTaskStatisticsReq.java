package com.notasign.open.api.req.bulksend;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.bulksend.BulkSendTaskStatisticsResp;

/**
 * 查询批量发送任务统计请求
 */
public class GetBulkSendTaskStatisticsReq extends BaseReq<BulkSendTaskStatisticsResp> {

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
    public Class<BulkSendTaskStatisticsResp> getRespClass() {
        return BulkSendTaskStatisticsResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.BULK_TASK_STATISTICS, bulkId);
    }
}
