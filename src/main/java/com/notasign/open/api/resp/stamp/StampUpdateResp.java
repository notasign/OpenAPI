package com.notasign.open.api.resp.stamp;

import com.notasign.open.api.bean.base.BaseResp;

/**
 * 更新图章响应
 */
public class StampUpdateResp extends BaseResp {

    /**
     * 图章ID
     */
    private String stampId;

    /**
     * 图章名称
     */
    private String stampName;

    /**
     * 图章高度（毫米）
     */
    private Integer stampHeightMm;

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

    public Integer getStampHeightMm() {
        return stampHeightMm;
    }

    public void setStampHeightMm(Integer stampHeightMm) {
        this.stampHeightMm = stampHeightMm;
    }
}
