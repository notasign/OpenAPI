package com.notasign.open.api.req.stamp;

import com.notasign.open.api.bean.base.BasePageReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.stamp.StampListResp;

/**
 * 查询图章列表请求
 */
public class StampListReq extends BasePageReq<StampListResp> {

    /**
     * 图章名称，模糊匹配
     */
    private String stampName;

    /**
     * 图章ID，精确匹配
     */
    private String stampId;

    public String getStampName() {
        return stampName;
    }

    public void setStampName(String stampName) {
        this.stampName = stampName;
    }

    public String getStampId() {
        return stampId;
    }

    public void setStampId(String stampId) {
        this.stampId = stampId;
    }

    @Override
    public Class<StampListResp> getRespClass() {
        return StampListResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.STAMP_LIST;
    }
}
