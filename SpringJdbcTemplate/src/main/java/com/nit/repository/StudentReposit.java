package com.nit.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.nit.model.Student;

@Repository
public class StudentReposit {
	
	@Autowired
	JdbcTemplate template;
	
	public int insertStudentDate(Student std) {
		String sql = "insert into student(city,state) values(?,?)";
		
		return template.update(sql,std.getCity(),std.getState());
	}

}
