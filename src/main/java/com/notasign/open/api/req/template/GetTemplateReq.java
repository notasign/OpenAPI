package com.notasign.open.api.req.template;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.template.GetTemplateDetailResp;

/**
 * @author Nota
 * @date 2025/9/26 10:50
 */
public class GetTemplateReq extends BaseReq<GetTemplateDetailResp> {

    @JsonIgnore
    private String templateId;

    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    @Override
    public Class<GetTemplateDetailResp> getRespClass() {
        return GetTemplateDetailResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return String.format(OpenApiUrlConstants.GET_TEMPLATE, templateId);
    }
}
