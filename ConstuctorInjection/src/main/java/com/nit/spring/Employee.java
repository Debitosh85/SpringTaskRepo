package com.nit.spring;

public class Employee {
	
    private String name;
	private int empId;
	
	public Employee(String name,int empId) {
		this.name = name;
		this.empId = empId;
		System.out.println("Constructor Injection Through xml ");
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public int getEmpId() {
		return empId;
	}

}
