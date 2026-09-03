package com.notasign.open.api.bean.dto.field;

/**
 * eSeal 控件配置（仅 fieldType=eseal 的控件定义允许传入）
 * <p>
 * fieldSize 从参与方维度迁移到控件维度；尺寸只存控件 fieldProperties.w/h。
 *
 * @author Nota
 * @since 2026-09-02
 */
public class ESealFieldConfigDTO {

    /**
     * eSeal 控件尺寸配置，未传时使用默认尺寸 272×64
     */
    private FieldSizeDTO fieldSize;

    public FieldSizeDTO getFieldSize() {
        return fieldSize;
    }

    public void setFieldSize(FieldSizeDTO fieldSize) {
        this.fieldSize = fieldSize;
    }
}
