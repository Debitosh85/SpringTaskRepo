package com.nit.spring;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

public final class  LoanApllication {
	

	private LoanService service;
	
	public LoanApllication(LoanService service) {
		this.service = service;
	}
	
	public void apply(String applicantName,double amount)throws LoanProcessingException {
		
		service.applyLoan(applicantName, amount);
	}
	
	public void reject(String applicantName)throws InvalidLoanOperationException {
		service.rejectLoan(applicantName);
	}
	
	public void viewAll() {
		List<String> applicant = service.viewApplication();
		
		if(applicant.isEmpty()) {
			System.out.println("No Apllicants Found");
		}else {
			applicant.forEach(System.out::println);
		}
	}

}
