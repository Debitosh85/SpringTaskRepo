package com.nit.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ProductService {
	
	@Autowired
	Product product;
	
	public ProductService() {
		this.product = product;
	}
	
	public void showDetails() {
		System.out.println("Product Name::"+product.getProductName());
		System.out.println("Product Id::"+product.getProductId());
		System.out.println("Product Price::"+product.getProductPrice());
	}

}
