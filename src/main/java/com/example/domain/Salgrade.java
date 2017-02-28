package com.example.domain;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Salgrade {

	private double grade;
	private double losal;
	private double hisal;

	public Salgrade() {
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
	 * @return the grade
	 */
	public double getGrade() {
		return grade;
	}

	/**
	 * @param value the grade to set
	 */
	public Salgrade setGrade(final double value) {
		grade = value;
		return this;
	}

	/**
	 * @return the losal
	 */
	public double getLosal() {
		return losal;
	}

	/**
	 * @param value the losal to set
	 */
	public Salgrade setLosal(final double value) {
		losal = value;
		return this;
	}

	/**
	 * @return the hisal
	 */
	public double getHisal() {
		return hisal;
	}

	/**
	 * @param value the hisal to set
	 */
	public Salgrade setHisal(final double value) {
		hisal = value;
		return this;
	}

}
