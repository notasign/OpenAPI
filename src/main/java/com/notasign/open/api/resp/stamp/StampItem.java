package com.notasign.open.api.resp.stamp;

import com.notasign.open.api.bean.base.BaseResp;

/**
 * 图章信息
 */
public class StampItem extends BaseResp {

    /**
     * 图章ID
     */
    private String stampId;

    /**
     * 图章名称
     */
    private String stampName;

    /**
     * 图章图片预签名URL，无图片或签名失败时为空字符串
     */
    private String stampImageUrl;

    /**
     * 图章创建时间（时间戳，毫秒）
     */
    private Long createTime;

    /**
     * 图章最近更新时间（时间戳，毫秒）
     */
    private Long updateTime;

    public String getStampId() {
        return stampId;
    }

    public void setStampId(String stampId) {
        this.stampId = stampId;
    }

    public String getStampName() {
        return stampName;
    }

    public void setStampName(String stampName) {
        this.stampName = stampName;
    }

    public String getStampImageUrl() {
        return stampImageUrl;
    }

    public void setStampImageUrl(String stampImageUrl) {
        this.stampImageUrl = stampImageUrl;
    }

    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }
}
