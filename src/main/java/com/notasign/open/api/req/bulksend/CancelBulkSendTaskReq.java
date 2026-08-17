package com.notasign.open.api.req.bulksend;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.base.EmptyResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * 撤销批量发送任务请求（别名路径）
 */
public class CancelBulkSendTaskReq extends BaseReq<EmptyResp> {

    /**
     * 批次ID，路径参数
     */
    @JsonIgnore
    private String bulkId;

    /**
     * 撤销原因，必填，最大200字符
     */
    private String reason;

    public String getBulkId() {
        return bulkId;
    }

    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    @Override
    public Class<EmptyResp> getRespClass() {
        return EmptyResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.BULK_TASK_CANCEL, bulkId);
    }
}
