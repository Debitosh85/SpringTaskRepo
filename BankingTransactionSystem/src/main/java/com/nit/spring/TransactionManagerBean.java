package com.nit.spring;

public class TransactionManagerBean {
	
	private Account acc;
	private IntrestCalculator calc;
	public Account getAcc() {
		return acc;
	}
	public void setAcc(Account acc) {
		this.acc = acc;
	}
	public IntrestCalculator getCalc() {
		return calc;
	}
	public void setCalc(IntrestCalculator calc) {
		this.calc = calc;
	}
	
	public void performDeposit(double amount) {
		
		double deposit = acc.deposit(amount);
		System.out.println("Deposited:"+deposit);
	}
	
	public void performithdraw(double amount) {
		
		double withdraw = acc.withdraw(amount);
		System.out.println("Withdraw:"+withdraw);
	}
	
	public void showFinalBalance() {
		
		double intrest = calc.calculateIntrest(acc.getBalance());
		
		System.out.println("Intrest added:"+intrest);
		System.out.println("Final Balance:"+(acc.getBalance()+intrest));
	}

	public void showAccountHolderDetails() {
		
		System.out.println("Account Holder Name::"+acc.getHolderName());
	}
}
