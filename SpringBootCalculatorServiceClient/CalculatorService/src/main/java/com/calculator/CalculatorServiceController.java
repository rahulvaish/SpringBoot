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
import com.calculator.service.CalculatorServiceFloat;
import com.calculator.service.CalculatorServiceInteger;

@RestController
public class CalculatorServiceController {

	@Autowired
	CalculatorServiceFloat calculatorServiceFloat;
	@Autowired
	CalculatorServiceInteger calculatorServiceInteger;

	@Autowired
	NumbersOutput numout;
	
	@Autowired
	TextOutput textOutput;
	
	@RequestMapping("/")
	public String welcome() {
		return "Calculator Service Application";
	}
	
	@RequestMapping(value="/hello/{name}",method=RequestMethod.GET,produces="application/json")
	@ResponseBody
	public ResponseEntity hello(@PathVariable(value="name")String name) {
		String str= "Calculator Service Application for "+name;
		textOutput.setTextOutput(str);
		if(name!=null) {
			return ResponseEntity.status(HttpStatus.OK).body(textOutput);
		}else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
		}
	}
	

	// ----------CalculatorServiceFloat-------------

	@RequestMapping(value = "/addition/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	@ResponseBody
	public ResponseEntity floatAddition(@RequestBody Numbers number) {
		try {
			String num = calculatorServiceFloat.addition(number.getFirstNumber(), number.getSecondNumber());
			if(num!=null) {
				numout.setFloatResult(Float.parseFloat(num));
			}
			return ResponseEntity.status(HttpStatus.OK).body(numout);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(numout);
		}
	}

	@ResponseBody
	@RequestMapping(value = "/substraction/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity floatSubstraction(@RequestBody Numbers number) {
		
		try {
			String num = calculatorServiceFloat.substraction(number.getFirstNumber(), number.getSecondNumber());
			if(num!=null) {
				numout.setFloatResult(Float.parseFloat(num));
			}
			return ResponseEntity.status(HttpStatus.OK).body(numout);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(numout);
		}
	}

	@ResponseBody
	@RequestMapping(value = "/multiplication/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity floatMultiplication(@RequestBody Numbers number) {

		try {
			String num = calculatorServiceFloat.multiplication(number.getFirstNumber(), number.getSecondNumber());
			if(num!=null) {
				numout.setFloatResult(Float.parseFloat(num));
			}
			return ResponseEntity.status(HttpStatus.OK).body(numout);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(numout);
		}
	}

	@ResponseBody
	@RequestMapping(value = "/division/float/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity floatDivision(@RequestBody Numbers number) {
		
		try {
			String	num = calculatorServiceFloat.division(number.getFirstNumber(), number.getSecondNumber());
			if(num!=null) {
				numout.setFloatResult(Float.parseFloat(num));
			}
			return ResponseEntity.status(HttpStatus.OK).body(numout);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(numout);
		}
	}

	// ----------CalculatorServiceInteger-------------
	@ResponseBody
	@RequestMapping(value = "/addition/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity intAddition(@RequestBody Numbers number) {
		
		try {
			String num = calculatorServiceInteger.addition(number.getFirstNumber(), number.getSecondNumber());
			if(num!=null) {
				numout.setIntResult(Integer.parseInt(num));
			}
			return ResponseEntity.status(HttpStatus.OK).body(numout);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(numout);
		}
	}

	@ResponseBody
	@RequestMapping(value = "/substraction/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity intSubstraction(@RequestBody Numbers number) {

		try {
			String num = calculatorServiceInteger.substraction(number.getFirstNumber(), number.getSecondNumber());
			if(num!=null) {
				numout.setIntResult(Integer.parseInt(num));
			}
			return ResponseEntity.status(HttpStatus.OK).body(numout);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(numout);
		}
	}

	@ResponseBody
	@RequestMapping(value = "/multiplication/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity intMultiplication(@RequestBody Numbers number) {

		try {
			String num = 
					calculatorServiceInteger.multiplication(number.getFirstNumber(), number.getSecondNumber());
			if(num!=null) {
				numout.setIntResult(Integer.parseInt(num));
			}
			return ResponseEntity.status(HttpStatus.OK).body(numout);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(numout);
		}
	}

	@ResponseBody
	@RequestMapping(value = "/division/int/", method = RequestMethod.POST, consumes = "application/json", produces = "application/json")
	public ResponseEntity intDivision(@RequestBody Numbers number) {
		
		try {
			String num = String.valueOf(calculatorServiceInteger.division(number.getFirstNumber(), number.getSecondNumber()));
			if(num!=null) {
				numout.setIntResult(Integer.parseInt(num));
			}
			return ResponseEntity.status(HttpStatus.OK).body(numout);
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(numout);
		}
	}

}
