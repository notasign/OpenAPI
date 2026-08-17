package com.notasign.open.api.req.bulksend;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.base.EmptyResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * 提醒批量发送任务待签署方请求
 */
public class RemindBulkSendTaskReq extends BaseReq<EmptyResp> {

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
    public Class<EmptyResp> getRespClass() {
        return EmptyResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.BULK_TASK_REMIND, bulkId);
    }
}
