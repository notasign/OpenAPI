package com.notasign.open.api.bean.base;

/**
 * @author Fadada
 * @date 2021/12/17 10:28:55
 */
public class BaseHttpRes extends BaseBean {

    private Integer httpStatusCode;

    private String requestId;

    public Integer getHttpStatusCode() {
        return httpStatusCode;
    }

    public void setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }
}
