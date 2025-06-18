package com.notasign.open.api.enums.recipient;

/**
 * @author FADADA
 * @date 2025/6/3 17:57
 */
public enum ParticipantSignStatusEnum {

    /**
     * wait_sign: 待签署 (等待签署)
     * signed: 已签署 (已完成签署)
     * sign_rejected: 已拒签 (拒绝了签署)。
     */
    WAIT_SIGN("wait_sign", "待签署"),
    SIGNED("signed", "已签署"),
    SIGN_REJECTED("sign_rejected", "已拒签");

    private final String code;
    private final String remark;

    ParticipantSignStatusEnum(String code, String remark) {
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
