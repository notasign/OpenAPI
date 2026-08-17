package com.notasign.open.api.bean.dto.field;

/**
 * 单选项相对位置（相对于父控件position的偏移量）DTO
 */
public class RelativePositionDTO {

    /**
     * X轴偏移量
     */
    private Double offsetX;

    /**
     * Y轴偏移量
     */
    private Double offsetY;

    public Double getOffsetX() {
        return offsetX;
    }

    public void setOffsetX(Double offsetX) {
        this.offsetX = offsetX;
    }

    public Double getOffsetY() {
        return offsetY;
    }

    public void setOffsetY(Double offsetY) {
        this.offsetY = offsetY;
    }
}
