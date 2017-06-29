package model;

import java.util.Date;

public class Message {
	private int messageID;
	private String messageText;
	private User senduser;
	private User receiveuser;
	private Date sendTime;

	public Message() {
	}

	public Message(int messageID, String messageText, User senduser,
			User receiveuser, Date sendTime) {
		this.messageID = messageID;
		this.messageText = messageText;
		this.senduser = senduser;
		this.receiveuser = receiveuser;
		this.sendTime = sendTime;
	}

	public int getMessageID() {
		return messageID;
	}

	public void setMessageID(int messageID) {
		this.messageID = messageID;
	}

	public String getMessageText() {
		return messageText;
	}

	public void setMessageText(String messageText) {
		this.messageText = messageText;
	}

	public User getSenduser() {
		return senduser;
	}

	public void setSenduser(User senduser) {
		this.senduser = senduser;
	}

	public User getReceiveuser() {
		return receiveuser;
	}

	public void setReceiveuser(User receiveuser) {
		this.receiveuser = receiveuser;
	}

	public Date getSendTime() {
		return sendTime;
	}

	public void setSendTime(Date sendTime) {
		this.sendTime = sendTime;
	}
}
