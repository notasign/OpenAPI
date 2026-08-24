package com.notasign.open.api.req.member;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.member.OAuthCodeResp;

import java.util.List;

/**
 * 获取成员授权链接请求
 */
public class OAuthCodeReq extends BaseReq<OAuthCodeResp> {

    private String memberEmail;
    private List<String> scope;
    private String redirectUrl;

    /**
     * 授权有效期：NY（N为1-999之间的数字，表示N年）或PERMANENT（永久），默认1年
     */
    private String expireDuration;

    /**
     * 允许嵌入授权页面的 iframe 父页面 Origin 白名单（可选）。
     * null 表示未传入（走默认策略）；空数组等价于清空白名单
     */
    private List<String> frameAncestors;

    public String getMemberEmail() {
        return memberEmail;
    }

    public void setMemberEmail(String memberEmail) {
        this.memberEmail = memberEmail;
    }

    public List<String> getScope() {
        return scope;
    }

    public void setScope(List<String> scope) {
        this.scope = scope;
    }

    public String getRedirectUrl() {
        return redirectUrl;
    }

    public void setRedirectUrl(String redirectUrl) {
        this.redirectUrl = redirectUrl;
    }

    public String getExpireDuration() {
        return expireDuration;
    }

    public void setExpireDuration(String expireDuration) {
        this.expireDuration = expireDuration;
    }

    public List<String> getFrameAncestors() {
        return frameAncestors;
    }

    public void setFrameAncestors(List<String> frameAncestors) {
        this.frameAncestors = frameAncestors;
    }

    @Override
    public Class<OAuthCodeResp> getRespClass() {
        return OAuthCodeResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.GET_OAUTH_CODE;
    }
}
