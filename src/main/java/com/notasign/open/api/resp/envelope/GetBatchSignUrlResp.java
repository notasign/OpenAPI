package com.notasign.open.api.resp.envelope;

import com.notasign.open.api.bean.base.BaseResp;

/**
 * 获取批量签署页面链接响应
 */
public class GetBatchSignUrlResp extends BaseResp {

    /**
     * 批量签署页面链接
     */
    private String batchSignUrl;

    public String getBatchSignUrl() {
        return batchSignUrl;
    }

    public void setBatchSignUrl(String batchSignUrl) {
        this.batchSignUrl = batchSignUrl;
    }
}
