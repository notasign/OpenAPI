package com.notasign.open.api.bean.dto.recipient;

/**
 * 强制阅读配置
 *
 * @author Nota
 * @date 2026/6/15 15:00
 */
public class ReadingRequirementDTO {

    private Boolean enabled;

    private Boolean readToEndRequired;

    private Integer minReadSeconds;

    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public Boolean getReadToEndRequired() {
        return readToEndRequired;
    }

    public void setReadToEndRequired(Boolean readToEndRequired) {
        this.readToEndRequired = readToEndRequired;
    }

    public Integer getMinReadSeconds() {
        return minReadSeconds;
    }

    public void setMinReadSeconds(Integer minReadSeconds) {
        this.minReadSeconds = minReadSeconds;
    }
}
