package com.notasign.open.api.bean.dto.field;

import java.util.List;

/**
 * @author Nota
 * @date 2025/8/27 14:37
 */
public class StampFieldConfigDTO {

    private List<String> usageScope;

    private List<String> usageMethod;

    private String sizeMode;

    private FieldSizeDTO fieldSize;

    public List<String> getUsageScope() {
        return usageScope;
    }

    public void setUsageScope(List<String> usageScope) {
        this.usageScope = usageScope;
    }

    public List<String> getUsageMethod() {
        return usageMethod;
    }

    public void setUsageMethod(List<String> usageMethod) {
        this.usageMethod = usageMethod;
    }

    public String getSizeMode() {
        return sizeMode;
    }

    public void setSizeMode(String sizeMode) {
        this.sizeMode = sizeMode;
    }

    public FieldSizeDTO getFieldSize() {
        return fieldSize;
    }

    public void setFieldSize(FieldSizeDTO fieldSize) {
        this.fieldSize = fieldSize;
    }
}
