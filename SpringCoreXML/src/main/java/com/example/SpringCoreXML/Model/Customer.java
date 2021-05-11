package com.example.SpringCoreXML.Model;

public class Customer {
	private int cno;
	private String cname;
	private Address address;
	public Customer() {
	}
	public Customer(int cno,String cname,Address address) {
	this.cno = cno;
	this.cname = cname;
	this.address = address;
	}
	public String toString() {
	return cno + " " + cname + " " + address;
	}
}
