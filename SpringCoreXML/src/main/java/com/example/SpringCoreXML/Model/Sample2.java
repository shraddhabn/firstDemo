package com.example.SpringCoreXML.Model;

public class Sample2 {
String name;

public void setName(String name) {
	this.name = name;
}

public Sample2() {
	System.out.println("Default Constructure :");
}

public void display() {
	System.out.println("Welcome to "+ name);
}

public void init() {
	System.out.println("This bean is going through init ");
}

public void destroy() {
	System.out.println("This bean is destroy now  ");
}
}
