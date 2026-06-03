package com.notasign.open.api.req.xml;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.xml.CreateValidationJobResp;

import java.util.List;
import java.util.Map;

/**
 * 创建XML校验任务请求
 */
public class CreateValidationJobReq extends BaseReq<CreateValidationJobResp> {

    private String requestId;
    private String runMode;
    private Integer waitTimeoutSeconds;
    private ProfileInfo profile;
    private ValidationOptions options;
    private CallbackConfig callback;
    private List<DocumentItem> documents;

    public String getRequestId() { return requestId; }
    public void setRequestId(String requestId) { this.requestId = requestId; }
    public String getRunMode() { return runMode; }
    public void setRunMode(String runMode) { this.runMode = runMode; }
    public Integer getWaitTimeoutSeconds() { return waitTimeoutSeconds; }
    public void setWaitTimeoutSeconds(Integer waitTimeoutSeconds) { this.waitTimeoutSeconds = waitTimeoutSeconds; }
    public ProfileInfo getProfile() { return profile; }
    public void setProfile(ProfileInfo profile) { this.profile = profile; }
    public ValidationOptions getOptions() { return options; }
    public void setOptions(ValidationOptions options) { this.options = options; }
    public CallbackConfig getCallback() { return callback; }
    public void setCallback(CallbackConfig callback) { this.callback = callback; }
    public List<DocumentItem> getDocuments() { return documents; }
    public void setDocuments(List<DocumentItem> documents) { this.documents = documents; }

    @Override
    public Class<CreateValidationJobResp> getRespClass() {
        return CreateValidationJobResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.CREATE_XML_VALIDATION;
    }

    public static class ProfileInfo {
        private String profileCode = "NL_RDW_IVI_2_0";
        private String xsdVersion = "IVI-2.0";
        private String framework = "2018858";
        private String vehicleCategory = "M1";
        private String country = "NL";
        private String validationMode = "UNSIGNED_PRECHECK";

        public String getProfileCode() { return profileCode; }
        public void setProfileCode(String profileCode) { this.profileCode = profileCode; }
        public String getXsdVersion() { return xsdVersion; }
        public void setXsdVersion(String xsdVersion) { this.xsdVersion = xsdVersion; }
        public String getFramework() { return framework; }
        public void setFramework(String framework) { this.framework = framework; }
        public String getVehicleCategory() { return vehicleCategory; }
        public void setVehicleCategory(String vehicleCategory) { this.vehicleCategory = vehicleCategory; }
        public String getCountry() { return country; }
        public void setCountry(String country) { this.country = country; }
        public String getValidationMode() { return validationMode; }
        public void setValidationMode(String validationMode) { this.validationMode = validationMode; }
    }

    public static class ValidationOptions {
        private Boolean runXsd = true;
        private Boolean runRequired = true;
        private Boolean runRules = true;
        private Boolean runSignature = false;
        private Boolean failFast = false;
        private Integer maxErrorsPerItem = 5000;
        private Boolean stopItemAfterLayerFailure = false;
        private String locale = "zh-CN";
        private Boolean saveNormalizedXml;
        private Boolean storeOriginalDocument = true;
        private Boolean deduplicateByHash = true;

        public Boolean getRunXsd() { return runXsd; }
        public void setRunXsd(Boolean runXsd) { this.runXsd = runXsd; }
        public Boolean getRunRequired() { return runRequired; }
        public void setRunRequired(Boolean runRequired) { this.runRequired = runRequired; }
        public Boolean getRunRules() { return runRules; }
        public void setRunRules(Boolean runRules) { this.runRules = runRules; }
        public Boolean getRunSignature() { return runSignature; }
        public void setRunSignature(Boolean runSignature) { this.runSignature = runSignature; }
        public Boolean getFailFast() { return failFast; }
        public void setFailFast(Boolean failFast) { this.failFast = failFast; }
        public Integer getMaxErrorsPerItem() { return maxErrorsPerItem; }
        public void setMaxErrorsPerItem(Integer maxErrorsPerItem) { this.maxErrorsPerItem = maxErrorsPerItem; }
        public Boolean getStopItemAfterLayerFailure() { return stopItemAfterLayerFailure; }
        public void setStopItemAfterLayerFailure(Boolean stopItemAfterLayerFailure) { this.stopItemAfterLayerFailure = stopItemAfterLayerFailure; }
        public String getLocale() { return locale; }
        public void setLocale(String locale) { this.locale = locale; }
        public Boolean getSaveNormalizedXml() { return saveNormalizedXml; }
        public void setSaveNormalizedXml(Boolean saveNormalizedXml) { this.saveNormalizedXml = saveNormalizedXml; }
        public Boolean getStoreOriginalDocument() { return storeOriginalDocument; }
        public void setStoreOriginalDocument(Boolean storeOriginalDocument) { this.storeOriginalDocument = storeOriginalDocument; }
        public Boolean getDeduplicateByHash() { return deduplicateByHash; }
        public void setDeduplicateByHash(Boolean deduplicateByHash) { this.deduplicateByHash = deduplicateByHash; }
    }

    public static class CallbackConfig {
        private String callbackUrl;
        private String secret;
        private List<String> eventTypes;

        public String getCallbackUrl() { return callbackUrl; }
        public void setCallbackUrl(String callbackUrl) { this.callbackUrl = callbackUrl; }
        public String getSecret() { return secret; }
        public void setSecret(String secret) { this.secret = secret; }
        public List<String> getEventTypes() { return eventTypes; }
        public void setEventTypes(List<String> eventTypes) { this.eventTypes = eventTypes; }
    }

    public static class DocumentItem {
        private String bizId;
        private String fileName;
        private Long fileId;
        private String contentHash;
        private Map<String, Object> metadata;

        public String getBizId() { return bizId; }
        public void setBizId(String bizId) { this.bizId = bizId; }
        public String getFileName() { return fileName; }
        public void setFileName(String fileName) { this.fileName = fileName; }
        public Long getFileId() { return fileId; }
        public void setFileId(Long fileId) { this.fileId = fileId; }
        public String getContentHash() { return contentHash; }
        public void setContentHash(String contentHash) { this.contentHash = contentHash; }
        public Map<String, Object> getMetadata() { return metadata; }
        public void setMetadata(Map<String, Object> metadata) { this.metadata = metadata; }
    }
}
