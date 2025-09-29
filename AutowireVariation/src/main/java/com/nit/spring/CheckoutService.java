package com.nit.spring;

public class CheckoutService {
	
	PaymentService paymentService;
	
	public void setPaymentService(PaymentService service) {
		this.paymentService = service;
	}
	
	public void paymentServices(double amount) {
		paymentService.processPayment(amount);
	}
	
}
