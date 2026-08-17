package com.notasign.open.api.bean.dto.field;

/**
 * 单选项配置DTO
 */
public class RadioOptionDTO {

    /**
     * 选项值，必填
     */
    private String optionValue;

    /**
     * 相对位置（不传时按默认间距纵向排列）
     */
    private RelativePositionDTO relativePosition;

    public String getOptionValue() {
        return optionValue;
    }

    public void setOptionValue(String optionValue) {
        this.optionValue = optionValue;
    }

    public RelativePositionDTO getRelativePosition() {
        return relativePosition;
    }

    public void setRelativePosition(RelativePositionDTO relativePosition) {
        this.relativePosition = relativePosition;
    }
}
