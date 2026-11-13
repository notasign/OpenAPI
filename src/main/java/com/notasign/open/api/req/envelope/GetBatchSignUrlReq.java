package com.notasign.open.api.req.envelope;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.envelope.GetBatchSignUrlResp;

import java.util.List;

/**
 * 获取批量签署页面链接请求
 */
public class GetBatchSignUrlReq extends BaseReq<GetBatchSignUrlResp> {

    /**
     * 批量签署结束后的重定向链接
     */
    private String redirectUrl;

    /**
     * 指定批量签署范围的信封ID列表，最多100个
     */
    private List<String> envelopeIds;

    /**
     * 允许嵌入本页面父页面的 Origin 白名单（可选）。
     * null 表示未传入（走默认策略）；空数组等价于清空白名单
     */
    private List<String> frameAncestors;

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public List<String> getEnvelopeIds() {
        return envelopeIds;
    }

    public void setEnvelopeIds(List<String> envelopeIds) {
        this.envelopeIds = envelopeIds;
    }

    public List<String> getFrameAncestors() {
        return frameAncestors;
    }

    public void setFrameAncestors(List<String> frameAncestors) {
        this.frameAncestors = frameAncestors;
    }

    @Override
    public Class<GetBatchSignUrlResp> getRespClass() {
        return GetBatchSignUrlResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.GET_BATCH_SIGN_URL;
    }
}
