package com.nit.sbeans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component("fpkt")
@Lazy(true)
public class Flipkart {
	
	@Autowired 
	@Qualifier("dtdc")
	private IFlip iflip;
	
	
	public String purchase(String[]products,double[]prices) {
		
		double totalAmount =0.0;
		
		int id = new Random().nextInt();
		
		for(double p:prices) {
			
			totalAmount+=p;
		}
		
		iflip.shopping();
		
		return 
				"""
				products are: %s
				prices of the product is: %s
				totalAmount:%d
				shoping id::%d
				
				""".formatted(Arrays.toString(products),
						Arrays.toString(prices),
						Math.round(totalAmount),
						id
				);
	}
}
