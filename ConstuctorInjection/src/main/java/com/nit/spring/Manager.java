package com.nit.spring;

public class Manager {
	
	Employee emp;
	
	public Manager(Employee emp) {
		this.emp = emp;
	}
	
	public void ShowInfo() {
		System.out.println(emp.getName()+"Hired by Manager & Id of This Emloyee"+emp.getEmpId());
	}
	
	

}
