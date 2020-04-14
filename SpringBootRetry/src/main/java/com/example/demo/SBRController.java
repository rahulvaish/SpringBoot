package com.example.demo;

import org.springframework.retry.annotation.Recover;
import org.springframework.retry.annotation.Retryable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class SBRController {
@RequestMapping(value="/hello", method=RequestMethod.GET)
@Retryable(value= {NullPointerException.class},maxAttempts=5)
public String hello() {
	System.out.print("TRY");
	String s = null;
	System.out.print(s.length());
	return "hello";
}
@Recover
public String recover(NullPointerException npe) {
	return "NullPointerException Recover Method";
}

}
