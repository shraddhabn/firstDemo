package com.ojas.businessLogic;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AOPService {

	@Pointcut("execution(public void com.ojas.businessLogic.BusinessLogic.saveEmployee())")
	
	public void p1() {
		
	}
	
	@Before("p1()")
	public void tx() {
	System.out.println("Begin Tx");
	}
	
	@After("p1()")
	public void commit() {
		System.out.println("Tx commited");
	}
	
	@AfterReturning("p1()")
	public void commitAr() {	
		System.out.println("AfterReturning Demo");
	}
	
	@AfterThrowing(value = "p1()", throwing ="th")
	public void commitTH(Throwable th) {
		System.out.println("AfterThrowing Demo" + th.getMessage());
	}
	
	@Around("p1()")
	public void aroundDemo(ProceedingJoinPoint jp) {
		System.out.println("Befour Business method");
		
		try {
			jp.proceed();
			
		}
		catch(Throwable e) {
			e.printStackTrace();
			
		}
		System.out.println("After Business method");
	}
	
}
