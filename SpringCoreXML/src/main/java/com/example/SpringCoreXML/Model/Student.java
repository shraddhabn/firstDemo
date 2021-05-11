package com.example.SpringCoreXML.Model;

import org.springframework.stereotype.Component;

@Component
public class Student {

	private String sName;

	public void setsName(String sName) {
		this.sName = sName;
	}
	
	public String dispName() {
		return "Hello" + sName;
	}
}
