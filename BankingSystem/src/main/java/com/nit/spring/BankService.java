package com.nit.spring;

public class BankService {
	
	private Customer cust;

	public void setCust(Customer cust) {
		this.cust = cust;
	}
	
	public void showCustomerAccount() {
		System.out.println("Name of the Customer: "+cust.getName());
		System.out.println("Account Info of the Customer:"+cust.getAccountInfo());
	}

}
