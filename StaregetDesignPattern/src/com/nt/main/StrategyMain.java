package com.nt.main;

import com.nt.factory.FlipkartFactory;
import com.nt.target.Flipkart;

public class StrategyMain {

	public static void main(String[] args) {
		
		//FlipkartFactory f = new FlipkartFactory();
        Flipkart o = FlipkartFactory.getInstance("BlueDart");
        String msg = o.shopping(new String[]{"Clothes","Bike","Mobile"} , new double[]{1000,30000,10000});
		System.out.println(msg);
       
		
	}
}
