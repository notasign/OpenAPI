package com.notasign.open.api.bean.base;

/**
 * @author Fadada
 * 2021/9/11 15:31:15
 */
public class BasePageResp extends BaseResp {
    private Integer pageNumber;
    private Integer pageSize;
    private Integer totalPage;
    private Integer totalCount;

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

    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }
}
