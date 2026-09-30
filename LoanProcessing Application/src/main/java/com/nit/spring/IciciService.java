package com.nit.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("iciciService")
public final class IciciService implements LoanService {
	
	private long branchCode;
	private double intrestRate;;
	private String managerName;
	
	private List<String> application = new ArrayList<>();

	public long getBranchCode() {
		return branchCode;
	}

	public void setBranchCode(long branchCode) {
		this.branchCode = branchCode;
	}

	public double getIntrestRate() {
		return intrestRate;
	}

	public void setIntrestRate(double intrestRate) {
		this.intrestRate = intrestRate;
	}

	public String getManagerName() {
		return managerName;
	}

	public void setManagerName(String managerName) {
		this.managerName = managerName;
	}

	@Override
	public void applyLoan(String applicantName,double amount)throws LoanProcessingException {
		if(amount <=0) {
			throw new  LoanProcessingException("Invalid Loan Amount for:"+applicantName);
		}
		application.add("Loan is approved for :"+applicantName+"Amount:"+amount+"IntrestRate:"+intrestRate);
		System.out.println("✅Icici Loan approved Successfully:"+applicantName);
	}

	@Override
	public void rejectLoan(String applicantName)throws InvalidLoanOperationException {
		boolean removed = application.removeIf(a->a.contains(applicantName));
		if(!removed) {
			throw  new InvalidLoanOperationException("No Loan applied For:"+applicantName);
		}
		System.out.println("❌Icici Rejected the Loan for:"+applicantName);
	}

	@Override
	public List<String> viewApplication() {
		
		return application;
	}

}
