package com.notasign.open.api.resp.xml;

import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;

/**
 * XML签署单文件结果响应（含issue明细分页）
 */
public class XmlSignItemDetailResp extends BaseResp {

    /**
     * 文件级结果
     */
    private XmlSignTaskResp.Item item;

    /**
     * issue分页
     */
    private IssuePage issuePage;

    public XmlSignTaskResp.Item getItem() {
        return item;
    }

    public void setItem(XmlSignTaskResp.Item item) {
        this.item = item;
    }

    public IssuePage getIssuePage() {
        return issuePage;
    }

    public void setIssuePage(IssuePage issuePage) {
        this.issuePage = issuePage;
    }

    /**
     * XML签署issue游标分页
     */
    public static class IssuePage {

        /**
         * issue类型: ERROR/WARNING
         */
        private String issueType;

        /**
         * 当前游标
         */
        private Long cursor;

        /**
         * 下一页游标
         */
        private Long nextCursor;

        /**
         * 每页大小
         */
        private Integer pageSize;

        /**
         * 是否还有下一页
         */
        private Boolean hasMore;

        /**
         * 当前过滤条件下总数
         */
        private Long total;

        /**
         * issue记录
         */
        private List<XmlSignTaskResp.Issue> records;

        public String getIssueType() {
            return issueType;
        }

        public void setIssueType(String issueType) {
            this.issueType = issueType;
        }

        public Long getCursor() {
            return cursor;
        }

        public void setCursor(Long cursor) {
            this.cursor = cursor;
        }

        public Long getNextCursor() {
            return nextCursor;
        }

        public void setNextCursor(Long nextCursor) {
            this.nextCursor = nextCursor;
        }

        public Integer getPageSize() {
            return pageSize;
        }

        public void setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
        }

        public Boolean getHasMore() {
            return hasMore;
        }

        public void setHasMore(Boolean hasMore) {
            this.hasMore = hasMore;
        }

        public Long getTotal() {
            return total;
        }

        public void setTotal(Long total) {
            this.total = total;
        }

        public List<XmlSignTaskResp.Issue> getRecords() {
            return records;
        }

        public void setRecords(List<XmlSignTaskResp.Issue> records) {
            this.records = records;
        }
    }
}
