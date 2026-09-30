package com.java.target;

import java.util.Arrays;

import com.java.dependent.IEngine;

public class EngineTarget {
	
	private IEngine engine;
	
	
	public void setEngine(IEngine engine) {
		this.engine = engine;
	}
	
	
	public String mileageAcFuel(int[]mileage,int[]price) {
		
		int totalAmount = 0;
		
		for(int m:price) {
			
			totalAmount+=m;
		}
		
		engine.fuel();
		
		return "price according to mileage:"+Arrays.toString(mileage)+Arrays.toString(price)+"totalAmount"+totalAmount;
	}
}
