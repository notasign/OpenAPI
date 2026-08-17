package com.notasign.open.api.resp.envelope;

import com.notasign.open.api.bean.base.BaseResp;

/**
 * 更新信封基本信息响应
 */
public class UpdateEnvelopeBasicInfoResp extends BaseResp {

    /**
     * 信封ID
     */
    private String envelopeId;

    /**
     * 信封主题
     */
    private String subject;

    /**
     * 信封备注
     */
    private String remark;

    /**
     * 过期时间，Unix标准时间戳（毫秒）
     */
    private Long expiresTime;

    /**
     * 自由签署模式：allow-允许，disallow-不允许
     */
    private String freeformSigningMode;

    /**
     * 更新时间，Unix标准时间戳（毫秒）
     */
    private String updateTime;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Long getExpiresTime() {
        return expiresTime;
    }

    public void setExpiresTime(Long expiresTime) {
        this.expiresTime = expiresTime;
    }

    public String getFreeformSigningMode() {
        return freeformSigningMode;
    }

    public void setFreeformSigningMode(String freeformSigningMode) {
        this.freeformSigningMode = freeformSigningMode;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }
}
