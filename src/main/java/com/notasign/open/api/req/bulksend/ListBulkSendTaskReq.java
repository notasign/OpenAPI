package com.notasign.open.api.req.bulksend;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.bulksend.BulkSendTaskListResp;

/**
 * 查询批量发送任务列表请求
 */
public class ListBulkSendTaskReq extends BaseReq<BulkSendTaskListResp> {

    /**
     * 批次状态：pending-未启动，running-执行中，ended-已结束
     */
    private String bulkStatus;

    /**
     * 批次名称，模糊匹配
     */
    private String bulkName;

    /**
     * 批次ID
     */
    private String bulkId;

    /**
     * 创建开始时间，Unix标准时间戳（毫秒）
     */
    private Long startCreateTime;

    /**
     * 创建结束时间，Unix标准时间戳（毫秒）
     */
    private Long endCreateTime;

    /**
     * 页码，默认1
     */
    private Integer pageNum;

    /**
     * 每页大小，默认10，最大100
     */
    private Integer pageSize;

    public String getBulkStatus() {
        return bulkStatus;
    }

    public void setBulkStatus(String bulkStatus) {
        this.bulkStatus = bulkStatus;
    }

    public String getBulkName() {
        return bulkName;
    }

    public void setBulkName(String bulkName) {
        this.bulkName = bulkName;
    }

    public String getBulkId() {
        return bulkId;
    }

    public void setBulkId(String bulkId) {
        this.bulkId = bulkId;
    }

    public Long getStartCreateTime() {
        return startCreateTime;
    }

    public void setStartCreateTime(Long startCreateTime) {
        this.startCreateTime = startCreateTime;
    }

    public Long getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(Long endCreateTime) {
        this.endCreateTime = endCreateTime;
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

    @Override
    public Class<BulkSendTaskListResp> getRespClass() {
        return BulkSendTaskListResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.BULK_TASK_LIST;
    }
}
