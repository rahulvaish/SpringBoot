package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMethod;

@RestController
public class HelloSpringBootController {

	@RequestMapping(method = RequestMethod.GET, value = "/api/example/welcome")
	public String welcome() {
		return "Welcome to Spring Boot Swagger Example";
	}

	@RequestMapping(method = RequestMethod.GET, value = "/api/example/helloworld")
	public String helloWorld() {
		return "Hello World. Awesome !";
	}
}
