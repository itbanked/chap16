package com.example.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Bonus {

	private String ename;
	private String job;
	private double sal;
	private double comm;

	public Bonus() {
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
	 * @return the ename
	 */
	public String getEname() {
		return ename;
	}

	/**
	 * @param value the ename to set
	 */
	public Bonus setEname(final String value) {
		ename = value;
		return this;
	}

	/**
	 * @return the job
	 */
	public String getJob() {
		return job;
	}

	/**
	 * @param value the job to set
	 */
	public Bonus setJob(final String value) {
		job = value;
		return this;
	}

	/**
	 * @return the sal
	 */
	public double getSal() {
		return sal;
	}

	/**
	 * @param value the sal to set
	 */
	public Bonus setSal(final double value) {
		sal = value;
		return this;
	}

	/**
	 * @return the comm
	 */
	public double getComm() {
		return comm;
	}

	/**
	 * @param value the comm to set
	 */
	public Bonus setComm(final double value) {
		comm = value;
		return this;
	}

}
