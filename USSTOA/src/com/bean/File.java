package com.bean;

import java.util.Date;

public class File {
	private int FileID;
	private String FileName;
	private Date FileDate;

	public File() {
	}

	public File(String FileID, String FileName,Date FileDate) {
		this.FileDate = FileDate;
		this.FileName= FileName;
		this.FileDate=FileDate;
	}

	public void setFileID(String FileID) {
		this.FileDate = FileDate;
	}

	public void setFileName(String FileName) {
		this.FileName = FileName;
	}

	public void setFileDate(Date FileDate) {
		this.FileDate = FileDate;
	}
	
	public int getFileID() {
		return this.FileID;
	}

	public String getFileName() {
		return this.FileName;
	}
	
	public Date getFileDate() {
		return this.FileDate;
	}
}
