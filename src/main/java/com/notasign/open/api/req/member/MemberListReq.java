package com.notasign.open.api.req.member;

import com.notasign.open.api.bean.base.BasePageReq;
import com.notasign.open.api.bean.base.BaseResp;
import com.notasign.open.api.resp.member.MemberListResp;

/**
 * 查询成员列表请求
 */
public class MemberListReq extends BasePageReq<MemberListResp> {

    private String memberEmail;
    private String memberStatus;

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public String getMemberStatus() {
        return memberStatus;
    }

    public void setMemberStatus(String memberStatus) {
        this.memberStatus = memberStatus;
    }

    @Override
    public Class<MemberListResp> getRespClass() {
        return MemberListResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return com.notasign.open.api.constants.OpenApiUrlConstants.GET_MEMBER_LIST;
    }
}
