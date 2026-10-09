package com.notasign.open.api.resp.envelope;

import com.notasign.open.api.bean.base.BasePageResp;
import com.notasign.open.api.bean.dto.recipient.SenderDTO;

import java.util.List;

/**
 * @author Nota
 * @date 2025/6/3 10:48
 */
public class GetEnvelopesResp extends BasePageResp {

    private List<EnvelopeInfo> envelopes;

    public static class EnvelopeInfo {
        private String envelopeId;
        private String subject;
        private String envelopeStatus;
        private String createTime;
        private String sendTime;
        private String expiresTime;
        private String finishTime;
        private String startTime;
        private SenderDTO sender;

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

        public String getEnvelopeStatus() {
            return envelopeStatus;
        }

        public void setEnvelopeStatus(String envelopeStatus) {
            this.envelopeStatus = envelopeStatus;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getSendTime() {
            return sendTime;
        }

        public void setSendTime(String sendTime) {
            this.sendTime = sendTime;
        }

        public String getExpiresTime() {
            return expiresTime;
        }

        public void setExpiresTime(String expiresTime) {
            this.expiresTime = expiresTime;
        }

        public String getFinishTime() {
            return finishTime;
        }

        public void setFinishTime(String finishTime) {
            this.finishTime = finishTime;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public SenderDTO getSender() {
            return sender;
        }

        public void setSender(SenderDTO sender) {
            this.sender = sender;
        }
    }

    public List<EnvelopeInfo> getEnvelopes() {
        return envelopes;
    }

    public void setEnvelopes(List<EnvelopeInfo> envelopes) {
        this.envelopes = envelopes;
    }
}
