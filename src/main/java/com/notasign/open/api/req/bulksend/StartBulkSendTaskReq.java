package com.notasign.open.api.req.bulksend;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.bulksend.StartBulkSendTaskResp;

/**
 * 启动批量发送任务请求
 */
public class StartBulkSendTaskReq extends BaseReq<StartBulkSendTaskResp> {

    /**
     * 批次ID，必填
     */
    private String bulkId;

    public String getBulkId() {
        return bulkId;
    }

    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    @Override
    public Class<StartBulkSendTaskResp> getRespClass() {
        return StartBulkSendTaskResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.BULK_TASK_START;
    }
}
