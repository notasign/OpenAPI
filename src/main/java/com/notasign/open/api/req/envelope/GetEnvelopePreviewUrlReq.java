package com.notasign.open.api.req.envelope;


import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.envelope.GetEnvelopePreviewUrlResp;

import java.util.List;

/**
 * @author fadada
 * @date 2025/6/5 19:54
 */

public class GetEnvelopePreviewUrlReq extends BaseReq<GetEnvelopePreviewUrlResp> {

    private String envelopeId;
    private String redirectUrl;

    /**
     * 允许嵌入本预览页面的父页面 Origin 白名单（可选）。
     * null 表示未传入（走默认策略）；空数组等价于清空白名单
     */
    private List<String> frameAncestors;

    public String getEnvelopeId() {
        return envelopeId;
    }

    public void setEnvelopeId(String envelopeId) {
        this.envelopeId = envelopeId;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public List<String> getFrameAncestors() {
        return frameAncestors;
    }

    public void setFrameAncestors(List<String> frameAncestors) {
        this.frameAncestors = frameAncestors;
    }

    @Override
    public Class<GetEnvelopePreviewUrlResp> getRespClass() {
        return GetEnvelopePreviewUrlResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.GET_ENVELOPE_PREVIEW_URL;
    }
}
