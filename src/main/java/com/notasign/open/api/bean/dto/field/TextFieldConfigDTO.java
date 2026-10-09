package com.notasign.open.api.bean.dto.field;

/**
 * 文本控件配置（对齐服务端 TextFieldConfigDTO）
 *
 * @author Nota
 */
public class TextFieldConfigDTO {

    /**
     * 宽度，像素
     */
    private Integer width;

    /**
     * 高度，像素
     */
    private Integer height;

    /**
     * 字号，6～100
     */
    private Integer fontSize;

    /**
     * 字体：songti/fangsong/heiti/kaiti/liberation_sans/liberation_serif/nimbus_sans/noto_sans/noto_serif
     */
    private String fontFamily;

    /**
     * 是否多行
     */
    private Boolean multiLine;

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

    public Integer getFontSize() {
        return fontSize;
    }

    public void setFontSize(Integer fontSize) {
        this.fontSize = fontSize;
    }

    public String getFontFamily() {
        return fontFamily;
    }

    public void setFontFamily(String fontFamily) {
        this.fontFamily = fontFamily;
    }

    public Boolean getMultiLine() {
        return multiLine;
    }

    public void setMultiLine(Boolean multiLine) {
        this.multiLine = multiLine;
    }
}
