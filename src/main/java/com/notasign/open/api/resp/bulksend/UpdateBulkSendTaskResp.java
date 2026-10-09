package com.notasign.open.api.resp.bulksend;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.notasign.open.api.bean.base.BaseResp;

/**
 * 更新批量发送任务响应
 */
public class UpdateBulkSendTaskResp extends BaseResp {

    /**
     * 批次ID（服务端JSON键为 bulkId）
     */
    @JsonProperty("bulkId")
    private String bulkID;

    /**
     * 批次信封数
     */
    private String bulkSize;

    /**
     * 更新时间，Unix标准时间戳（毫秒）
     */
    private String createTime;

    /**
     * 批次名称
     */
    private String bulkName;

    /**
     * 任务来源类型
     */
    private String sourceType;

    /**
     * 任务来源ID
     */
    private String sourceId;

    public String getBulkID() {
        return bulkID;
    }

    public void setBulkID(String bulkID) {
        this.bulkID = bulkID;
    }

    public String getBulkSize() {
        return bulkSize;
    }

    public void setBulkSize(String bulkSize) {
        this.bulkSize = bulkSize;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getBulkName() {
        return bulkName;
    }

    public void setBulkName(String bulkName) {
        this.bulkName = bulkName;
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
}
