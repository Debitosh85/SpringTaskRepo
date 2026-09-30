package com.nit.spring;

public class Account {
	
	private long accountNo;
	private String holderName;
	private double balance;
	
	public long getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(long accountNo) {
		this.accountNo = accountNo;
	}
	public String getHolderName() {
		return holderName;
	}
	public void setHolderName(String holderName) {
		this.holderName = holderName;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	
	public  double deposit(double amount) {
		
	   balance+=amount;
		
		return amount;
	}
	
	public double withdraw(double amount) {
		
		if(amount>balance) {
			System.out.println("Insufficient fund");
		}else {
			balance-=amount;
		}
		
		return amount;
		
	}
	
	
}
