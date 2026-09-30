package com.nit.spring;

import org.springframework.stereotype.Component;


public final class LoanProcessingException extends Exception {
	
	public LoanProcessingException(String message) {
		super(message);
	}

}
