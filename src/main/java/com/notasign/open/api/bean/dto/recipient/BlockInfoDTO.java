package com.notasign.open.api.bean.dto.recipient;

/**
 * 参与方阻塞信息（对齐服务端 BlockInfoRespDTO）
 *
 * @author Nota
 */
public class BlockInfoDTO {

    /**
     * 阻塞时间戳
     */
    private String blockAt;

    /**
     * 阻塞原因
     */
    private String blockReason;

    /**
     * 解阻时间戳
     */
    private String unblockAt;

    /**
     * 解阻原因
     */
    private String unblockReason;

    public String getBlockAt() {
        return blockAt;
    }

    public void setBlockAt(String blockAt) {
        this.blockAt = blockAt;
    }

    public String getBlockReason() {
        return blockReason;
    }

    public void setBlockReason(String blockReason) {
        this.blockReason = blockReason;
    }

    public String getUnblockAt() {
        return unblockAt;
    }

    public void setUnblockAt(String unblockAt) {
        this.unblockAt = unblockAt;
    }

    public String getUnblockReason() {
        return unblockReason;
    }

    public void setUnblockReason(String unblockReason) {
        this.unblockReason = unblockReason;
    }
}
