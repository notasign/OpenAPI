package com.notasign.open.api.resp.member;

import com.notasign.open.api.bean.base.BaseResp;

/**
 * 成员授权链接响应
 */
public class OAuthCodeResp extends BaseResp {

    private String authenticateUrl;

    public String getAuthenticateUrl() {
        return authenticateUrl;
    }

    public void setAuthenticateUrl(String authenticateUrl) {
        this.authenticateUrl = authenticateUrl;
    }
}
