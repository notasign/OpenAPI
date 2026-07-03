package com.notasign.open.api.bean.dto.field;

import java.io.Serializable;

/**
 * 图章控件尺寸配置
 *
 * @author Nota
 * @date 2026/5/25 14:37
 */
public class FieldSizeDTO implements Serializable {

    private static final long serialVersionUID = 1L;

    private Integer width;

    private Integer height;

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
}
