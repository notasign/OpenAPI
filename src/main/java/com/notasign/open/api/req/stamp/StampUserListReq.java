package com.notasign.open.api.req.stamp;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BasePageReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.stamp.StampUserListResp;

/**
 * 查询图章用章员请求
 */
public class StampUserListReq extends BasePageReq<StampUserListResp> {

    /**
     * 图章ID（路径参数，不参与 JSON 序列化）
     */
    @JsonIgnore
    private String stampId;

    /**
     * 成员邮箱，模糊匹配
     */
    private String memberEmail;

    /**
     * 成员姓名，模糊匹配
     */
    private String memberName;

    public String getStampId() {
        return stampId;
    }

    public void setStampId(String stampId) {
        this.stampId = stampId;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    @Override
    public Class<StampUserListResp> getRespClass() {
        return StampUserListResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.STAMP_USER_LIST, stampId);
    }
}
