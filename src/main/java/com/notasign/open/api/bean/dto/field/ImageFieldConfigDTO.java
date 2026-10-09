package com.notasign.open.api.bean.dto.field;

/**
 * 图片控件配置（对齐服务端 ImageFieldConfigDTO）
 *
 * @author Nota
 */
public class ImageFieldConfigDTO {

    /**
     * 宽度，像素
     */
    private Integer width;

    /**
     * 高度，像素
     */
    private Integer height;

    /**
     * 宽高比：free 或 n:m
     */
    private String aspectRatio;

    /**
     * img 素材 fileId
     */
    private String fileId;

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

    public String getAspectRatio() {
        return aspectRatio;
    }

    public void setAspectRatio(String aspectRatio) {
        this.aspectRatio = aspectRatio;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }
}
