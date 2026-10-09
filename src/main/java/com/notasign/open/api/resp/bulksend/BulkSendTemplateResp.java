package com.notasign.open.api.resp.bulksend;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.notasign.open.api.bean.base.BaseResp;

/**
 * 获取批量发送清单模板下载地址响应
 */
public class BulkSendTemplateResp extends BaseResp {

    /**
     * 模板下载地址（服务端JSON键为 downloadUrl）
     */
    @JsonProperty("downloadUrl")
    private String templateUrl;

    /**
     * 链接过期时间，Unix标准时间戳（毫秒）
     */
    private Long expiresTime;

    public String getTemplateUrl() {
        return templateUrl;
    }

    public void setTemplateUrl(String templateUrl) {
        this.templateUrl = templateUrl;
    }

    public Long getExpiresTime() {
        return expiresTime;
    }

    public void setExpiresTime(Long expiresTime) {
        this.expiresTime = expiresTime;
    }
}
