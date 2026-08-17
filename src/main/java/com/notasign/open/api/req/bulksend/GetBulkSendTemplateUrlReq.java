package com.notasign.open.api.req.bulksend;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.bulksend.BulkSendTemplateResp;

/**
 * 获取批量发送清单模板下载地址请求
 */
public class GetBulkSendTemplateUrlReq extends BaseReq<BulkSendTemplateResp> {

    @Override
    public Class<BulkSendTemplateResp> getRespClass() {
        return BulkSendTemplateResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.BULK_LIST_TEMPLATE_URL;
    }
}
