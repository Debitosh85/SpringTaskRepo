package com.nit.spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {
	
	@Bean
	public Course course() {
		return new Course(111,"JavaFullStack",2);
	}
	
	@Bean
	public Student stud() {
		Student stud = new Student();
		stud.setStudentId(344664);
		stud.setStudentName("Maxwell");
		stud.setCourse(course());
		return stud;
	}
	
	@Bean
	public EnrollmentService serv() {
		EnrollmentService service = new EnrollmentService();
		service.setStud(stud());
		return service;
		
	}

}
