package com.notasign.open.api.resp.document;


import com.notasign.open.api.bean.base.BaseResp;

import java.util.List;


public class FileConversionResp extends BaseResp {

	private List<FileIdRes> files;

	public List<FileIdRes> getFiles() {
		return files;
	}

	public void setFiles(List<FileIdRes> files) {
		this.files = files;
	}

	public static class FileIdRes {
		private String fileId;
		private String fileType;
		private String fileUrl;
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

		public String getFileUrl() {
			return fileUrl;
		}

		public void setFileUrl(String fileUrl) {
			this.fileUrl = fileUrl;
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
