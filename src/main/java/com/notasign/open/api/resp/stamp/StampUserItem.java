package com.notasign.open.api.resp.stamp;

import com.notasign.open.api.bean.base.BaseResp;

/**
 * 图章用章员信息
 */
public class StampUserItem extends BaseResp {

    /**
     * 成员ID
     */
    private String memberId;

    /**
     * 成员名称
     */
    private String memberName;

    /**
     * 成员邮箱
     */
    private String memberEmail;

    /**
     * 添加为用章员的时间（时间戳，毫秒）
     */
    private Long addedTime;

    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public Long getAddedTime() {
        return addedTime;
    }

    public void setAddedTime(Long addedTime) {
        this.addedTime = addedTime;
    }
}
