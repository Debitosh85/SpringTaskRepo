package com.nt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.dao.LayeredIEMPDao;
import com.nt.model.Employee;

@Service
public class LayeredEmpService implements LayeredIEMPService {
	
	@Autowired
	private LayeredIEMPDao dao;

	@Override
	public List<Employee> fetchByDesg(String desg1, String desg2,String desg3)throws Exception {
		
		desg1 = desg1.toUpperCase();
		desg2 = desg2.toUpperCase();
		desg3 = desg3.toUpperCase();
		
		List<Employee> list = dao.showEmployeebyDesg(desg1, desg2, desg3);
		
		list.forEach(emp->{
			emp.setGrossSalary(emp.getSal()+emp.getSal()*0.5);
			emp.setNetSalary(emp.getGrossSalary()-emp.getGrossSalary()*0.2);
		});
		return list;
	}
}
