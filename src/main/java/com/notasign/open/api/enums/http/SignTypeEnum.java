package com.notasign.open.api.enums.http;

/**
 * @author Nota
 * 2021/9/8 16:09:38
 */
public enum SignTypeEnum {

    RSA_SHA256("RSA-SHA256");

    private String type;

    SignTypeEnum(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }
}
