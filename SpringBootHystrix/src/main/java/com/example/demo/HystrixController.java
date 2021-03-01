package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;



@RestController
public class HystrixController {
	@RequestMapping(value = "/getDetails/", method = RequestMethod.GET)
	@HystrixCommand(fallbackMethod="getDataFallback")
    public String getData() {
		return "HYSTRIX";
	}
	
	public String getDataFallback() {
		return "HYSTRIX";
	}
}
