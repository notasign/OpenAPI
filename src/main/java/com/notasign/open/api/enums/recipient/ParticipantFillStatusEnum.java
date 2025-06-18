package com.notasign.open.api.enums.recipient;

/**
 * @author FADADA
 * @date 2025/6/3 17:47
 */
public enum ParticipantFillStatusEnum {
    
    WAIT_FILL("wait_fill",  "待填写"),
    FILLED("filled",  "已填写"),
    FILL_REJECTED("fill_rejected",  "已拒填");


    private final String code;
    private final String remark;

    ParticipantFillStatusEnum(String code, String remark) {
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
