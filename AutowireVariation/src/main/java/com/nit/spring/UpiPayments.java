package com.nit.spring;



public class UpiPayments implements PaymentService {
	
	@Override
	public void processPayment(double amount) {
		
		System.out.println("Processing UPI Payment of:"+amount);
	}

}
