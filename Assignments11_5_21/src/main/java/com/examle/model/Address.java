package com.examle.model;

public class Address {

	private int hno;
	private String colony;
	private String area;
	public int getHno() {
		return hno;
	}
	public void setHno(int hno) {
		this.hno = hno;
	}
	public String getColony() {
		return colony;
	}
	public void setColony(String colony) {
		this.colony = colony;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	@Override
	public String toString() {
		return "Address [hno=" + hno + ", colony=" + colony + ", area=" + area + "]";
	}
	
	
}
