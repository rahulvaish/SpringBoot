package com.calculator.model;

public class Numbers {
	String firstNumber;
	String secondNumber;

	public Numbers() {
		super();
	}

	public String getFirstNumber() {
		return firstNumber;
	}

	public void setFirstNumber(String firstNumber) {
		this.firstNumber = firstNumber;
	}

	public String getSecondNumber() {
		return secondNumber;
	}

	public void setSecondNumber(String secondNumber) {
		this.secondNumber = secondNumber;
	}

	@Override
	public String toString() {
		return "Number [firstNumber=" + firstNumber + ", secondNumber=" + secondNumber + "]";
	}
}
