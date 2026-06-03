package com.notasign.open.api.resp.xml;

import com.notasign.open.api.bean.base.BaseResp;

import java.util.Date;
import java.util.List;

/**
 * 单条文件校验结果详情响应
 */
public class QueryItemDetailResp extends BaseResp {

    private String bizId;
    private String fileName;
    private Integer attemptNo;
    private String documentHash;
    private String normalizedDocumentHash;
    private String checkpointLayer;
    private List<String> processedLayers;
    private String status;
    private Boolean valid;
    private QueryValidationJobResp.ItemLayerSummary summary;
    private Date createdAt;
    private Date updatedAt;
    private Long errorTotal;
    private Long warningTotal;
    private Boolean issueTruncated;
    private List<IssueDetail> errors;
    private List<IssueDetail> warnings;

    public String getBizId() { return bizId; }
    public void setBizId(String bizId) { this.bizId = bizId; }
    public String getFileName() { return fileName; }
    public void setFileName(String fileName) { this.fileName = fileName; }
    public Integer getAttemptNo() { return attemptNo; }
    public void setAttemptNo(Integer attemptNo) { this.attemptNo = attemptNo; }
    public String getDocumentHash() { return documentHash; }
    public void setDocumentHash(String documentHash) { this.documentHash = documentHash; }
    public String getNormalizedDocumentHash() { return normalizedDocumentHash; }
    public void setNormalizedDocumentHash(String normalizedDocumentHash) { this.normalizedDocumentHash = normalizedDocumentHash; }
    public String getCheckpointLayer() { return checkpointLayer; }
    public void setCheckpointLayer(String checkpointLayer) { this.checkpointLayer = checkpointLayer; }
    public List<String> getProcessedLayers() { return processedLayers; }
    public void setProcessedLayers(List<String> processedLayers) { this.processedLayers = processedLayers; }
    public String getStatus() { return status; }
    public void setStatus(String status) { this.status = status; }
    public Boolean getValid() { return valid; }
    public void setValid(Boolean valid) { this.valid = valid; }
    public QueryValidationJobResp.ItemLayerSummary getSummary() { return summary; }
    public void setSummary(QueryValidationJobResp.ItemLayerSummary summary) { this.summary = summary; }
    public Date getCreatedAt() { return createdAt; }
    public void setCreatedAt(Date createdAt) { this.createdAt = createdAt; }
    public Date getUpdatedAt() { return updatedAt; }
    public void setUpdatedAt(Date updatedAt) { this.updatedAt = updatedAt; }
    public Long getErrorTotal() { return errorTotal; }
    public void setErrorTotal(Long errorTotal) { this.errorTotal = errorTotal; }
    public Long getWarningTotal() { return warningTotal; }
    public void setWarningTotal(Long warningTotal) { this.warningTotal = warningTotal; }
    public Boolean getIssueTruncated() { return issueTruncated; }
    public void setIssueTruncated(Boolean issueTruncated) { this.issueTruncated = issueTruncated; }
    public List<IssueDetail> getErrors() { return errors; }
    public void setErrors(List<IssueDetail> errors) { this.errors = errors; }
    public List<IssueDetail> getWarnings() { return warnings; }
    public void setWarnings(List<IssueDetail> warnings) { this.warnings = warnings; }

    public static class IssueDetail {
        private String issueId;
        private String layer;
        private String code;
        private String ruleId;
        private String severity;
        private String path;
        private String field;
        private String message;
        private String expected;
        private String actual;
        private String suggestion;

        public String getIssueId() { return issueId; }
        public void setIssueId(String issueId) { this.issueId = issueId; }
        public String getLayer() { return layer; }
        public void setLayer(String layer) { this.layer = layer; }
        public String getCode() { return code; }
        public void setCode(String code) { this.code = code; }
        public String getRuleId() { return ruleId; }
        public void setRuleId(String ruleId) { this.ruleId = ruleId; }
        public String getSeverity() { return severity; }
        public void setSeverity(String severity) { this.severity = severity; }
        public String getPath() { return path; }
        public void setPath(String path) { this.path = path; }
        public String getField() { return field; }
        public void setField(String field) { this.field = field; }
        public String getMessage() { return message; }
        public void setMessage(String message) { this.message = message; }
        public String getExpected() { return expected; }
        public void setExpected(String expected) { this.expected = expected; }
        public String getActual() { return actual; }
        public void setActual(String actual) { this.actual = actual; }
        public String getSuggestion() { return suggestion; }
        public void setSuggestion(String suggestion) { this.suggestion = suggestion; }
    }
}
