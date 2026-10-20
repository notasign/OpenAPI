package com.notasign.open.api.bean.dto.envelope;

import java.util.List;

/**
 * 信封自定义字段（信封级业务元数据，发件人/集成方可见可查，收件人不可见、不渲染进签署文档）
 *
 * 更新语义：不传 customFields 保持原值不变；传入非空对象整体替换该信封的全部自定义字段；
 * 传入空对象清空全部自定义字段；传入 null 返回参数错误。
 *
 * @author Nota
 * @date 2026/10/20 10:24
 */
public class EnvelopeCustomFieldsDTO {

    /**
     * 文本型字段列表，每项 name + value；字段名在同一信封内跨两个数组唯一，两个数组字段数之和上限20
     */
    private List<TextCustomField> textCustomFields;

    /**
     * 下拉型字段列表，每项 name + value + listItems；字段名在同一信封内跨两个数组唯一，两个数组字段数之和上限20
     */
    private List<ListCustomField> listCustomFields;

    public List<TextCustomField> getTextCustomFields() {
        return textCustomFields;
    }

    public void setTextCustomFields(List<TextCustomField> textCustomFields) {
        this.textCustomFields = textCustomFields;
    }

    public List<ListCustomField> getListCustomFields() {
        return listCustomFields;
    }

    public void setListCustomFields(List<ListCustomField> listCustomFields) {
        this.listCustomFields = listCustomFields;
    }

    public static class TextCustomField {

        /**
         * 字段名，同一信封内唯一，长度1~50
         */
        private String name;

        /**
         * 字段值，长度0~500
         */
        private String value;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }
    }

    public static class ListCustomField {

        /**
         * 字段名，同一信封内唯一，长度1~50
         */
        private String name;

        /**
         * 字段值（选中的项），长度0~500，必须命中 listItems
         */
        private String value;

        /**
         * 可选值列表，至少2项，每项1~50，项内不可重复
         */
        private List<String> listItems;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getValue() {
            return value;
        }

        public void setValue(String value) {
            this.value = value;
        }

        public List<String> getListItems() {
            return listItems;
        }

        public void setListItems(List<String> listItems) {
            this.listItems = listItems;
        }
    }
}
