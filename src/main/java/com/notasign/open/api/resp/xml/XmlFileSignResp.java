package com.notasign.open.api.resp.xml;


import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;

/**
 * @author fadada
 * @date 2025/10/13 14:55
 */
public class XmlFileSignResp extends BaseResp {

    private String batchId;

    /**
     * 创建成功后已登记的XML文件定位信息
     */
    private List<XmlAcceptedItemResp> acceptedItems;

    public String getBatchId() {
        return batchId;
    }

    public void setBatchId(String batchId) {
        this.batchId = batchId;
    }

    public List<XmlAcceptedItemResp> getAcceptedItems() {
        return acceptedItems;
    }

    public void setAcceptedItems(List<XmlAcceptedItemResp> acceptedItems) {
        this.acceptedItems = acceptedItems;
    }
}
