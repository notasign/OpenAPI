package com.notasign.open.api.req.stamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.stamp.StampUserAddResp;

import java.util.List;

/**
 * 添加图章用章员请求
 */
public class StampUserAddReq extends BaseReq<StampUserAddResp> {

    /**
     * 图章ID（路径参数，不参与 JSON 序列化）
     */
    @JsonIgnore
    private String stampId;

    /**
     * 成员ID列表
     */
    private List<String> memberIds;

    public String getStampId() {
        return stampId;
    }

    public void setStampId(String stampId) {
        this.stampId = stampId;
    }

    public List<String> getMemberIds() {
        return memberIds;
    }

    public void setMemberIds(List<String> memberIds) {
        this.memberIds = memberIds;
    }

    @Override
    public Class<StampUserAddResp> getRespClass() {
        return StampUserAddResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.STAMP_USER_ADD, stampId);
    }
}
