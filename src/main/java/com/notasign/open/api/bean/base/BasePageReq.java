package com.notasign.open.api.bean.base;

/**
 * 基类分页请求，继承BaseReq的泛型
 * @param <T> 响应数据类型
 * @author Nota
 * 2021/9/11 15:19:05
 */
public abstract class BasePageReq<T> extends BaseReq<T> {
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
