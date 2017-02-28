package com.example.domain;

public class GestbookMessage {

	private double messageId;
	private String guestId;
	private String password;
	private String message;

	public GestbookMessage() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the messageId
	 */
	public double getMessageId() {
		return messageId;
	}

	/**
	 * @param value the messageId to set
	 */
	public GestbookMessage setMessageId(final double value) {
		messageId = value;
		return this;
	}

	/**
	 * @return the guestId
	 */
	public String getGuestId() {
		return guestId;
	}

	/**
	 * @param value the guestId to set
	 */
	public GestbookMessage setGuestId(final String value) {
		guestId = value;
		return this;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param value the password to set
	 */
	public GestbookMessage setPassword(final String value) {
		password = value;
		return this;
	}

	/**
	 * @return the message
	 */
	public String getMessage() {
		return message;
	}

	/**
	 * @param value the message to set
	 */
	public GestbookMessage setMessage(final String value) {
		message = value;
		return this;
	}

}
