package com.nt.model;

import lombok.Data;

@Data
public class Employee {
	
	private Integer eid;
	private String eName;
	private Double sal;
	private String job;
	private Double grossSalary;
	private Double netSalary;
}
