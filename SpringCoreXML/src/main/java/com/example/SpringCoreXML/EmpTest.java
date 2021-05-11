package com.example.SpringCoreXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.SpringCoreXML.Model.Employee;


public class EmpTest {

	public static void main(String[] args) {
	  	
		 ApplicationContext context = new ClassPathXmlApplicationContext("empContext.xml"); 
				
		 Employee e = (Employee)context.getBean("empObj");
		        System.out.println( e );
		       
		           }

	}


