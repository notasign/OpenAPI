package com.notasign.open.api.req.bulksend;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.bulksend.BulkSendListDetailResp;

/**
 * 查询批量发送清单详情请求
 */
public class GetBulkSendListDetailReq extends BaseReq<BulkSendListDetailResp> {

    /**
     * 批量发送清单ID，必填
     */
    private String bulkSendListId;

    public String getBulkSendListId() {
        return bulkSendListId;
    }

    public void setBulkSendListId(String bulkSendListId) {
        this.bulkSendListId = bulkSendListId;
    }

    @Override
    public Class<BulkSendListDetailResp> getRespClass() {
        return BulkSendListDetailResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.BULK_LIST_DETAIL;
    }
}
