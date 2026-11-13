package com.notasign.open.api.resp.envelope;

import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;

/**
 * 信封审计事件查询响应
 */
public class EnvelopeAuditEventResp extends BaseResp {

    /**
     * 信封ID
     */
    private String envelopeId;

    /**
     * 操作记录列表，按 eventTime 升序
     */
    private List<AuditEvent> auditEvents;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public List<AuditEvent> getAuditEvents() {
        return auditEvents;
    }

    public void setAuditEvents(List<AuditEvent> auditEvents) {
        this.auditEvents = auditEvents;
    }

    /**
     * 操作记录
     */
    public static class AuditEvent {

        /**
         * 事件发生时间，Unix 标准时间戳（毫秒，UTC 绝对时刻），字符串类型
         */
        private String eventTime;

        /**
         * 事件类型，envelope.* / participant.*
         */
        private String eventType;

        /**
         * 操作说明文案，按 language 参数返回对应语言，不含时间
         */
        private String message;

        /**
         * 操作 IP，系统事件可为 null
         */
        private String ip;

        public String getEventTime() {
            return eventTime;
        }

        public void setEventTime(String eventTime) {
            this.eventTime = eventTime;
        }

        public String getEventType() {
            return eventType;
        }

        public void setEventType(String eventType) {
            this.eventType = eventType;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }

        public String getIp() {
            return ip;
        }

        public void setIp(String ip) {
            this.ip = ip;
        }
    }
}
