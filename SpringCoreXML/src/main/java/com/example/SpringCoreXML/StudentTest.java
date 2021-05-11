package com.example.SpringCoreXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.example.SpringCoreXML.Model.Student;

public class StudentTest {

	public static void main(String[] args) {
	   	
		 ApplicationContext context = new ClassPathXmlApplicationContext("StudentConfig.class"); 
				
		 Student s = (Student)context.getBean("mystudent");
		        System.out.println(s.dispName() );

	}

}
