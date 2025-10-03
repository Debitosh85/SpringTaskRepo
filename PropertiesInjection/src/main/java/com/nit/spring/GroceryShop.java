package com.nit.spring;

import java.util.Properties;

public class GroceryShop {
	
	Properties groceryItem;
	
	public void setGroceryItem(Properties groceryItem) {
		this.groceryItem = groceryItem;
	}
	
	
	public void ListofGroceryItems() {
		System.out.println("Grocery Items are avilable In the Shop:"+ groceryItem);
	}

}
