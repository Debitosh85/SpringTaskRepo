package com.nt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.model.Employee;
import com.nt.service.LayeredIEMPService;

@Controller("ctlr")
public class LayeredController {
	
	
	@Autowired
    private LayeredIEMPService serv;
	
	public List<Employee> processEmployeeBydesg(String desg1,String desg2,String desg3) throws Exception{
		
		List<Employee> list = serv.fetchByDesg(desg1, desg2, desg3);
		
		list.forEach(emp->{
			System.out.println("Emp id:"+emp.getEid());
			System.out.println("EmpName:"+emp.getEName());
			System.out.println("Emp Sal:"+emp.getSal());
			System.out.println("Emp GrossSal:"+emp.getGrossSalary());
			System.out.println("Emp NetSal:"+emp.getNetSalary());	
			
			System.out.println("========================================");
		});
		return list;
	}
}
