package com.notasign.open.api.req.bulksend;

import com.notasign.open.api.bean.base.BaseReq;
import com.notasign.open.api.bean.dto.bulksend.BulkSendListItemDTO;
import com.notasign.open.api.constants.OpenApiUrlConstants;
import com.notasign.open.api.resp.bulksend.CreateBulkSendListResp;

import java.util.List;

/**
 * 更新批量发送清单请求
 */
public class UpdateBulkSendListReq extends BaseReq<CreateBulkSendListResp> {

    /**
     * 批量发送清单ID，必填
     */
    private String bulkSendListId;

    /**
     * 创建方式，必填：MANUAL-手动录入，FILE-文件导入
     */
    private String createMode;

    /**
     * 清单内容，createMode=MANUAL时必填
     */
    private List<BulkSendListItemDTO> bulkSendList;

    /**
     * 清单文件ID，createMode=FILE时必填（先通过文件上传接口获取）
     */
    private String fileId;

    /**
     * 清单文件类型：csv/xlsx/xls
     */
    private String fileType;

    /**
     * 清单文件名
     */
    private String fileName;

    public String getBulkSendListId() {
        return bulkSendListId;
    }

    public void setBulkSendListId(String bulkSendListId) {
        this.bulkSendListId = bulkSendListId;
    }

    public String getCreateMode() {
        return createMode;
    }

    public void setCreateMode(String createMode) {
        this.createMode = createMode;
    }

    public List<BulkSendListItemDTO> getBulkSendList() {
        return bulkSendList;
    }

    public void setBulkSendList(List<BulkSendListItemDTO> bulkSendList) {
        this.bulkSendList = bulkSendList;
    }

    public String getFileId() {
        return fileId;
    }

    public void setFileId(String fileId) {
        this.fileId = fileId;
    }

    public String getFileType() {
        return fileType;
    }

    public void setFileType(String fileType) {
        this.fileType = fileType;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public Class<CreateBulkSendListResp> getRespClass() {
        return CreateBulkSendListResp.class;
    }

    @Override
    public String getApi(String... pathArgs) {
        return OpenApiUrlConstants.BULK_LIST_UPDATE;
    }
}
