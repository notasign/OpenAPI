package com.notasign.open.api.req.bulksend;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.base.EmptyResp;
import com.notasign.open.api.constants.OpenApiUrlConstants;

/**
 * 删除批量发送清单请求
 */
public class DeleteBulkSendListReq extends BaseReq<EmptyResp> {

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
    public Class<EmptyResp> getRespClass() {
        return EmptyResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.BULK_LIST_DELETE;
    }
}
