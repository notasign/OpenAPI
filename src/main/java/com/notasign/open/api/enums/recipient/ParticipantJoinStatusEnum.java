package com.notasign.open.api.enums.recipient;

/**
 * @author Nota
 * @date 2025/6/3 17:43
 */
public enum ParticipantJoinStatusEnum {

    NO_JOIN("no_join", "未加入"),
    JOINED("joined",  "已加入"),
    ;

    private final String code;
    private final String remark;

    ParticipantJoinStatusEnum(String code, String remark) {
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
