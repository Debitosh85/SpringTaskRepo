package com.nit.enitity;
import org.springframework.stereotype.Component;

@Component
public class Product {
	
	private int id;
	private String name;
	private String category;
	private double price;
	
	public void setId(int id) {
		this.id = id;
	}
	
	public int getId() {
		return id;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCategory( String category) {
		this.category = category;
	}
	
	public String getCategory() {
		return category;
	}
	
	public void setPrice( double price) {
		this.price = price;
	}
	
	public double getPrice() {
		return price;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", name=" + name + ", category=" + category + ", price=" + price + "]";
	}
}
