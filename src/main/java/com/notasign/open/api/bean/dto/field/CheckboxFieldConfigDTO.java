package com.notasign.open.api.bean.dto.field;

import java.util.List;

/**
 * 复选框控件配置DTO，fieldType=checkbox时有效
 */
public class CheckboxFieldConfigDTO {

    /**
     * 选项数量，取值范围10-32
     */
    private Integer optionSize;

    /**
     * 默认选中的选项值列表
     */
    private List<String> selectedValues;

    /**
     * 选项列表
     */
    private List<CheckboxOptionDTO> options;

    public Integer getOptionSize() {
        return optionSize;
    }

    public void setOptionSize(Integer optionSize) {
        this.optionSize = optionSize;
    }

    public List<String> getSelectedValues() {
        return selectedValues;
    }

    public void setSelectedValues(List<String> selectedValues) {
        this.selectedValues = selectedValues;
    }

    public List<CheckboxOptionDTO> getOptions() {
        return options;
    }

    public void setOptions(List<CheckboxOptionDTO> options) {
        this.options = options;
    }
}
