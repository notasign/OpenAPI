package com.notasign.open.api.req.envelope;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.envelope.UpdateEnvelopeBasicInfoResp;

/**
 * 更新信封基本信息请求（仅更新主题、备注、过期时间、自由签署模式）
 */
public class UpdateEnvelopeBasicInfoReq extends BaseReq<UpdateEnvelopeBasicInfoResp> {

    /**
     * 信封ID，路径参数
     */
    @JsonIgnore
    private String envelopeId;

    /**
     * 信封主题，最大100字符
     */
    private String subject;

    /**
     * 信封备注，最大10000字符
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

    @Override
    public Class<UpdateEnvelopeBasicInfoResp> getRespClass() {
        return UpdateEnvelopeBasicInfoResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.UPDATE_ENVELOPE_BASIC_INFO, envelopeId);
    }
}
