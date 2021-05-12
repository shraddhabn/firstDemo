package com.examle.model;

public class Employee {

	private int empid;
	private String empname;
	private double empsal;
	private String addreess;
	public int getEmpid() {
		return empid;
	}
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public double getEmpsal() {
		return empsal;
	}
	public void setEmpsal(double empsal) {
		this.empsal = empsal;
	}
	public String getAddreess() {
		return addreess;
	}
	public void setAddreess(String addreess) {
		this.addreess = addreess;
	}
	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", empname=" + empname + ", empsal=" + empsal + ", addreess=" + addreess
				+ "]";
	}
	
	
}
