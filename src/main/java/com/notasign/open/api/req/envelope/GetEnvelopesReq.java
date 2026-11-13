package com.notasign.open.api.req.envelope;


import com.notasign.open.api.bean.base.BasePageReq;
import com.notasign.open.api.resp.envelope.GetEnvelopesResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * @author Nota
 * @date 2025/6/3 10:39
 */
public class GetEnvelopesReq extends BasePageReq<GetEnvelopesResp> {

    private String subject;

    private String envelopeStatus;

    private String startCreateTime;

    private String endCreateTime;

    /**
     * 自定义字段值模糊搜索关键字，命中任一字段即返回该信封；与其他筛选条件为交集（AND）
     */
    private String customFieldKeyword;

    /**
     * 按信封ID集合过滤：逗号分隔的信封ID列表，最多100个；传入时忽略分页，与其他筛选条件为交集
     */
    private String envelopeIds;

    /**
     * 是否待当前成员处理；true=待我处理，false=待他人处理
     */
    private String isActionRequired;

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

    public String getStartCreateTime() {
        return startCreateTime;
    }

    public void setStartCreateTime(String startCreateTime) {
        this.startCreateTime = startCreateTime;
    }

    public String getEndCreateTime() {
        return endCreateTime;
    }

    public void setEndCreateTime(String endCreateTime) {
        this.endCreateTime = endCreateTime;
    }

    public String getCustomFieldKeyword() {
        return customFieldKeyword;
    }

    public void setCustomFieldKeyword(String customFieldKeyword) {
        this.customFieldKeyword = customFieldKeyword;
    }

    public String getEnvelopeIds() {
        return envelopeIds;
    }

    public void setEnvelopeIds(String envelopeIds) {
        this.envelopeIds = envelopeIds;
    }

    public String getIsActionRequired() {
        return isActionRequired;
    }

    public void setIsActionRequired(String isActionRequired) {
        this.isActionRequired = isActionRequired;
    }

    @Override
    public Class<GetEnvelopesResp> getRespClass() {
        return GetEnvelopesResp.class;
    }

    @Override
    public String getApi(String... params) {
        return OpenApiUrlConstants.GET_ENVELOPES;
    }
}
