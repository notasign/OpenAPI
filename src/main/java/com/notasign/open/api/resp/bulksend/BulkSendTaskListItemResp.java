package com.notasign.open.api.resp.bulksend;

import com.notasign.open.api.bean.base.BaseResp;

/**
 * 批量发送任务列表项响应
 */
public class BulkSendTaskListItemResp extends BaseResp {

    /**
     * 批次ID
     */
    private String bulkId;

    /**
     * 批次名称
     */
    private String bulkName;

    /**
     * 批次状态：pending-未启动，running-执行中，ended-已结束
     */
    private String bulkStatus;

    /**
     * 信封数
     */
    private Integer bulkSize;

    /**
     * 创建时间，Unix标准时间戳（毫秒）
     */
    private String createTime;

    /**
     * 发送时间，Unix标准时间戳（毫秒）
     */
    private String updateTime;

    public String getBulkId() {
        return bulkId;
    }

    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    public String getBulkName() {
        return bulkName;
    }

    public void setBulkName(String bulkName) {
        this.bulkName = bulkName;
    }

    public String getBulkStatus() {
        return bulkStatus;
    }

    public void setBulkStatus(String bulkStatus) {
        this.bulkStatus = bulkStatus;
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

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
