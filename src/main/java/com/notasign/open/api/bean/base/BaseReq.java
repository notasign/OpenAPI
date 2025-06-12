package com.notasign.open.api.bean.base;

/**
 * @author Fadada
 * 2021/9/8 16:09:38
 */
public abstract class BaseReq<T> extends BaseBean {
    private String accessToken;

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public abstract Class<T> getRespClass();

    public abstract String getApi(String... pathArgs);
}
