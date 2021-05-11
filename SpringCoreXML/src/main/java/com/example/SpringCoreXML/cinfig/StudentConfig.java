package com.example.SpringCoreXML.cinfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.SpringCoreXML.Model.Student;

@Configuration
public class StudentConfig {

	@Bean(value="mystudent")
	public Student createStudent() {
		Student s  = new Student();
		s.setsName("Shraddha");
		return s;
		
	}
}
