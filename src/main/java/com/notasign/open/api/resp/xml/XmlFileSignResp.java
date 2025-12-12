package com.notasign.open.api.resp.xml;


import com.notasign.open.api.bean.base.BaseResp;

/**
 * @author caishangdong
 * @date 2025/10/13 14:55
 */
public class XmlFileSignResp extends BaseResp {

    private String batchId;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }
}
