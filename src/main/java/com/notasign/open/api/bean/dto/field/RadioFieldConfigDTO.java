package com.notasign.open.api.bean.dto.field;

import java.util.List;

/**
 * 单选框控件配置DTO，fieldType=radio时有效
 */
public class RadioFieldConfigDTO {

    /**
     * 选项数量，取值范围10-32
     */
    private Integer optionSize;

    /**
     * 默认选中的选项值
     */
    private String selectedValue;

    /**
     * 选项列表
     */
    private List<RadioOptionDTO> options;

    public Integer getOptionSize() {
        return optionSize;
    }

    public void setOptionSize(Integer optionSize) {
        this.optionSize = optionSize;
    }

    public String getSelectedValue() {
        return selectedValue;
    }

    public void setSelectedValue(String selectedValue) {
        this.selectedValue = selectedValue;
    }

    public List<RadioOptionDTO> getOptions() {
        return options;
    }

    public void setOptions(List<RadioOptionDTO> options) {
        this.options = options;
    }
}
