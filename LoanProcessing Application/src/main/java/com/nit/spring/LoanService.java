package com.nit.spring;

import java.util.List;

public interface LoanService {
	
	public void applyLoan(String applicantName,double amount) throws LoanProcessingException;
	public void rejectLoan( String applicantName)throws InvalidLoanOperationException;
	List<String> viewApplication();

}
