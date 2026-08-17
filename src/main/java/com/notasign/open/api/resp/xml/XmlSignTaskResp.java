package com.notasign.open.api.resp.xml;

import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;

/**
 * XML签署任务文件级结果响应
 */
public class XmlSignTaskResp extends BaseResp {

    /**
     * 批次ID
     */
    private String batchId;

    /**
     * 批次状态
     */
    private String batchStatus;

    /**
     * 批次是否全部可交付
     */
    private Boolean valid;

    /**
     * 本批次是否启用eCOC签前/签后校验和XMLDSig验签
     */
    private Boolean validationEnabled;

    /**
     * 批次汇总
     */
    private Summary summary;

    /**
     * 文件级结果当前页
     */
    private List<Item> items;

    /**
     * 文件总数
     */
    private Long itemTotal;

    /**
     * 文件页码
     */
    private Integer itemPageNo;

    /**
     * 文件每页大小
     */
    private Integer itemPageSize;

    /**
     * 是否还有更多文件
     */
    private Boolean itemHasMore;

    /**
     * 是否需要通过文件/issue分页接口查询完整问题
     */
    private Boolean issuePageRequired;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public String getBatchStatus() {
        return batchStatus;
    }

    public void setBatchStatus(String batchStatus) {
        this.batchStatus = batchStatus;
    }

    public Boolean getValid() {
        return valid;
    }

    public void setValid(Boolean valid) {
        this.valid = valid;
    }

    public Boolean getValidationEnabled() {
        return validationEnabled;
    }

    public void setValidationEnabled(Boolean validationEnabled) {
        this.validationEnabled = validationEnabled;
    }

    public Summary getSummary() {
        return summary;
    }

    public void setSummary(Summary summary) {
        this.summary = summary;
    }

    public List<Item> getItems() {
        return items;
    }

    public void setItems(List<Item> items) {
        this.items = items;
    }

    public Long getItemTotal() {
        return itemTotal;
    }

    public void setItemTotal(Long itemTotal) {
        this.itemTotal = itemTotal;
    }

    public Integer getItemPageNo() {
        return itemPageNo;
    }

    public void setItemPageNo(Integer itemPageNo) {
        this.itemPageNo = itemPageNo;
    }

    public Integer getItemPageSize() {
        return itemPageSize;
    }

    public void setItemPageSize(Integer itemPageSize) {
        this.itemPageSize = itemPageSize;
    }

    public Boolean getItemHasMore() {
        return itemHasMore;
    }

    public void setItemHasMore(Boolean itemHasMore) {
        this.itemHasMore = itemHasMore;
    }

    public Boolean getIssuePageRequired() {
        return issuePageRequired;
    }

    public void setIssuePageRequired(Boolean issuePageRequired) {
        this.issuePageRequired = issuePageRequired;
    }

    /**
     * XML签署批次汇总
     */
    public static class Summary {

        /**
         * 总文件数
         */
        private Integer totalCount;

        /**
         * 签署、签后校验、验签全部通过文件数
         */
        private Integer completedCount;

        /**
         * 已包含签名、禁止重复签署文件数
         */
        private Integer alreadySignedCount;

        /**
         * 签前校验失败文件数
         */
        private Integer preSignFailedCount;

        /**
         * 签署失败文件数
         */
        private Integer signingFailedCount;

        /**
         * 签后校验或验签失败文件数
         */
        private Integer postSignFailedCount;

        /**
         * 系统异常文件数
         */
        private Integer systemFailedCount;

        /**
         * 错误总数
         */
        private Integer errorTotal;

        /**
         * 警告总数
         */
        private Integer warningTotal;

        public Integer getTotalCount() {
            return totalCount;
        }

        public void setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
        }

        public Integer getCompletedCount() {
            return completedCount;
        }

        public void setCompletedCount(Integer completedCount) {
            this.completedCount = completedCount;
        }

        public Integer getAlreadySignedCount() {
            return alreadySignedCount;
        }

        public void setAlreadySignedCount(Integer alreadySignedCount) {
            this.alreadySignedCount = alreadySignedCount;
        }

        public Integer getPreSignFailedCount() {
            return preSignFailedCount;
        }

        public void setPreSignFailedCount(Integer preSignFailedCount) {
            this.preSignFailedCount = preSignFailedCount;
        }

        public Integer getSigningFailedCount() {
            return signingFailedCount;
        }

        public void setSigningFailedCount(Integer signingFailedCount) {
            this.signingFailedCount = signingFailedCount;
        }

        public Integer getPostSignFailedCount() {
            return postSignFailedCount;
        }

        public void setPostSignFailedCount(Integer postSignFailedCount) {
            this.postSignFailedCount = postSignFailedCount;
        }

        public Integer getSystemFailedCount() {
            return systemFailedCount;
        }

        public void setSystemFailedCount(Integer systemFailedCount) {
            this.systemFailedCount = systemFailedCount;
        }

        public Integer getErrorTotal() {
            return errorTotal;
        }

