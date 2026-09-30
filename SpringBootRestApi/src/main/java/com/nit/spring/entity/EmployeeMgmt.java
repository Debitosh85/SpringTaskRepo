package com.nit.spring.entity;
import org.springframework.stereotype.Component;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table
public class EmployeeMgmt {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int empId;
	
	@Column
	private String name;
	
	@Column
	private String Address;

	public long getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	@Override
	public String toString() {
		return "EmployeeMgmt [empId=" + empId + ", name=" + name + ", Address=" + Address + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
	
	

}
