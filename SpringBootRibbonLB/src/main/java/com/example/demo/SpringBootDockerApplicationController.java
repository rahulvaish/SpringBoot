package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RibbonClient(name = "micro1")
public class SpringBootDockerApplicationController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome to LB";
	}

	@Autowired
	RestTemplate restTemplate;

	@GetMapping("/getmicro2")
	public String getMicro2Instance() {
		String url = "http://micro1/microserviceController/getPort";
		String port = "Currently hitting instance running on port: " + restTemplate.getForObject(url, String.class);
		return port;
	}
}