package com.calculator.model;

import org.springframework.stereotype.Component;

@Component
public class NumbersOutput {
	private int intResult;
	private float floatResult;

	public NumbersOutput() {
		super();
	}

	public int getIntResult() {
		return intResult;
	}

	public void setIntResult(int intResult) {
		this.intResult = intResult;
	}

	public float getFloatResult() {
		return floatResult;
	}

	public void setFloatResult(float floatResult) {
		this.floatResult = floatResult;
	}

	
	@Override
	public String toString() {
		return "NumbersOutput [intResult=" + intResult + ", floatResult=" + floatResult + "]";
	}
	
}
