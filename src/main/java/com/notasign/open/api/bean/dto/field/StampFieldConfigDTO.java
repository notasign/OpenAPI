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

    /**
     * 骑缝章盖章页面。all-全部页 odd-奇数页 even-偶数页 custom-指定页。仅 isCrossPage=1 时有效
     */
    private String sealPages;

    /**
     * 骑缝章指定页码，仅 sealPages=custom 时有效。格式如 1,3,5-7
     */
    private String sealPagesCustom;

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

    public String getSealPages() {
        return sealPages;
    }

    public void setSealPages(String sealPages) {
        this.sealPages = sealPages;
    }

    public String getSealPagesCustom() {
        return sealPagesCustom;
    }

    public void setSealPagesCustom(String sealPagesCustom) {
        this.sealPagesCustom = sealPagesCustom;
    }
}
