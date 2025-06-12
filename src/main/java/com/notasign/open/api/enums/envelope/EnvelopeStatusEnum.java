package com.notasign.open.api.enums.envelope;

/**
 * @author FADADA
 * @date 2025/6/10 17:34
 */
public enum EnvelopeStatusEnum {

    ENVELOPE_CREATED("creating", "创建中"),
    FILL_PROGRESS("filling", "填写进行中"),
    SIGN_PROGRESS("signing", "签署进行中"),
    ENVELOPE_FINISHED("finished", "任务完成"),
    ENVELOPE_TERMINATED("terminated", "任务异常停止"),
    ENVELOPE_REJECTED("rejected","任务被拒绝"),
    ENVELOPE_CANCELED( "revoked","任务已取消"),
    ENVELOPE_EXPIRED("expired","任务已逾期"),
    ;

    private final String code;
    private final String remark;

    EnvelopeStatusEnum(String code, String remark) {
        this.code = code;
        this.remark = remark;
    }

    public String getCode() {
        return code;
    }

    public String getRemark() {
        return remark;
    }
}
