package com.nit.spring;

import java.util.List;

public class Customer {
	
	private String name;
	private int customerId;
	private List<BankInfo> account;
	
	public void setAccount(List<BankInfo> account) {
		this.account = account;
	}
	public List<BankInfo> getAccountInfo(){
		return account;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	
	public int getId() {
		return customerId;
	}
	
	@Override
	public String toString() {
		return "Customer[account="+account+"]";
	}

}
