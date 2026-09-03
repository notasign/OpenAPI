package com.notasign.open.api.req.stamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.base.EmptyResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * 删除图章请求
 */
public class StampDeleteReq extends BaseReq<EmptyResp> {

    /**
     * 图章ID（路径参数，不参与 JSON 序列化）
     */
    @JsonIgnore
    private String stampId;

    public String getStampId() {
        return stampId;
    }

    public void setStampId(String stampId) {
        this.stampId = stampId;
    }

    @Override
    public Class<EmptyResp> getRespClass() {
        return EmptyResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.STAMP_DELETE, stampId);
    }
}
