package com.notasign.open.api.bean.resp.document;


import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;


public class FileConversionResp extends BaseResp {

	private List<FileIdRes> fileIdList;

	public List<FileIdRes> getFileIdList() {
		return fileIdList;
	}

	public void setFileIdList(List<FileIdRes> fileIdList) {
		this.fileIdList = fileIdList;
	}

	public static class FileIdRes {
		private String fileId;
		private String fileType;
		private String fddFileUrl;
		private String fileName;
		private Integer fileTotalPages ;

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

		public String getFddFileUrl() {
			return fddFileUrl;
		}

		public void setFddFileUrl(String fddFileUrl) {
			this.fddFileUrl = fddFileUrl;
		}

		public String getFileName() {
			return fileName;
		}

		public void setFileName(String fileName) {
			this.fileName = fileName;
		}

		public Integer getFileTotalPages() {
			return fileTotalPages;
		}

		public void setFileTotalPages(Integer fileTotalPages) {
			this.fileTotalPages = fileTotalPages;
		}
	}


}
