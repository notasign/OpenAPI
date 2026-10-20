package com.notasign.open.api.req.envelope;


import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.resp.envelope.GetEnvelopeDownloadResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * @author Nota
 * @date 2025/6/4 15:04
 */

public class GetEnvelopeDownloadReq extends BaseReq<GetEnvelopeDownloadResp> {

    @JsonIgnore
    private String envelopeId;

    private String customFileName;

    /**
     * 指定要下载的文档ID，来自信封详情接口返回的 documents[].documentId，最大50字符；
     * 不传或传null时返回整个信封的合并件下载链接（与现状一致），传入时返回该文档的单文档下载链接；
     * 传入的 documentId 必须属于当前信封，否则返回参数错误
     */
    private String documentId;

    @Override
    public Class<GetEnvelopeDownloadResp> getRespClass() {
        return GetEnvelopeDownloadResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.GET_ENVELOPE_DOWNLOAD_URL, envelopeId);
    }

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getCustomFileName() {
        return customFileName;
    }

    public void setCustomFileName(String customFileName) {
        this.customFileName = customFileName;
    }

    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }
}
