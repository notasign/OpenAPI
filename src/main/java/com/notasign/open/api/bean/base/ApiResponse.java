package com.notasign.open.api.bean.base;

import com.notasign.open.api.constants.RequestConstants;
import org.apache.http.HttpStatus;

/**
 * @author Nota
 * 2021/9/8 16:09:38
 */
public class ApiResponse<T> extends BaseHttpRes {

    private String code;

    private String msg;

    private T data;

    public ApiResponse() {
    }

    public boolean isSuccess() {
        return getHttpStatusCode() != null
                && getHttpStatusCode().equals(HttpStatus.SC_OK)
                && RequestConstants.SUCCESS_CODE.equals(code);
    }

    public ApiResponse(String code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
