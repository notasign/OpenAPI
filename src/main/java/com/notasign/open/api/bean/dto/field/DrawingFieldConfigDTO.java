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
}
