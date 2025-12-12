package com.notasign.open.api.resp.xml;


import com.notasign.open.api.bean.base.BaseResp;

/**
 * @author fadada
 * @date 2025/10/13 17:41
 */
public class DownloadSignXmlResp extends BaseResp {

    private String downloadUrl;

    public String getDownloadUrl() {
        return downloadUrl;
    }

    public void setDownloadUrl(String downloadUrl) {
        this.downloadUrl = downloadUrl;
    }
}
