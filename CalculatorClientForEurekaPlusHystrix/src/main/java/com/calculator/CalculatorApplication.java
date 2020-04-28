package com.calculator;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.reactive.function.client.WebClient;

@SpringBootApplication
@EnableEurekaClient
@EnableCircuitBreaker
@EnableHystrixDashboard
public class CalculatorApplication {

	@Bean
	@LoadBalanced
    public RestTemplate getRestTemplate() {
		return new RestTemplate();
    }
	@Bean
	//@LoadBalanced
    public WebClient.Builder getWebclientBuilder() {
		return  WebClient.builder();
    }
	public static void main(String[] args) {
		SpringApplication.run(CalculatorApplication.class, args);
	}
}
