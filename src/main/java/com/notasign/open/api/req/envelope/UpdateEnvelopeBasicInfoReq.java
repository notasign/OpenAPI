package com.notasign.open.api.req.envelope;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.dto.envelope.EnvelopeCustomFieldsDTO;
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
     * 到期前提醒天数：0-120，0-不发送到期提醒，不传默认3天；须小于信封有效天数
     */
    private Integer expireWarnDays;

    /**
     * 自由签署模式：allow-允许，disallow-不允许
     */
    private String freeformSigningMode;

    /**
     * 信封自定义字段：不传保持原值不变；传入非空对象整体替换全部自定义字段；传入空对象清空；传null返回参数错误
     */
    private EnvelopeCustomFieldsDTO customFields;

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

    public Integer getExpireWarnDays() {
        return expireWarnDays;
    }

    public void setExpireWarnDays(Integer expireWarnDays) {
        this.expireWarnDays = expireWarnDays;
    }

    public String getFreeformSigningMode() {
        return freeformSigningMode;
    }

    public void setFreeformSigningMode(String freeformSigningMode) {
        this.freeformSigningMode = freeformSigningMode;
    }

    public EnvelopeCustomFieldsDTO getCustomFields() {
        return customFields;
    }

    public void setCustomFields(EnvelopeCustomFieldsDTO customFields) {
        this.customFields = customFields;
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
