package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.examle.model.Address;
import com.examle.model.Company;
import com.examle.model.Employee;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context =new  ClassPathXmlApplicationContext("MyBean.xml");
    	Employee emp=(Employee)context.getBean("EmpObj");
    	
        System.out.println( "Employee Model!" );
        System.out.println( emp );
        
        
        ApplicationContext context1 =new  ClassPathXmlApplicationContext("MyBean.xml");
        Address add=(Address)context.getBean("AddressObj");
    	
        System.out.println( "Address Model!" );
        System.out.println( add );
        
        ApplicationContext context2 =new  ClassPathXmlApplicationContext("MyBean.xml");
        Company comp=(Company)context.getBean("CompanyObj");
    	
        System.out.println( "Company Model!" );
        System.out.println(comp);
    }
}
