package com.nit.spring;

import java.util.List;
public class Cart {
	
	List<CartItem> items;
	
	public Cart(List<CartItem>items) {
		this.items = items;
	}
	
	public double calculateCartTotal() {
		
		return items.stream().mapToDouble(CartItem::calculateItemTotal).sum();
	}
	
	public void displayCartDetails() {
		
		System.out.println("Online Shopping");
		for(CartItem stuff:items) {
			stuff.displayItem();
		}
		System.out.println("CartItems ₹"+calculateCartTotal());
	}
}
