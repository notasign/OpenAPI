package com.notasign.open.api.bean.dto.recipient;

/**
 * 发送方信息（对齐服务端 SenderDTO）
 *
 * @author Nota
 */
public class SenderDTO {

    /**
     * 发送方名称
     */
    private String name;

    /**
     * 发送方邮箱
     */
    private String email;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
