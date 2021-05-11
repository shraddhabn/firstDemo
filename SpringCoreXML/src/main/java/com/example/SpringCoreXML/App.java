package com.example.SpringCoreXML;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.example.SpringCoreXML.Model.Sample;

public class App 
{
    public static void main( String[] args )
    {
    	
 ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
 Sample s = (Sample)context.getBean("sampleObj");
        System.out.println( "Hello World!" );
        
        s.display();    }
}
//my change
