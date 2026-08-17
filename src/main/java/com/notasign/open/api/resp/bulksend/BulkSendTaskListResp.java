package com.notasign.open.api.resp.bulksend;

import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;

/**
 * 批量发送任务列表分页响应
 */
public class BulkSendTaskListResp extends BaseResp {

    /**
     * 总记录数
     */
    private Long total;

    /**
     * 当前页码
     */
    private Integer pageNum;

    /**
     * 每页大小
     */
    private Integer pageSize;

    /**
     * 总页数
     */
    private Long totalPages;

    /**
     * 任务列表
     */
    private List<BulkSendTaskListItemResp> list;

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(Long totalPages) {
        this.totalPages = totalPages;
    }

    public List<BulkSendTaskListItemResp> getList() {
        return list;
    }

    public void setList(List<BulkSendTaskListItemResp> list) {
        this.list = list;
    }
}
