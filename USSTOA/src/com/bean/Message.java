package com.bean;

public class Message {
	private int MessageSender;
	private String MessageContent;
	private float MessageDate;
	private int MessageAccptorID;

	public Message() {
	}

	public Message(int MessageSender, String MessageContent, float MessageDate, int MessageAccptorID) {
		this.MessageSender = MessageSender;
		this.MessageContent = MessageContent;
		this.MessageDate = MessageDate;
		this.MessageAccptorID = MessageAccptorID;
	}

	public void setMessageSender(int MessageSender) {
		this.MessageSender = MessageSender;
	}

	public void setMessageContent(String MessageContent) {
		this.MessageContent = MessageContent;
	}

	public void setMessageDate(float MessageDate) {
		this.MessageDate = MessageDate;
	}

	public void setMessageAccptorID(int MessageAccptorID) {
		this.MessageAccptorID = MessageAccptorID;
	}

	public int MessageSender() {
		return this.MessageSender;
	}

	public String getUserPassword() {
		return this.MessageContent;
	}

	public float MessageDate() {
		return this.MessageDate;
	}

	public int getessageAccptorID() {
		return this.MessageAccptorID;
	}
}
