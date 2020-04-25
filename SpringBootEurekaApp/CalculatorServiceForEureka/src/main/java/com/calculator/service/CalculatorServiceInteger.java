package com.calculator.service;
import org.springframework.stereotype.Service;

@Service
public class CalculatorServiceInteger {

	public String addition(String firstNumber, String secondNumber) {
		if (firstNumber != null && secondNumber != null) {
			try {
				int val1 = Integer.parseInt(firstNumber);
				int val2 = Integer.parseInt(secondNumber);
				int sum = val1 + val2;
				return String.valueOf(sum);
			} catch (NumberFormatException exception) {
				return "ERROR: Enter the int numbers";
			}
		} else {
			return "ERROR: Computing numbers can not be null";
		}

	}

	public String substraction(String firstNumber, String secondNumber) {
		if (firstNumber != null && secondNumber != null) {
			try {
				int val1 = Integer.parseInt(firstNumber);
				int val2 = Integer.parseInt(secondNumber);
				int sub = val1 - val2;
				return String.valueOf(sub);
			} catch (NumberFormatException exception) {
				return "ERROR: Enter the int numbers";
			}
		} else {
			return "ERROR: Computing numbers can not be null";
		}
	}

	public String multiplication(String firstNumber, String secondNumber) {
		if (firstNumber != null && secondNumber != null) {
			try {
				int val1 = Integer.parseInt(firstNumber);
				int val2 = Integer.parseInt(secondNumber);
				int mul = val1 * val2;
				return String.valueOf(mul);
			} catch (NumberFormatException exception) {
				return "ERROR: Enter the int numbers";
			}
		} else {
			return "ERROR: Computing numbers can not be null";
		}
	}

	public String division(String firstNumber, String secondNumber) {
		if (firstNumber != null && secondNumber != null) {
			try {
				int val1 = Integer.parseInt(firstNumber);
				int val2 = Integer.parseInt(secondNumber);
				if (val2 != 0 || val2 != 0.0) {
					int div = val1 / val2;
					return String.valueOf(div);
				} else {
					return String.valueOf(0);
				}
			} catch (NumberFormatException exception) {
				return "ERROR: Enter the int numbers";
			}
		} else {
			return "ERROR: Computing numbers can not be null";
		}
	}
}
