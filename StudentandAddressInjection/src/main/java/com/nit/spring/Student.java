package com.nit.spring;

public class Student {
	
	private String name;
	private Address address;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String gatName() {
		return name;
	}
	
	public void setAddress(Address address) {
		this.address= address;
	}
	
	public void showStudentDetails() {
		System.out.println("My name is ::"+name);
		System.out.println("i am from "+address.getState());
		System.out.println("i belongs to "+address.getCity()+"\t"+"Temple City"+"of"+address.getState());
	}

}