        public void setErrorTotal(Integer errorTotal) {
            this.errorTotal = errorTotal;
        }

        public Integer getWarningTotal() {
            return warningTotal;
        }

        public void setWarningTotal(Integer warningTotal) {
            this.warningTotal = warningTotal;
        }
    }

    /**
     * XML签署文件级结果
     */
    public static class Item {

        /**
         * 客户传入的XML文档ID
         */
        private String xmlDocId;

        /**
         * 原始XML文件ID
         */
        private Long xmlFileId;

        /**
         * 文件名
         */
        private String fileName;

        /**
         * VIN；缺失时为空，非法时保留原始值
         */
        private String vin;

        /**
         * VIN状态: VALID/INVALID/MISSING
         */
        private String vinStatus;

        /**
         * 系统业务定位ID
         */
        private String bizId;

        /**
         * 文件级状态
         */
        private String status;

        /**
         * 文件最终是否可交付
         */
        private Boolean valid;

        /**
         * 签前校验是否通过
         */
        private Boolean preSignValid;

        /**
         * 签后eCOC校验是否通过
         */
        private Boolean postSignValid;

        /**
         * XMLDSig验签是否通过
         */
        private Boolean signatureValid;

        /**
         * 该文件所属批次是否启用eCOC签前/签后校验和XMLDSig验签
         */
        private Boolean validationEnabled;

        /**
         * 实际使用的XSD profile，如 EU_IVI_2_0/UK_VCA_IVI_2_0_20260522
         */
        private String xsdProfileCode;

        /**
         * 实际使用的XSD版本，如 EU-IVI-20260508/UK-IVI-20260522
         */
        private String xsdSchemaVersion;

        /**
         * 原始XML文件引用
         */
        private OriginalFileRef originalFile;

        /**
         * 签署文件下载信息
         */
        private SignedFileRef signedFile;

        /**
         * 签署成功且可交付时的单个签署XML下载链接
         */
        private String downloadUrl;

        /**
         * 下载类型: XML
         */
        private String downloadType;

        /**
         * 错误总数
         */
        private Integer errorTotal;

        /**
         * 警告总数
         */
        private Integer warningTotal;

        /**
         * 问题是否被截断
         */
        private Boolean issueTruncated;

        /**
         * 是否可查询issue明细
         */
        private Boolean issueQueryAvailable;

        /**
         * 当前响应是否包含issue明细
         */
        private Boolean issueIncluded;

        /**
         * issue查询提示
         */
        private String issueQueryHint;

        /**
         * 文件结果说明
         */
        private String message;

        /**
         * 错误列表
         */
        private List<Issue> errors;

        /**
         * 警告列表
         */
        private List<Issue> warnings;

        public String getXmlDocId() {
            return xmlDocId;
        }

        public void setXmlDocId(String xmlDocId) {
            this.xmlDocId = xmlDocId;
        }

        public Long getXmlFileId() {
            return xmlFileId;
        }

        public void setXmlFileId(Long xmlFileId) {
            this.xmlFileId = xmlFileId;
        }

        public String getFileName() {
            return fileName;
        }

        public void setFileName(String fileName) {
            this.fileName = fileName;
        }

        public String getVin() {
            return vin;
        }

        public void setVin(String vin) {
            this.vin = vin;
        }

        public String getVinStatus() {
            return vinStatus;
        }

        public void setVinStatus(String vinStatus) {
            this.vinStatus = vinStatus;
        }

        public String getBizId() {
            return bizId;
        }

        public void setBizId(String bizId) {
            this.bizId = bizId;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public Boolean getValid() {
            return valid;
        }

        public void setValid(Boolean valid) {
            this.valid = valid;
        }

        public Boolean getPreSignValid() {
            return preSignValid;
        }

        public void setPreSignValid(Boolean preSignValid) {
            this.preSignValid = preSignValid;
        }

        public Boolean getPostSignValid() {
            return postSignValid;
        }

        public void setPostSignValid(Boolean postSignValid) {
            this.postSignValid = postSignValid;
        }

        public Boolean getSignatureValid() {
            return signatureValid;
        }

        public void setSignatureValid(Boolean signatureValid) {
            this.signatureValid = signatureValid;
        }

        public Boolean getValidationEnabled() {
            return validationEnabled;
        }

        public void setValidationEnabled(Boolean validationEnabled) {
            this.validationEnabled = validationEnabled;
        }

        public String getXsdProfileCode() {
            return xsdProfileCode;
        }

        public void setXsdProfileCode(String xsdProfileCode) {
            this.xsdProfileCode = xsdProfileCode;
        }

        public String getXsdSchemaVersion() {
            return xsdSchemaVersion;
        }

        public void setXsdSchemaVersion(String xsdSchemaVersion) {
            this.xsdSchemaVersion = xsdSchemaVersion;
        }

        public OriginalFileRef getOriginalFile() {
            return originalFile;
        }

        public void setOriginalFile(OriginalFileRef originalFile) {
            this.originalFile = originalFile;
        }

        public SignedFileRef getSignedFile() {
            return signedFile;
        }

        public void setSignedFile(SignedFileRef signedFile) {
            this.signedFile = signedFile;
        }

        public String getDownloadUrl() {
            return downloadUrl;
        }

        public void setDownloadUrl(String downloadUrl) {
            this.downloadUrl = downloadUrl;
        }

        public String getDownloadType() {
            return downloadType;
        }

        public void setDownloadType(String downloadType) {
            this.downloadType = downloadType;
        }

        public Integer getErrorTotal() {
            return errorTotal;
        }

        public void setErrorTotal(Integer errorTotal) {
            this.errorTotal = errorTotal;
        }

        public Integer getWarningTotal() {
            return warningTotal;
        }

        public void setWarningTotal(Integer warningTotal) {
            this.warningTotal = warningTotal;
        }

        public Boolean getIssueTruncated() {
            return issueTruncated;
        }

        public void setIssueTruncated(Boolean issueTruncated) {
            this.issueTruncated = issueTruncated;
        }

        public Boolean getIssueQueryAvailable() {
            return issueQueryAvailable;
        }

        public void setIssueQueryAvailable(Boolean issueQueryAvailable) {
            this.issueQueryAvailable = issueQueryAvailable;
        }

        public Boolean getIssueIncluded() {
            return issueIncluded;
        }

        public void setIssueIncluded(Boolean issueIncluded) {
            this.issueIncluded = issueIncluded;
        }

        public String getIssueQueryHint() {
            return issueQueryHint;
        }

        public void setIssueQueryHint(String issueQueryHint) {
            this.issueQueryHint = issueQueryHint;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public List<Issue> getErrors() {
            return errors;
        }

        public void setErrors(List<Issue> errors) {
            this.errors = errors;
        }

        public List<Issue> getWarnings() {
            return warnings;
        }

        public void setWarnings(List<Issue> warnings) {
            this.warnings = warnings;
        }
    }

    /**
     * 原始XML文件引用
     */
    public static class OriginalFileRef {

        /**
         * 原始XML文件ID
         */
        private Long xmlFileId;

        /**
         * 是否可下载
         */
        private Boolean downloadAvailable;

        public Long getXmlFileId() {
            return xmlFileId;
        }

        public void setXmlFileId(Long xmlFileId) {
            this.xmlFileId = xmlFileId;
        }

        public Boolean getDownloadAvailable() {
            return downloadAvailable;
        }

        public void setDownloadAvailable(Boolean downloadAvailable) {
            this.downloadAvailable = downloadAvailable;
        }
    }

    /**
     * 签署文件引用
     */
    public static class SignedFileRef {

        /**
         * 签署后XML文件ID
         */
        private Long signedFileId;

        /**
         * 是否可下载
         */
        private Boolean downloadAvailable;

        /**
         * 签署文件状态: NOT_GENERATED/GENERATED_AND_VALID/GENERATED_BUT_VALIDATION_FAILED
         */
        private String status;

        public Long getSignedFileId() {
            return signedFileId;
        }

        public void setSignedFileId(Long signedFileId) {
            this.signedFileId = signedFileId;
        }

        public Boolean getDownloadAvailable() {
            return downloadAvailable;
        }

        public void setDownloadAvailable(Boolean downloadAvailable) {
            this.downloadAvailable = downloadAvailable;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }
    }

    /**
     * XML签署校验问题明细
     */
    public static class Issue {

        /**
         * 校验层级: XSD/REQUIRED/RULE/SIGNATURE/SYSTEM
         */
        private String layer;

        /**
         * 错误码
         */
        private String code;

        /**
         * 规则ID
         */
        private String ruleId;

        /**
         * 严重级别
         */
        private String severity;

        /**
         * 字段路径
         */
        private String path;

        /**
         * 字段名
         */
        private String field;

        /**
         * 错误说明
         */
        private String message;

        /**
         * 期望值
         */
        private String expected;

        /**
         * 实际值
         */
        private String actual;

        /**
         * 修复建议
         */
        private String suggestion;

        public String getLayer() {
            return layer;
        }

        public void setLayer(String layer) {
            this.layer = layer;
        }

        public String getCode() {
            return code;
        }

        public void setCode(String code) {
            this.code = code;
        }

        public String getRuleId() {
            return ruleId;
        }

        public void setRuleId(String ruleId) {
            this.ruleId = ruleId;
        }

        public String getSeverity() {
            return severity;
        }

        public void setSeverity(String severity) {
            this.severity = severity;
        }

        public String getPath() {
            return path;
        }

        public void setPath(String path) {
            this.path = path;
        }

        public String getField() {
            return field;
        }

        public void setField(String field) {
            this.field = field;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getExpected() {
            return expected;
        }

        public void setExpected(String expected) {
            this.expected = expected;
        }

        public String getActual() {
            return actual;
        }

        public void setActual(String actual) {
            this.actual = actual;
        }

        public String getSuggestion() {
            return suggestion;
        }

        public void setSuggestion(String suggestion) {
            this.suggestion = suggestion;
        }
    }
}
