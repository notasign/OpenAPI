package com.notasign.open.api.bean.dto.recipient;

import java.util.List;

/**
 * @author Nota
 * @date 2025/5/22 17:08
 */
public class SignDemandDTO {

    private int orderNo;

    private List<JoinCheckConfiguration> joinCheckConfigurations;


    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public List<JoinCheckConfiguration> getJoinCheckConfigurations() {
        return joinCheckConfigurations;
    }

    public void setJoinCheckConfigurations(List<JoinCheckConfiguration> joinCheckConfigurations) {
        this.joinCheckConfigurations = joinCheckConfigurations;
    }

    public static class JoinCheckConfiguration {

        private String joinMethod;

        private String accessCode;

        public String getJoinMethod() {
            return joinMethod;
        }

        public void setJoinMethod(String joinMethod) {
            this.joinMethod = joinMethod;
        }

        public String getAccessCode() {
            return accessCode;
        }

        public void setAccessCode(String accessCode) {
            this.accessCode = accessCode;
        }
    }

}
