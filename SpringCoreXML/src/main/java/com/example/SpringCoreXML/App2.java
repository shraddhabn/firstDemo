package com.example.SpringCoreXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.SpringCoreXML.Model.Sample2;

public class App2 {
	public static void main( String[] args )
	{
	ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext2.xml");
	Sample2 s = (Sample2)ac.getBean("sampleObj");
	s.display();
	Sample2 s1 = (Sample2)ac.getBean("sampleObj");
	s1.display();
//	ac.registerShutdownHook();
	}
}
