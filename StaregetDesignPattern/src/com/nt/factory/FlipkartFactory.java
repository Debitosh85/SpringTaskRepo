package com.nt.factory;

import com.nt.dependent.Bludedart;
import com.nt.dependent.Dtdc;
import com.nt.dependent.ICourier;
import com.nt.target.Flipkart;

public final class FlipkartFactory {
	
	public static Flipkart getInstance(String type) {
		
		ICourier c = null;
		
		if(type.equalsIgnoreCase("dtdc")) {
			c= new Dtdc();
		}
		else if(type.equalsIgnoreCase("bluedart")) {
			c=new Bludedart();
		}
		else {
			throw new IllegalArgumentException();
		}
		
		Flipkart f = new Flipkart();
		f.setCourier(c);
		return f;
	}
}
