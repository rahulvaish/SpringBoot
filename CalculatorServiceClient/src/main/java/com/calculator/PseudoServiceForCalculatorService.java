package com.calculator;

import com.sun.jersey.api.client.Client;
import com.sun.jersey.api.client.ClientResponse;
import com.sun.jersey.api.client.WebResource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class PseudoServiceForCalculatorService {

	public String callService(String firstNumber, String secondNumber, String operationPath) {
		Client client = Client.create();
		// On MAC PC, IP of Container worked for me !
		String calculatorServiceURL="http://192.168.99.100:8080";
		WebResource webResource = client.resource(calculatorServiceURL + operationPath);
		String input = "{\"firstNumber\":\"" + firstNumber + "\",\"secondNumber\":\"" + secondNumber + "\"}";
        
		ClientResponse response = webResource.type("application/json").post(ClientResponse.class, input);
		return response.getEntity(String.class);

	}

}