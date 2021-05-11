package com.example.SpringCoreXML.Model;

public class Employee {

	private int empID;
	private String empName;
	private double salary;
	public Employee() {
		super();
	}
	
	
	
	public Employee(int empID, String empName, double salary) {
		super();
		this.empID = empID;
		this.empName = empName;
		this.salary = salary;
	}



	@Override
	public String toString() {
		return "Employee [empID=" + empID + ", empName=" + empName + ", salary=" + salary + "]";
	}
	
	
}
