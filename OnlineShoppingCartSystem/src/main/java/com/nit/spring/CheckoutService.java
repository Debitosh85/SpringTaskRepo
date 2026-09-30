package com.nit.spring;

public class CheckoutService {
	
	Cart cart;
	double discountRate;
	
	public CheckoutService(Cart cart, double discountRate) {
		this.cart = cart;
		this.discountRate = discountRate;
	}
	
	public double applyDiscount() {
		return cart.calculateCartTotal() * (discountRate/100);
	}
	
	public void  printFinalBill() {
		
		cart.displayCartDetails();
		double discount = applyDiscount();
		double finalAmount = cart.calculateCartTotal() - discount;
		System.out.println("Discount Applied:"+discount+"%");
		System.out.println("Final Amount ₹"+finalAmount);
		
		
	}

}
