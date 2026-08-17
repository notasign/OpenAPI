package com.notasign.open.api.resp.bulksend;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.notasign.open.api.bean.base.BaseResp;

/**
 * 启动批量发送任务响应
 */
public class StartBulkSendTaskResp extends BaseResp {

    /**
     * 批次ID
     */
    @JsonProperty("bulkID")
    private String bulkID;

    /**
     * 批次信封数
     */
    private Integer bulkSize;

    /**
     * 发送时间，Unix标准时间戳（毫秒）
     */
    private String createTime;

    public String getBulkID() {
        return bulkID;
    }

    public void setBulkID(String bulkID) {
        this.bulkID = bulkID;
    }

    public Integer getBulkSize() {
        return bulkSize;
    }

    public void setBulkSize(Integer bulkSize) {
        this.bulkSize = bulkSize;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
