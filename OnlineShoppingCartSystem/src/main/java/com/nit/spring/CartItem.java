package com.nit.spring;


public class CartItem {
	
	
	Product product;
	private int quantity;
	private double totalPrice;
	
	
	public CartItem(Product product,int quantity) {
		this.product = product;
		this.quantity = quantity;
	}
	
	public int getQunatity() {
		return quantity;
	}
	
	public double calculateItemTotal() {
		
		totalPrice = product.getPrice() * quantity;
		
		return totalPrice;
	}
	
	public void displayItem() {
		
		System.out.println(product.getPrice());
		System.out.println(product.getProductId());
		System.out.println(product.getProductName());
	}
	
	
	
	

}
