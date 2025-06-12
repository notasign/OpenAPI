package com.notasign.open.api.bean.resp.accesstoken;


import com.notasign.open.api.bean.base.BaseResp;

/**
 * @author huj
 * @version 1.0
 * @date 2021/10/25 13:49
 */
public class GetAccessTokenResp extends BaseResp {

    private String accessToken;

    private String expiresIn;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public String getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(String expiresIn) {
        this.expiresIn = expiresIn;
    }
}
