package com.nit.spring;

import java.util.Set;

public class Company {
	
	Set<String> employee;
	
	public void setEmployee(Set<String> employee) {
		this.employee = employee; 
	}
	
	public void showInformation() {
		System.out.println("They are the Employee:"+employee);
	}

}
