package com.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

import com.calculator.model.Numbers;
import com.calculator.model.NumbersOutput;
import com.calculator.model.TextOutput;

import reactor.core.publisher.Mono;

@Service
public class PseudoServiceForCalculatorService {

	@Autowired
	RestTemplate restTemplate;

	@Autowired
	private WebClient.Builder webClientbuilder;

	@Autowired
	private Numbers numbers;

	@Autowired
	private NumbersOutput numbersOutput;

	@Autowired
	private TextOutput textOutput;
	
    /*public NumbersOutput callService(String firstNumber, String secondNumber, String operationPath) {
		numbers.setFirstNumber(firstNumber);
		numbers.setSecondNumber(secondNumber);
		NumbersOutput output = restTemplate.postForObject("http://192.168.99.1:8080" + operationPath, numbers,
				NumbersOutput.class);
		return output;
	}

	public TextOutput getHelloString(String name, String operationPath) {
		TextOutput output = restTemplate.getForObject("http://192.168.99.1:8080" + operationPath+name, TextOutput.class);
		return output;
	}*/

	public TextOutput getHelloString(String name, String operationPath) {
		TextOutput output = webClientbuilder
				.build()
				.get()
				.uri("http://192.168.99.1:8080" + operationPath+name)
				.retrieve().bodyToMono(TextOutput.class)
				.block();
		
		return output;
	}
	
	public NumbersOutput callService(String firstNumber, String secondNumber, String operationPath) {

		numbers.setFirstNumber(firstNumber);
		numbers.setSecondNumber(secondNumber);
		NumbersOutput output = webClientbuilder
				.build()
				.post()
				.uri("http://192.168.99.1:8080" + operationPath)
				.body(Mono.just(numbers), Numbers.class)
				.retrieve().bodyToMono(NumbersOutput.class)
				.block();
		
		return output;
	}

}