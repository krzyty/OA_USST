package model;

import java.util.Date;

public class File {
	private int fileID;
	private String fileName;
	private String fileType;
	private Date fileDate;
	private float fileSize;
	private String fileAddress;
	private User user;

	public File() {
	}

	public File(int fileID, String fileName, String fileType, Date fileDate,
			float fileSize, String fileAddress, User user) {
		this.fileID = fileID;
		this.fileName = fileName;
		this.fileType = fileType;
		this.fileDate = fileDate;
		this.fileSize = fileSize;
		this.fileAddress = fileAddress;
		this.user = user;
	}

	public String getFileAddress() {
		return fileAddress;
	}

	public void setFileAddress(String fileAddress) {
		this.fileAddress = fileAddress;
	}

	public int getFileID() {
		return fileID;
	}

	public void setFileID(int fileID) {
		this.fileID = fileID;
	}

	public String getFileName() {
		return fileName;
	}

	public void setFileName(String fileName) {
		this.fileName = fileName;
	}

	public String getFileType() {
		return fileType;
	}

	public void setFileType(String fileType) {
		this.fileType = fileType;
	}

	public Date getFileDate() {
		return fileDate;
	}

	public void setFileDate(Date fileDate) {
		this.fileDate = fileDate;
	}

	public float getFileSize() {
		return fileSize;
	}

	public void setFileSize(float fileSize) {
		this.fileSize = fileSize;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
}
