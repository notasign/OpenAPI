package com.notasign.open.api.bean.dto.field;


/**
 * @author Nota
 * @date 2025/5/22 16:55
 */
public class PositionDTO {

    private String positionMode;

    private Integer positionPageNo;

    private String positionX;

    private String positionY;

    private String positionKeyword;

    private String keywordOffsetX;

    private String keywordOffsetY;

    public String getPositionMode() {
        return positionMode;
    }

    public void setPositionMode(String positionMode) {
        this.positionMode = positionMode;
    }

    public Integer getPositionPageNo() {
        return positionPageNo;
    }

    public void setPositionPageNo(Integer positionPageNo) {
        this.positionPageNo = positionPageNo;
    }

    public String getPositionX() {
        return positionX;
    }

    public void setPositionX(String positionX) {
        this.positionX = positionX;
    }

    public String getPositionY() {
        return positionY;
    }

    public void setPositionY(String positionY) {
        this.positionY = positionY;
    }

    public String getPositionKeyword() {
        return positionKeyword;
    }

    public void setPositionKeyword(String positionKeyword) {
        this.positionKeyword = positionKeyword;
    }

    public String getKeywordOffsetX() {
        return keywordOffsetX;
    }

    public void setKeywordOffsetX(String keywordOffsetX) {
        this.keywordOffsetX = keywordOffsetX;
    }

    public String getKeywordOffsetY() {
        return keywordOffsetY;
    }

    public void setKeywordOffsetY(String keywordOffsetY) {
        this.keywordOffsetY = keywordOffsetY;
    }
}
