package com.notasign.open.api.exception;

/**
 * @author Nota
 * 2021/9/8 16:09:38
 */
public class ApiException extends Exception {

    public ApiException() {
        super();
    }

    public ApiException(String message, Throwable cause) {
        super(message, cause);
    }

    public ApiException(String message) {
        super(message);
    }

    public ApiException(Throwable cause) {
        super(cause);
    }

}
