package com.nit.spring;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component("hdfcservice")
public class HdfcService implements LoanService {
	
	private long branchCode;
	private double intrestRate;;
	private String managerName;
	
	private final List<String> application = new ArrayList<>();

	@Override
	public void applyLoan(String applicantName,double amount) throws LoanProcessingException {
		if(amount<5000) {
			throw new LoanProcessingException("Minimum 5000 you have to apply for Loan:"+applicantName) ;
		}
		application.add("Hdfc Loan Approved for Applicant:"+applicantName+"amount:"+amount+"IntrestRate:"+intrestRate);
	 	System.out.println("✅ Loan Applied SuccessFully For:"+applicantName);
	}

	@Override
	public void rejectLoan(String applicantName)throws InvalidLoanOperationException {
		boolean removed =application.removeIf(a->a.contains(applicantName));
		if(!removed) {
			throw new InvalidLoanOperationException("No Loan applied for:"+applicantName);
		}
		System.out.println("Hdfc Rejected Loan For:"+applicantName);
	}

	@Override
	public List<String> viewApplication() {
		return application;
	}

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

}
