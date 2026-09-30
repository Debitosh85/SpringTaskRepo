package com.nit.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nit.spring.entity.EmployeeMgmt;
import com.nit.spring.repo.EmployeeRepoSitory;

@Component
public class EmployeeService {
	
	@Autowired
	EmployeeRepoSitory repo;
	
	public void InsertEmployee(EmployeeMgmt mgt) {
		repo.save(mgt);
	}

}
