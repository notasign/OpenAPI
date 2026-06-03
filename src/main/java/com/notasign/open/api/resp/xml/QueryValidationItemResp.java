package com.notasign.open.api.resp.xml;

import com.notasign.open.api.bean.base.BaseResp;

import java.util.Date;
import java.util.List;

/**
 * 分页查询校验文件结果响应
 */
public class QueryValidationItemResp extends BaseResp {

    private Long total;
    private Integer pageNo;
    private Integer pageSize;
    private List<ItemResult> items;

    public Long getTotal() { return total; }
    public void setTotal(Long total) { this.total = total; }
    public Integer getPageNo() { return pageNo; }
    public void setPageNo(Integer pageNo) { this.pageNo = pageNo; }
    public Integer getPageSize() { return pageSize; }
    public void setPageSize(Integer pageSize) { this.pageSize = pageSize; }
    public List<ItemResult> getItems() { return items; }
    public void setItems(List<ItemResult> items) { this.items = items; }

    public static class ItemResult {
        private String itemId;
        private String bizId;
        private String fileName;
        private String status;
        private Boolean valid;
        private Integer attemptNo;
        private String checkpointLayer;
        private QueryValidationJobResp.ItemLayerSummary summary;
        private Integer errorCount;
        private Integer warningCount;
        private Date createdAt;
        private Date updatedAt;

        public String getItemId() { return itemId; }
        public void setItemId(String itemId) { this.itemId = itemId; }
        public String getBizId() { return bizId; }
        public void setBizId(String bizId) { this.bizId = bizId; }
        public String getFileName() { return fileName; }
        public void setFileName(String fileName) { this.fileName = fileName; }
        public String getStatus() { return status; }
        public void setStatus(String status) { this.status = status; }
        public Boolean getValid() { return valid; }
        public void setValid(Boolean valid) { this.valid = valid; }
        public Integer getAttemptNo() { return attemptNo; }
        public void setAttemptNo(Integer attemptNo) { this.attemptNo = attemptNo; }
        public String getCheckpointLayer() { return checkpointLayer; }
        public void setCheckpointLayer(String checkpointLayer) { this.checkpointLayer = checkpointLayer; }
        public QueryValidationJobResp.ItemLayerSummary getSummary() { return summary; }
        public void setSummary(QueryValidationJobResp.ItemLayerSummary summary) { this.summary = summary; }
        public Integer getErrorCount() { return errorCount; }
        public void setErrorCount(Integer errorCount) { this.errorCount = errorCount; }
        public Integer getWarningCount() { return warningCount; }
        public void setWarningCount(Integer warningCount) { this.warningCount = warningCount; }
        public Date getCreatedAt() { return createdAt; }
        public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }
        public Date getUpdatedAt() { return updatedAt; }
        public void setUpdatedAt(Date updatedAt) { this.updatedAt = updatedAt; }
    }
}
