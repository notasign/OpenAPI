package com.notasign.open.api.resp.stamp;

import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;

/**
 * 移除图章用章员响应
 */
public class StampUserRemoveResp extends BaseResp {

    /**
     * 实际移除的成员ID
     */
    private List<String> removedMemberIds;

    public List<String> getRemovedMemberIds() {
        return removedMemberIds;
    }

    public void setRemovedMemberIds(List<String> removedMemberIds) {
        this.removedMemberIds = removedMemberIds;
    }
}
