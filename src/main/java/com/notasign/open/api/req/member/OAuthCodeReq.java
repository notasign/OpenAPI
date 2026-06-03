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

    @Override
    public Class<OAuthCodeResp> getRespClass() {
        return OAuthCodeResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.GET_OAUTH_CODE;
    }
}
