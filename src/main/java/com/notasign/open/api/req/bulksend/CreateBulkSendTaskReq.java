package com.notasign.open.api.req.bulksend;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.bulksend.CreateBulkSendTaskResp;

/**
 * 创建批量发送任务请求
 */
public class CreateBulkSendTaskReq extends BaseReq<CreateBulkSendTaskResp> {

    /**
     * 批量任务名称，必填，最大128字符
     */
    private String bulkName;

    /**
     * 批量发送清单ID
     */
    private String bulkSendListId;

    /**
     * 来源类型，必填：TEMPLATE-模板，ENVELOPE-信封
     */
    private String sourceType;

    /**
     * 来源ID（模板ID或信封ID），必填
     */
    private String sourceId;

    /**
     * 是否自动启动，必填：true-创建后自动启动，false-创建后暂不启动
     */
    private Boolean autoStart;

    public String getBulkName() {
        return bulkName;
    }

    public void setBulkName(String bulkName) {
        this.bulkName = bulkName;
    }

    public String getBulkSendListId() {
        return bulkSendListId;
    }

    public void setBulkSendListId(String bulkSendListId) {
        this.bulkSendListId = bulkSendListId;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public Boolean getAutoStart() {
        return autoStart;
    }

    public void setAutoStart(Boolean autoStart) {
        this.autoStart = autoStart;
    }

    @Override
    public Class<CreateBulkSendTaskResp> getRespClass() {
        return CreateBulkSendTaskResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.BULK_TASK_CREATE;
    }
}
