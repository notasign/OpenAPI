package com.notasign.open.api.resp.tsp;

import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;

/**
 * Hash签名响应
 */
public class SignHashResp extends BaseResp {

    /**
     * 签名数据列表
     */
    private List<SignatureData> signatureDataList;

    public List<SignatureData> getSignatureDataList() {
        return signatureDataList;
    }

    public void setSignatureDataList(List<SignatureData> signatureDataList) {
        this.signatureDataList = signatureDataList;
    }

    /**
     * 签名数据
     */
    public static class SignatureData {

        /**
         * 签名结果(Base64编码)
         */
        private String signature;

        /**
         * 签名算法
         */
        private String signatureAlgorithm;

        /**
         * Hash算法
         */
        private String hashAlgorithm;

        public String getSignature() {
            return signature;
        }

        public void setSignature(String signature) {
            this.signature = signature;
        }

        public String getSignatureAlgorithm() {
            return signatureAlgorithm;
        }

        public void setSignatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
        }

        public String getHashAlgorithm() {
            return hashAlgorithm;
        }

        public void setHashAlgorithm(String hashAlgorithm) {
            this.hashAlgorithm = hashAlgorithm;
        }
    }
}
