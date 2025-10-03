package com.nit.spring;

public class Address {
	
	private String state;
	private String city;
	
	public void setState(String state) {
		this.state = state;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	@Override
	public String toString() {
		return "Address[state="+state+"City="+city+"]";
	}

}
