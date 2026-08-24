package com.notasign.open.api.bean.dto.field;

/**
 * 手绘控件配置要求
 *
 * @author Nota
 * @date 2026/5/25 14:37
 */
public class DrawingFieldConfigDTO {

    private Integer width;

    private Integer height;

    private String promptText;

    private Integer promptSize;

    /**
     * 手写控件内容模式。background-背景手绘模式；inkOnly-仅笔迹填充模式
     */
    private String contentMode;

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public String getPromptText() {
        return promptText;
    }

    public void setPromptText(String promptText) {
        this.promptText = promptText;
    }

    public Integer getPromptSize() {
        return promptSize;
    }

    public void setPromptSize(Integer promptSize) {
        this.promptSize = promptSize;
    }

    public String getContentMode() {
        return contentMode;
    }

    public void setContentMode(String contentMode) {
        this.contentMode = contentMode;
    }
}
