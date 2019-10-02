package com.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.model.Number;

@RestController
public class CalculatorController {

	@Autowired
	PseudoServiceForCalculatorService pseudoServiceForCalculatorService;
	
	@RequestMapping("/")
	public String welcome() {
		return "Calculator Client Application";
	}

	@RequestMapping(value = "/addition/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String floatAddition(@RequestBody Number number) {
		return pseudoServiceForCalculatorService.callService(number.getFirstNumber(), number.getSecondNumber(),"/addition/float/");
	}

	@RequestMapping(value = "/substraction/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String floatSubstraction(@RequestBody Number number) {
		return pseudoServiceForCalculatorService.callService(number.getFirstNumber(), number.getSecondNumber(),"/substraction/float/");
	}

	@RequestMapping(value = "/multiplication/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String floatMultiplication(@RequestBody Number number) {
		return pseudoServiceForCalculatorService.callService(number.getFirstNumber(), number.getSecondNumber(),"/multiplication/float/");
	}

	@RequestMapping(value = "/division/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String floatDivision(@RequestBody Number number) {
		return pseudoServiceForCalculatorService.callService(number.getFirstNumber(), number.getSecondNumber(),"/division/float/");
	}
	
	// -----------------------------------

	@RequestMapping(value = "/addition/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String intAddition(@RequestBody Number number) {
		return pseudoServiceForCalculatorService.callService(number.getFirstNumber(), number.getSecondNumber(),"/addition/int/");
	}

	@RequestMapping(value = "/substraction/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String intSubstraction(@RequestBody Number number) {
		return pseudoServiceForCalculatorService.callService(number.getFirstNumber(), number.getSecondNumber(),"/substraction/int/");
	}

	@RequestMapping(value = "/multiplication/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String intMultiplication(@RequestBody Number number) {
		return pseudoServiceForCalculatorService.callService(number.getFirstNumber(), number.getSecondNumber(),"/multiplication/int/");
	}

	@RequestMapping(value = "/division/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public String intDivision(@RequestBody Number number) {
		return pseudoServiceForCalculatorService.callService(number.getFirstNumber(), number.getSecondNumber(),"/division/int/");
	}
}
