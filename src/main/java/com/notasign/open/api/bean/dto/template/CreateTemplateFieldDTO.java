package com.notasign.open.api.bean.dto.template;


import com.notasign.open.api.bean.dto.field.FillFieldDTO;
import com.notasign.open.api.bean.dto.field.SignFieldDTO;
import com.notasign.open.api.bean.dto.recipient.ParticipantReqDTO;

import java.util.List;

/**
 * @author Nota
 * @date 2025/8/26 14:10
 */

public class CreateTemplateFieldDTO {

    private List<FillFieldDTO> fillFields;

    private List<SignFieldDTO> signFields;

    public List<FillFieldDTO> getFillFields() {
        return fillFields;
    }

    public void setFillFields(List<FillFieldDTO> fillFields) {
        this.fillFields = fillFields;
    }

    public List<SignFieldDTO> getSignFields() {
        return signFields;
    }

    public void setSignFields(List<SignFieldDTO> signFields) {
        this.signFields = signFields;
    }
}
