package com.notasign.open.api.bean.dto.recipient;

/**
 * 收件人级通知文案覆盖（仅作用于通知邮件的标题与正文，不改变信封级 subject/remark 在列表、详情、签署页与审计报告中的展示）
 *
 * 仅签署人（signer）、审批人（approver）、查看人（viewer）、批量签署人（bulkSigners，角色级）生效；
 * 抄送人（CC）、电子印章、印花税参与方传入则忽略。
 * 签署模式为 embeddedSigning 时忽略；autoSigning 时 language 与 customNotification 均忽略。
 *
 * @author Nota
 * @date 2026/10/20 10:24
 */
public class CustomNotificationDTO {

    /**
     * 收件人级邮件标题，最长100字符；不传/传空表示用信封级 subject
     */
    private String subject;

    /**
     * 收件人级邮件正文，最长10000字符；不传/传空表示用信封级 remark
     */
    private String remark;

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
}
