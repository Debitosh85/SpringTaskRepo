package com.nit.spring;

public class CreditCardPayment implements PaymentService {
	
	@Override
	public void processPayment(double amount) {
		
		 System.out.println("Processing CreditCardPayment:"+amount);
		
	}
	
	

}
