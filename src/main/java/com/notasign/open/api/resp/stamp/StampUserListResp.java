package com.notasign.open.api.resp.stamp;

import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;

/**
 * 查询图章用章员响应
 */
public class StampUserListResp extends BaseResp {

    /**
     * 用章员列表
     */
    private List<StampUserItem> stampUsers;

    /**
     * 当前页码
     */
    private Integer pageNumber;

    /**
     * 每页记录数
     */
    private Integer pageSize;

    /**
     * 总页数
     */
    private Integer totalPage;

    /**
     * 总记录数
     */
    private Long totalCount;

    public List<StampUserItem> getStampUsers() {
        return stampUsers;
    }

    public void setStampUsers(List<StampUserItem> stampUsers) {
        this.stampUsers = stampUsers;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }
}
