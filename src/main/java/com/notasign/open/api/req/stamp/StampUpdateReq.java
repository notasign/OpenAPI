package com.notasign.open.api.req.stamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.stamp.StampUpdateResp;

/**
 * 更新图章请求
 */
public class StampUpdateReq extends BaseReq<StampUpdateResp> {

    /**
     * 图章ID（路径参数，不参与 JSON 序列化）
     */
    @JsonIgnore
    private String stampId;

    /**
     * 图章名称
     */
    private String stampName;

    /**
     * 图章高度（毫米），不传保持原值
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

    @Override
    public Class<StampUpdateResp> getRespClass() {
        return StampUpdateResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.STAMP_UPDATE, stampId);
    }
}
