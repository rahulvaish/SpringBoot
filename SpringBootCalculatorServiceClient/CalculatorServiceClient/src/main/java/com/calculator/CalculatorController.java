package com.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.calculator.model.Numbers;
import com.calculator.model.NumbersOutput;
import com.calculator.model.TextOutput;

@RestController
public class CalculatorController {

	@Autowired
	PseudoServiceForCalculatorService pseudoServiceForCalculatorService;
	
	@Autowired
	NumbersOutput numout;
	
	@Autowired
	TextOutput textOutput;
	
	@RequestMapping("/")
	public String welcome() {
		return "Calculator Client Application";
	}
	
	@RequestMapping(value="/hello/{name}",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public ResponseEntity hello(@PathVariable(value="name")String name) {		
		try{
			textOutput= pseudoServiceForCalculatorService.getHelloString(name,"/hello/");
			return ResponseEntity.status(HttpStatus.OK).body(textOutput);
		}catch(Exception e) {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	

	@RequestMapping(value = "/addition/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public ResponseEntity floatAddition(@RequestBody Numbers number) {
		
		try {
			numout = pseudoServiceForCalculatorService.callService(number.getFirstNumber(),
					number.getSecondNumber(), "/addition/float/");
			return ResponseEntity.status(HttpStatus.OK).body(numout);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(numout);
		}
	}

	@RequestMapping(value = "/substraction/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public ResponseEntity floatSubstraction(@RequestBody Numbers number) {
		
		try {
			numout = pseudoServiceForCalculatorService.callService(number.getFirstNumber(),
					number.getSecondNumber(), "/substraction/float/");
			return ResponseEntity.status(HttpStatus.OK).body(numout);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(numout);
		}
	}

	@RequestMapping(value = "/multiplication/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public ResponseEntity floatMultiplication(@RequestBody Numbers number) {
	
		try {
			numout = pseudoServiceForCalculatorService.callService(number.getFirstNumber(),
					number.getSecondNumber(), "/multiplication/float/");
			return ResponseEntity.status(HttpStatus.OK).body(numout);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(numout);
		}
	}

	@RequestMapping(value = "/division/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public ResponseEntity floatDivision(@RequestBody Numbers number) {

		try {
			numout = pseudoServiceForCalculatorService.callService(number.getFirstNumber(),
					number.getSecondNumber(), "/division/float/");
			return ResponseEntity.status(HttpStatus.OK).body(numout);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(numout);
		}
	}

	// -----------------------------------

	@RequestMapping(value = "/addition/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public ResponseEntity intAddition(@RequestBody Numbers number) {
	
		try {
			numout = pseudoServiceForCalculatorService.callService(number.getFirstNumber(),
					number.getSecondNumber(), "/addition/int/");
			return ResponseEntity.status(HttpStatus.OK).body(numout);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(numout);
		}
	}

	@RequestMapping(value = "/substraction/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public ResponseEntity intSubstraction(@RequestBody Numbers number) {

		try {
			numout = pseudoServiceForCalculatorService.callService(number.getFirstNumber(),
					number.getSecondNumber(), "/substraction/int/");
			return ResponseEntity.status(HttpStatus.OK).body(numout);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(numout);
		}
	}

	@RequestMapping(value = "/multiplication/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity intMultiplication(@RequestBody Numbers number) {

		try {
			numout = pseudoServiceForCalculatorService.callService(number.getFirstNumber(),
					number.getSecondNumber(), "/multiplication/int/");
			return ResponseEntity.status(HttpStatus.OK).body(numout);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(numout);
		}
	}

	@RequestMapping(value = "/division/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity intDivision(@RequestBody Numbers number) {

		try {
			numout = pseudoServiceForCalculatorService.callService(number.getFirstNumber(),
					number.getSecondNumber(), "/division/int/");
			return ResponseEntity.status(HttpStatus.OK).body(numout);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(numout);
		}
	}
}
