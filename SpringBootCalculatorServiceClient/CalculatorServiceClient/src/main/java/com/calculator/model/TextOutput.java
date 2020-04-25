package com.calculator.model;

import org.springframework.stereotype.Component;

@Component
public class TextOutput {
	String textOutput;

	public TextOutput() {
		super();
	}

	public String getTextOutput() {
		return textOutput;
	}

	public void setTextOutput(String textOutput) {
		this.textOutput = textOutput;
	}

}
