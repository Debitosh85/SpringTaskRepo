package com.nit.spring.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.nit.spring.entity.EmployeeMgmt;

@Repository
public interface EmployeeRepoSitory extends JpaRepository<EmployeeMgmt,Integer>{

}
