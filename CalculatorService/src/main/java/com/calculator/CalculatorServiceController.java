package com.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.model.Number;
import com.calculator.service.CalculatorServiceFloat;
import com.calculator.service.CalculatorServiceInteger;

@RestController
public class CalculatorServiceController {

	@Autowired
	CalculatorServiceFloat calculatorServiceFloat;
	@Autowired
	CalculatorServiceInteger calculatorServiceInteger;


	@RequestMapping("/")
	public String welcome() {
		return "Calculator Service Application";
	}

	// ----------CalculatorServiceFloat-------------

	@RequestMapping(value = "/addition/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String floatAddition(@RequestBody Number number) {
		return String.valueOf(calculatorServiceFloat.addition(number.getFirstNumber(), number.getSecondNumber()));
	}

	@RequestMapping(value = "/substraction/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String floatSubstraction(@RequestBody Number number) {
		return String.valueOf(calculatorServiceFloat.substraction(number.getFirstNumber(), number.getSecondNumber()));
	}

	@RequestMapping(value = "/multiplication/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String floatMultiplication(@RequestBody Number number) {
		return String.valueOf(calculatorServiceFloat.multiplication(number.getFirstNumber(), number.getSecondNumber()));
	}

	@RequestMapping(value = "/division/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String floatDivision(@RequestBody Number number) {
		return String.valueOf(calculatorServiceFloat.division(number.getFirstNumber(), number.getSecondNumber()));
	}

	// ----------CalculatorServiceInteger-------------

	@RequestMapping(value = "/addition/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String intAddition(@RequestBody Number number) {
		return String.valueOf(calculatorServiceInteger.addition(number.getFirstNumber(), number.getSecondNumber()));
	}

	@RequestMapping(value = "/substraction/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String intSubstraction(@RequestBody Number number) {
		return String.valueOf(calculatorServiceInteger.substraction(number.getFirstNumber(), number.getSecondNumber()));
	}

	@RequestMapping(value = "/multiplication/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String intMultiplication(@RequestBody Number number) {
		return String
				.valueOf(calculatorServiceInteger.multiplication(number.getFirstNumber(), number.getSecondNumber()));
	}

	@RequestMapping(value = "/division/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String intDivision(@RequestBody Number number) {
		return String.valueOf(calculatorServiceInteger.division(number.getFirstNumber(), number.getSecondNumber()));
	}

}
