package com.notasign.open.api.resp.stamp;

import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;

/**
 * 添加图章用章员响应
 */
public class StampUserAddResp extends BaseResp {

    /**
     * 本次新增的用章员
     */
    private List<StampUserItem> addedStampUsers;

    /**
     * 已是用章员而被跳过的成员ID
     */
    private List<String> skippedMemberIds;

    public List<StampUserItem> getAddedStampUsers() {
        return addedStampUsers;
    }

    public void setAddedStampUsers(List<StampUserItem> addedStampUsers) {
        this.addedStampUsers = addedStampUsers;
    }

    public List<String> getSkippedMemberIds() {
        return skippedMemberIds;
    }

    public void setSkippedMemberIds(List<String> skippedMemberIds) {
        this.skippedMemberIds = skippedMemberIds;
    }
}
