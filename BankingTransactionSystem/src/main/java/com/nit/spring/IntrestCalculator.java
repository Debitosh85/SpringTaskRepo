package com.nit.spring;

public class IntrestCalculator {
	
	private double rate;
	
	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double calculateIntrest(double balance) {
		
		return (balance*rate)/100;
	}

}
