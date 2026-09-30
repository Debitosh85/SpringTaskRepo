package com.nit.spring.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.spring.entity.EmployeeMgmt;
import com.nit.spring.service.EmployeeService;

@RestController
@RequestMapping
public class EmployeeController {
	@Autowired
	EmployeeService serv;
	EmployeeMgmt mgmt;
	
	
	@PostMapping("/insert")
	public void saveEmployee() {
		mgmt = new EmployeeMgmt();
		mgmt.setName("Sudhir");
		mgmt.setAddress("BhubaneSwar");
		serv.InsertEmployee(mgmt);
		
		System.out.println("Employee Details Saved :"+mgmt);
		
	}

}
