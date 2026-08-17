package com.notasign.open.api.resp.bulksend;

import com.notasign.open.api.bean.base.BaseResp;

/**
 * 获取批量发送任务编辑链接响应
 */
public class GetBulkSendTaskEditUrlResp extends BaseResp {

    /**
     * 批量发送任务编辑链接
     */
    private String editUrl;

    /**
     * 链接过期时间，Unix标准时间戳（毫秒）
     */
    private Long expiresTime;

    public String getEditUrl() {
        return editUrl;
    }

    public void setEditUrl(String editUrl) {
        this.editUrl = editUrl;
    }

    public Long getExpiresTime() {
        return expiresTime;
    }

    public void setExpiresTime(Long expiresTime) {
        this.expiresTime = expiresTime;
    }
}
