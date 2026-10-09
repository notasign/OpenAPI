package com.notasign.open.api.resp.bulksend;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.notasign.open.api.bean.base.BaseResp;

/**
 * 创建/更新批量发送清单响应
 */
public class CreateBulkSendListResp extends BaseResp {

    /**
     * 批量发送清单ID（服务端JSON键为 bulkSendListId）
     */
    @JsonProperty("bulkSendListId")
    private String bulkSendListID;

    /**
     * 创建时间，Unix标准时间戳（毫秒）
     */
    private String createTime;

    public String getBulkSendListID() {
        return bulkSendListID;
    }

    public void setBulkSendListID(String bulkSendListID) {
        this.bulkSendListID = bulkSendListID;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
}
