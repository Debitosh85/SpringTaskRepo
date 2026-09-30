package com.nt.target;

import java.util.Arrays;
import java.util.Random;

import com.nt.dependent.ICourier;

public final class Flipkart {
	
	private ICourier courier;
	
	public void setCourier(ICourier c) {
		this.courier = c;
	}
	
	public  String shopping(String item[],double prices[]) {
		
		double totalAmount = 0.0;
		
		for(double p:prices) {
			totalAmount+=p;
		}
		
		int oid = new Random().nextInt(30000);
		courier.deliver(oid);
		
		return "item are"+Arrays.toString(item)+"Price of the items:"+Arrays.toString(prices)+"totalAmount is:"+totalAmount+"OrderId:"+oid;
	}
}
