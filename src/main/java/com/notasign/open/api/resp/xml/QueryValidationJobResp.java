package com.notasign.open.api.resp.xml;

import com.notasign.open.api.bean.base.BaseResp;

import java.util.Date;
import java.util.List;

/**
 * 查询XML校验任务状态与汇总响应
 */
public class QueryValidationJobResp extends BaseResp {

    private String jobId;
    private String creatorAppId;
    private String requestId;
    private String status;
    private Boolean valid;
    private String profileCode;
    private String runMode;
    private Date createdAt;
    private Date updatedAt;
    private ProgressInfo progress;
    private JobSummary summary;
    private List<ItemSummary> items;
    private String xsdProfileCode;
    private String xsdSchemaVersion;

    public String getJobId() { return jobId; }
    public void setJobId(String jobId) { this.jobId = jobId; }
    public String getCreatorAppId() { return creatorAppId; }
    public void setCreatorAppId(String creatorAppId) { this.creatorAppId = creatorAppId; }
    public String getRequestId() { return requestId; }
    public void setRequestId(String requestId) { this.requestId = requestId; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Boolean getValid() { return valid; }
    public void setValid(Boolean valid) { this.valid = valid; }
    public String getProfileCode() { return profileCode; }
    public void setProfileCode(String profileCode) { this.profileCode = profileCode; }
    public String getRunMode() { return runMode; }
    public void setRunMode(String runMode) { this.runMode = runMode; }
    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }
    public Date getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Date updatedAt) { this.updatedAt = updatedAt; }
    public ProgressInfo getProgress() { return progress; }
    public void setProgress(ProgressInfo progress) { this.progress = progress; }
    public JobSummary getSummary() { return summary; }
    public void setSummary(JobSummary summary) { this.summary = summary; }
    public List<ItemSummary> getItems() { return items; }
    public void setItems(List<ItemSummary> items) { this.items = items; }
    public String getXsdProfileCode() { return xsdProfileCode; }
    public void setXsdProfileCode(String xsdProfileCode) { this.xsdProfileCode = xsdProfileCode; }
    public String getXsdSchemaVersion() { return xsdSchemaVersion; }
    public void setXsdSchemaVersion(String xsdSchemaVersion) { this.xsdSchemaVersion = xsdSchemaVersion; }

    public static class ProgressInfo {
        private Integer totalItems;
        private Integer pendingItems;
        private Integer runningItems;
        private Integer completedItems;
        private Integer passedItems;
        private Integer failedItems;

        public Integer getTotalItems() { return totalItems; }
        public void setTotalItems(Integer totalItems) { this.totalItems = totalItems; }
        public Integer getPendingItems() { return pendingItems; }
        public void setPendingItems(Integer pendingItems) { this.pendingItems = pendingItems; }
        public Integer getRunningItems() { return runningItems; }
        public void setRunningItems(Integer runningItems) { this.runningItems = runningItems; }
        public Integer getCompletedItems() { return completedItems; }
        public void setCompletedItems(Integer completedItems) { this.completedItems = completedItems; }
        public Integer getPassedItems() { return passedItems; }
        public void setPassedItems(Integer passedItems) { this.passedItems = passedItems; }
        public Integer getFailedItems() { return failedItems; }
        public void setFailedItems(Integer failedItems) { this.failedItems = failedItems; }
    }

    public static class JobSummary {
        private Integer totalCount;
        private Integer successCount;
        private Integer failedCount;
        private Integer partialSuccessCount;
        private Integer xsdFailedCount;
        private Integer requiredFailedCount;
        private Integer ruleFailedCount;
        private Integer errorCount;
        private Integer warningCount;

        public Integer getTotalCount() { return totalCount; }
        public void setTotalCount(Integer totalCount) { this.totalCount = totalCount; }
        public Integer getSuccessCount() { return successCount; }
        public void setSuccessCount(Integer successCount) { this.successCount = successCount; }
        public Integer getFailedCount() { return failedCount; }
        public void setFailedCount(Integer failedCount) { this.failedCount = failedCount; }
        public Integer getPartialSuccessCount() { return partialSuccessCount; }
        public void setPartialSuccessCount(Integer partialSuccessCount) { this.partialSuccessCount = partialSuccessCount; }
        public Integer getXsdFailedCount() { return xsdFailedCount; }
        public void setXsdFailedCount(Integer xsdFailedCount) { this.xsdFailedCount = xsdFailedCount; }
        public Integer getRequiredFailedCount() { return requiredFailedCount; }
        public void setRequiredFailedCount(Integer requiredFailedCount) { this.requiredFailedCount = requiredFailedCount; }
        public Integer getRuleFailedCount() { return ruleFailedCount; }
        public void setRuleFailedCount(Integer ruleFailedCount) { this.ruleFailedCount = ruleFailedCount; }
        public Integer getErrorCount() { return errorCount; }
        public void setErrorCount(Integer errorCount) { this.errorCount = errorCount; }
        public Integer getWarningCount() { return warningCount; }
        public void setWarningCount(Integer warningCount) { this.warningCount = warningCount; }
    }

    public static class ItemLayerSummary {
        private LayerResult xsd;
        private LayerResult required;
        private LayerResult rules;

        public LayerResult getXsd() { return xsd; }
        public void setXsd(LayerResult xsd) { this.xsd = xsd; }
        public LayerResult getRequired() { return required; }
        public void setRequired(LayerResult required) { this.required = required; }
        public LayerResult getRules() { return rules; }
        public void setRules(LayerResult rules) { this.rules = rules; }
    }

    public static class LayerResult {
        private Boolean processed;
        private Boolean passed;
        private Integer errorCount;
        private Integer warningCount;

        public Boolean getProcessed() { return processed; }
        public void setProcessed(Boolean processed) { this.processed = processed; }
        public Boolean getPassed() { return passed; }
        public void setPassed(Boolean passed) { this.passed = passed; }
        public Integer getErrorCount() { return errorCount; }
        public void setErrorCount(Integer errorCount) { this.errorCount = errorCount; }
        public Integer getWarningCount() { return warningCount; }
        public void setWarningCount(Integer warningCount) { this.warningCount = warningCount; }
    }

    public static class ItemSummary {
        private String itemId;
        private String bizId;
        private String fileName;
        private String status;
        private Boolean valid;
        private Integer attemptNo;
        private String checkpointLayer;
        private ItemLayerSummary summary;
        private Integer errorCount;
        private Integer warningCount;
        private String xsdProfileCode;
        private String xsdSchemaVersion;

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
        public ItemLayerSummary getSummary() { return summary; }
        public void setSummary(ItemLayerSummary summary) { this.summary = summary; }
        public Integer getErrorCount() { return errorCount; }
        public void setErrorCount(Integer errorCount) { this.errorCount = errorCount; }
        public Integer getWarningCount() { return warningCount; }
        public void setWarningCount(Integer warningCount) { this.warningCount = warningCount; }
        public String getXsdProfileCode() { return xsdProfileCode; }
        public void setXsdProfileCode(String xsdProfileCode) { this.xsdProfileCode = xsdProfileCode; }
        public String getXsdSchemaVersion() { return xsdSchemaVersion; }
        public void setXsdSchemaVersion(String xsdSchemaVersion) { this.xsdSchemaVersion = xsdSchemaVersion; }
    }
}
