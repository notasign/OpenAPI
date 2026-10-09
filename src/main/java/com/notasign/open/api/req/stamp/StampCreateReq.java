package com.notasign.open.api.req.stamp;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.stamp.StampCreateResp;

/**
 * 创建图章请求
 */
public class StampCreateReq extends BaseReq<StampCreateResp> {

    /**
     * 图章名称
     */
    private String stampName;

    /**
     * 图章高度（毫米），不传默认 15
     */
    private Integer stampHeightMm;

    /**
     * 图章图片 base64（与 stampFileId 二选一）
     */
    private String stampImage;

    /**
     * 图章图片文件ID（与 stampImage 二选一）
     */
    private String stampFileId;

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

    public String getStampImage() {
        return stampImage;
    }

    public void setStampImage(String stampImage) {
        this.stampImage = stampImage;
    }

    public String getStampFileId() {
        return stampFileId;
    }

    public void setStampFileId(String stampFileId) {
        this.stampFileId = stampFileId;
    }

    @Override
    public Class<StampCreateResp> getRespClass() {
        return StampCreateResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.STAMP_CREATE;
    }
}
