package com.notasign.open.api.bean.dto.recipient;

/**
 * 参与方阻塞配置
 *
 * @author nota
 */
public class BlockConfigDTO {


    private Boolean blockHere;


    private String blockReason;

    private Boolean notifyWhenBlocked;

    public Boolean getBlockHere() {
        return blockHere;
    }

    public void setBlockHere(Boolean blockHere) {
        this.blockHere = blockHere;
    }

    public String getBlockReason() {
        return blockReason;
    }

    public void setBlockReason(String blockReason) {
        this.blockReason = blockReason;
    }

    public Boolean getNotifyWhenBlocked() {
        return notifyWhenBlocked;
    }

    public void setNotifyWhenBlocked(Boolean notifyWhenBlocked) {
        this.notifyWhenBlocked = notifyWhenBlocked;
    }
}
