package com.nit.spring;

public class BankInfo {
	
	private long accountNo;
	private String accountType;
	
	public BankInfo(long accountNo,String accountType) {
		this.accountNo = accountNo;
		this.accountType = accountType;
	}
	
	public long getAccountNo() {
		return accountNo;
	}
	
	public String getAccountType() {
		return accountType;
	}
	
	@Override
	public String toString() {
		return"Bank[accountNo="+accountNo+",accountType="+accountType+"]";
	}
}
