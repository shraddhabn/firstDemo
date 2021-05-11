package com.example.SpringCoreXML.Model;

public class Address {
	private String hno;
	private String colName;
	private String city;
	public Address(String hno,String colName,String city) {
	this.city = city;
	this.colName = colName;
	this.hno = hno;
	}
	public String toString() {
	return hno + " " + colName + " " + city;
	}
}
