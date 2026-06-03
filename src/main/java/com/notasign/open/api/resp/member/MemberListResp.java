package com.notasign.open.api.resp.member;

import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;

/**
 * 成员列表响应
 */
public class MemberListResp extends BaseResp {

    private List<MemberInfoDTO> members;
    private Integer pageNumber;
    private Integer pageSize;
    private Integer totalPage;
    private Long totalCount;

    public List<MemberInfoDTO> getMembers() {
        return members;
    }

    public void setMembers(List<MemberInfoDTO> members) {
        this.members = members;
    }

    public Integer getPageNumber() {
        return pageNumber;
    }

    public void setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Integer getTotalPage() {
        return totalPage;
    }

    public void setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
    }

    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    public static class MemberInfoDTO {
        private String memberId;
        private String memberName;
        private String memberEmail;
        private String memberRole;
        private String memberStatus;
        private Long joinedTime;
        private String userCode;
        private List<String> scopes;

        public String getMemberId() {
            return memberId;
        }

        public void setMemberId(String memberId) {
            this.memberId = memberId;
        }

        public String getMemberName() {
            return memberName;
        }

        public void setMemberName(String memberName) {
            this.memberName = memberName;
        }

        public String getMemberEmail() {
            return memberEmail;
        }

        public void setMemberEmail(String memberEmail) {
            this.memberEmail = memberEmail;
        }

        public String getMemberRole() {
            return memberRole;
        }

        public void setMemberRole(String memberRole) {
            this.memberRole = memberRole;
        }

        public String getMemberStatus() {
            return memberStatus;
        }

        public void setMemberStatus(String memberStatus) {
            this.memberStatus = memberStatus;
        }

        public Long getJoinedTime() {
            return joinedTime;
        }

        public void setJoinedTime(Long joinedTime) {
            this.joinedTime = joinedTime;
        }

        public String getUserCode() {
            return userCode;
        }

        public void setUserCode(String userCode) {
            this.userCode = userCode;
        }

        public List<String> getScopes() {
            return scopes;
        }

        public void setScopes(List<String> scopes) {
            this.scopes = scopes;
        }
    }
}
