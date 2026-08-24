package com.notasign.open.api.req.tsp;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.tsp.SignHashResp;

import java.util.List;

/**
 * Hash签名请求
 */
public class SignHashReq extends BaseReq<SignHashResp> {

    /**
     * 证书ID
     */
    private String credentialId;

    /**
     * Hash数据列表
     */
    private List<HashData> hashDataList;

    /**
     * 证书PIN
     */
    private String credentialPin;

    public String getCredentialId() {
        return credentialId;
    }

    public void setCredentialId(String credentialId) {
        this.credentialId = credentialId;
    }

    public List<HashData> getHashDataList() {
        return hashDataList;
    }

    public void setHashDataList(List<HashData> hashDataList) {
        this.hashDataList = hashDataList;
    }

    public String getCredentialPin() {
        return credentialPin;
    }

    public void setCredentialPin(String credentialPin) {
        this.credentialPin = credentialPin;
    }

    @Override
    public Class<SignHashResp> getRespClass() {
        return SignHashResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.SIGN_HASH;
    }

    /**
     * Hash数据
     */
    public static class HashData {

        /**
         * HashID
         */
        private String hashId;

        /**
         * Hash值
         */
        private String hash;

        public String getHashId() {
            return hashId;
        }

        public void setHashId(String hashId) {
            this.hashId = hashId;
        }

        public String getHash() {
            return hash;
        }

        public void setHash(String hash) {
            this.hash = hash;
        }
    }
}
