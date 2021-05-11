package com.example.SpringCoreXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.SpringCoreXML.Model.Customer;

public class CustTest {
	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("customeraddress.xml");
		Customer s = (Customer)ac.getBean("custObj");
		System.out.println(s);
		}

}
