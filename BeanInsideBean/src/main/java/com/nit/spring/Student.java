package com.nit.spring;

public class Student {

	Address address;
	
	public void  setAddress(Address address) {
		this.address = address;
	}
	
	public void studentBioData() {
		System.out.println("This is Complete Info of"+address);
	}
	
}
