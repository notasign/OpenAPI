package com.notasign.open.api.resp.bulksend;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;

/**
 * 批量发送清单详情响应
 */
public class BulkSendListDetailResp extends BaseResp {

    /**
     * 批量发送清单ID
     */
    private String bulkSendListId;

    /**
     * 批量发送清单列表
     */
    private List<BulkSendListItem> bulkSendList;

    public String getBulkSendListId() {
        return bulkSendListId;
    }

    public void setBulkSendListId(String bulkSendListId) {
        this.bulkSendListId = bulkSendListId;
    }

    public List<BulkSendListItem> getBulkSendList() {
        return bulkSendList;
    }

    public void setBulkSendList(List<BulkSendListItem> bulkSendList) {
        this.bulkSendList = bulkSendList;
    }

    /**
     * 批量发送清单项
     */
    public static class BulkSendListItem {

        /**
         * 信封主题
         */
        private String subject;

        /**
         * 信封备注
         */
        private String remark;

        /**
         * 批量角色列表
         */
        private List<BulkRoleResp> bulkRoles;

        /**
         * 抄送方列表
         */
        private List<CarbonCopyResp> carbonCopies;

        /**
         * 链接过期时间，Unix标准时间戳（毫秒）
         */
        private Long expiresTime;

        /**
         * 发送提醒频率（分钟）
         */
        private Integer remindFrequency;

        /**
         * 预填字段列表
         */
        private List<PrefillFieldResp> prefillFields;

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

        public List<BulkRoleResp> getBulkRoles() {
            return bulkRoles;
        }

        public void setBulkRoles(List<BulkRoleResp> bulkRoles) {
            this.bulkRoles = bulkRoles;
        }

        public List<CarbonCopyResp> getCarbonCopies() {
            return carbonCopies;
        }

        public void setCarbonCopies(List<CarbonCopyResp> carbonCopies) {
            this.carbonCopies = carbonCopies;
        }

        public Long getExpiresTime() {
            return expiresTime;
        }

        public void setExpiresTime(Long expiresTime) {
            this.expiresTime = expiresTime;
        }

        public Integer getRemindFrequency() {
            return remindFrequency;
        }

        public void setRemindFrequency(Integer remindFrequency) {
            this.remindFrequency = remindFrequency;
        }

        public List<PrefillFieldResp> getPrefillFields() {
            return prefillFields;
        }

        public void setPrefillFields(List<PrefillFieldResp> prefillFields) {
            this.prefillFields = prefillFields;
        }
    }

    /**
     * 批量角色
     */
    public static class BulkRoleResp {

        /**
         * 批量角色名称
         */
        private String bulkRoleName;

        /**
         * 参与方ID
         */
        private String participantId;

        /**
         * 参与方姓名
         */
        private String participantName;

        /**
         * 邮箱
         */
        private String email;

        /**
         * 参与方手机号国家区号
         */
        private String phoneCountryCode;

        /**
         * 参与方手机号
         */
        private String phoneNumber;

        /**
         * 访问密码
         */
        private String accessCode;

        public String getBulkRoleName() {
            return bulkRoleName;
        }

        public void setBulkRoleName(String bulkRoleName) {
            this.bulkRoleName = bulkRoleName;
        }

        public String getParticipantId() {
            return participantId;
        }

        public void setParticipantId(String participantId) {
            this.participantId = participantId;
        }

        public String getParticipantName() {
            return participantName;
        }

        public void setParticipantName(String participantName) {
            this.participantName = participantName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneCountryCode() {
            return phoneCountryCode;
        }

        public void setPhoneCountryCode(String phoneCountryCode) {
            this.phoneCountryCode = phoneCountryCode;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getAccessCode() {
            return accessCode;
        }

        public void setAccessCode(String accessCode) {
            this.accessCode = accessCode;
        }
    }

    /**
     * 抄送方
     */
    public static class CarbonCopyResp {

        /**
         * 抄送方标识
         */
        private String carbonCopyId;

        /**
         * 抄送方名称
         */
        private String carbonCopyName;

        /**
         * 抄送方邮箱（服务端JSON键为 carbonCopyEmail）
         */
        @JsonProperty("carbonCopyEmail")
        private String email;

        /**
         * 抄送方手机号
         */
        private String phoneNumber;

        public String getCarbonCopyId() {
            return carbonCopyId;
        }

        public void setCarbonCopyId(String carbonCopyId) {
            this.carbonCopyId = carbonCopyId;
        }

        public String getCarbonCopyName() {
            return carbonCopyName;
        }

        public void setCarbonCopyName(String carbonCopyName) {
            this.carbonCopyName = carbonCopyName;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }
    }
}
