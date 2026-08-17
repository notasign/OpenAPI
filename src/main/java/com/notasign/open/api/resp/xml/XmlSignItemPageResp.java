package com.notasign.open.api.resp.xml;

import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;

/**
 * XML签署文件结果分页响应
 */
public class XmlSignItemPageResp extends BaseResp {

    /**
     * 批次ID
     */
    private String batchId;

    /**
     * 总数
     */
    private Long total;

    /**
     * 页码
     */
    private Integer pageNo;

    /**
     * 每页大小
     */
    private Integer pageSize;

    /**
     * 文件级结果
     */
    private List<XmlSignTaskResp.Item> items;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public List<XmlSignTaskResp.Item> getItems() {
        return items;
    }

    public void setItems(List<XmlSignTaskResp.Item> items) {
        this.items = items;
    }
}
