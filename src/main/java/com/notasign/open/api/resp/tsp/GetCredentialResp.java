package com.notasign.open.api.resp.tsp;

import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;

/**
 * @author fadada
 * @date 2025/10/13 15:32
 */
public class GetCredentialResp extends BaseResp {
    
    private List<CredentialDTO> credentials;

    public List<CredentialDTO> getCredentials() {
        return credentials;
    }

    public void setCredentials(List<CredentialDTO> credentials) {
        this.credentials = credentials;
    }

    public static class CredentialDTO {
        private String credentialId;

        public String getCredentialId() {
            return credentialId;
        }

        public void setCredentialId(String credentialId) {
            this.credentialId = credentialId;
        }
    }
}
