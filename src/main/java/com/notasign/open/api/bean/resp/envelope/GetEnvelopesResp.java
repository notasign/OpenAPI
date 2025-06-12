package com.notasign.open.api.bean.resp.envelope;

import com.notasign.open.api.bean.base.BasePageResp;

import java.util.List;

/**
 * @author FADADA
 * @date 2025/6/3 10:48
 */
public class GetEnvelopesResp extends BasePageResp {

    private List<SignTaskInfo> envelopes;

    public static class SignTaskInfo {
        private String envelopeId;
        private String subject;
        private String status;
        private String createTime;
        private String startTime;
        private String deadlineTime;
        private String finishTime;

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

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public String getCreateTime() {
            return createTime;
        }

        public void setCreateTime(String createTime) {
            this.createTime = createTime;
        }

        public String getStartTime() {
            return startTime;
        }

        public void setStartTime(String startTime) {
            this.startTime = startTime;
        }

        public String getDeadlineTime() {
            return deadlineTime;
        }

        public void setDeadlineTime(String deadlineTime) {
            this.deadlineTime = deadlineTime;
        }

        public String getFinishTime() {
            return finishTime;
        }

        public void setFinishTime(String finishTime) {
            this.finishTime = finishTime;
        }
    }

    public List<SignTaskInfo> getEnvelopes() {
        return envelopes;
    }

    public void setEnvelopes(List<SignTaskInfo> envelopes) {
        this.envelopes = envelopes;
    }
}
