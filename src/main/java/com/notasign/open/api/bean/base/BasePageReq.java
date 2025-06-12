package com.notasign.open.api.bean.base;

/**
 * @author Fadada
 * 2021/9/11 15:19:05
 */
public abstract class BasePageReq extends BaseReq {
    private Integer pageNumber;
    private Integer pageSize;

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
}
