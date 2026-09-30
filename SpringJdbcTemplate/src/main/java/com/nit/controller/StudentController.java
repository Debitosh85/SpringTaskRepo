package com.nit.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.nit.model.Student;
import com.nit.repository.StudentReposit;

@RestController
public class StudentController {

	@Autowired
	StudentReposit repo;
	
	@PostMapping("/createStudent")
	public String getStudentData(@RequestBody Student stud) {
		
		int insertStudentData = repo.insertStudentDate(stud);
		
		return "Student saved Successfully:"+insertStudentData;
		
	}
}
