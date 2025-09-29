package com.nit.spring;

public class Address {
	
	private String city;
	private String state;
	
	public void setCity(String city) {
		this.city = city;
	}
	public String getCity() {
		return city;
	}
	
	public void setState(String state) {
		this.state = state;
	}
	
	public String getState() {
		return state;
	}
	
	@Override
	public String toString() {
		return "Address[city="+city+",state="+state+"]";
	}

}
