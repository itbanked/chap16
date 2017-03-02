package com.example.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class GuestbookMessage {

	private double messageId;
	private String guestName;
	private String password;
	private String message;

	public GuestbookMessage() {
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString(){
		ObjectMapper objectMapper = new ObjectMapper();
		
		String json = null;
		
		try {
			json = objectMapper.writeValueAsString(this);
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return json;	
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
	public GuestbookMessage setMessageId(final double value) {
		messageId = value;
		return this;
	}

	/**
	 * @return the guestId
	 */
	public String getGuestName() {
		return guestName;
	}

	/**
	 * @param value the guestId to set
	 */
	public GuestbookMessage setGuestName(final String value) {
		guestName = value;
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
	public GuestbookMessage setPassword(final String value) {
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
	public GuestbookMessage setMessage(final String value) {
		message = value;
		return this;
	}

}
