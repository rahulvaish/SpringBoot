package com.calculator.service;

import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceFloat {

	public String addition(String firstNumber, String secondNumber) {
		if (firstNumber != null && secondNumber != null) {
			try {
				float val1 = Float.parseFloat(firstNumber);
				float val2 = Float.parseFloat(secondNumber);
				float sum = val1 + val2;
				return String.valueOf(sum);
			} catch (NumberFormatException exception) {
				return "ERROR: Enter the floating numbers";
			}
		}
		else {
			return "ERROR: Computing numbers can not be null";
		}
	}

	public String substraction(String firstNumber, String secondNumber) {
		if (firstNumber != null && secondNumber != null) {
			try {
				float val1 = Float.parseFloat(firstNumber);
				float val2 = Float.parseFloat(secondNumber);
				float sub = val1 - val2;
				return String.valueOf(sub);
			} catch (NumberFormatException exception) {
				return "ERROR: Enter the floating numbers";
			}
		}
		else {
			return "ERROR: Computing numbers can not be null";
		}
	}

	public String multiplication(String firstNumber, String secondNumber) {
		if (firstNumber != null && secondNumber != null) {
			try {
				float val1 = Float.parseFloat(firstNumber);
				float val2 = Float.parseFloat(secondNumber);
				float mul = val1 * val2;
				return String.valueOf(mul);
			} catch (NumberFormatException exception) {
				return "ERROR: Enter the floating numbers";
			}
		}
		else {
			return "ERROR: Computing numbers can not be null";
		}
	}

	public String division(String firstNumber, String secondNumber) {
		if (firstNumber != null && secondNumber != null) {
			try {
				float val1 = Float.parseFloat(firstNumber);
				float val2 = Float.parseFloat(secondNumber);
				if (val2 != 0 || val2 != 0.0) {
					float div = val1 / val2;
					return String.valueOf(div);
				} else {
					return String.valueOf(0);
				}
			} catch (NumberFormatException exception) {
				return "ERROR: Enter the floating numbers";
			}
		}
		else {
			return "ERROR: Computing numbers can not be null";
		}
	}

}
