package com.nit.spring;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.nit.spring")
public class AppConfig {
	
	@Bean("hdfcLoanApp")
	public LoanApllication hdfcLoanApp(@Qualifier("hdfcservice")LoanService hdfcService) {
		return new LoanApllication(hdfcService);
	}
	
	@Bean("iciciLoanApp")
	public LoanApllication iciCiLoanApp(@Qualifier("iciciService")LoanService IciciService) {
		return new LoanApllication(IciciService);
	}
}
