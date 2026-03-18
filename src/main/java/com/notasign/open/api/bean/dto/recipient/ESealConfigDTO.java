package com.notasign.open.api.bean.dto.recipient;


/**
 * @author Fadada
 * @date 2026/1/22 18:07
 */
public class ESealConfigDTO {

    private String esealerType;

    private String esealId;

    private String credentialPin;

    public String getEsealerType() {
        return esealerType;
    }

    public void setEsealerType(String esealerType) {
        this.esealerType = esealerType;
    }

    public String getEsealId() {
        return esealId;
    }

    public void setEsealId(String esealId) {
        this.esealId = esealId;
    }

    public String getCredentialPin() {
        return credentialPin;
    }

    public void setCredentialPin(String credentialPin) {
        this.credentialPin = credentialPin;
    }
}
