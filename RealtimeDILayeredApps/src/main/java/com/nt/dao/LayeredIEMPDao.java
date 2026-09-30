package com.nt.dao;

import java.util.List;

import com.nt.model.Employee;

public interface LayeredIEMPDao {
	
	public List<Employee> showEmployeebyDesg(String desg1,String desg2,String desg3) throws Exception;

}
