package com.notasign.open.api.bean.dto.field;

/**
 * 骑缝章配置对象。
 * <p>
 * 当 documentFields 中控件的 fieldType 为 stamp 或 eseal 时，可附加此配置，表示该控件为骑缝章。
 * 骑缝章定位信息由本对象的 positionY 独立承载，不使用 position 对象；如传入 position 将被忽略。
 */
public class CrossPageSealConfigDTO {

    /**
     * 盖章页面。all-全部页(默认) odd-奇数页 even-偶数页 自定义页码如 1,3,5-7。
     * 页码从1开始，需在文档实际页数范围内
     */
    private String applyPages;

    /**
     * 骑缝章垂直定位坐标（以 PDF 左上角为原点，单位 point）。
     * 不传则默认垂直居中；同一文档多个骑缝章均未指定时系统依次上下排列整体居中
     */
    private String positionY;

    public String getApplyPages() {
        return applyPages;
    }

    public void setApplyPages(String applyPages) {
        this.applyPages = applyPages;
    }

    public String getPositionY() {
        return positionY;
    }

    public void setPositionY(String positionY) {
        this.positionY = positionY;
    }
}
