package com.examle.model;

public class Company {
	private String cNmae;

	public String getcNmae() {
		return cNmae;
	}

	public void setcNmae(String cNmae) {
		this.cNmae = cNmae;
	}

	@Override
	public String toString() {
		return "Company [cNmae=" + cNmae + "]";
	}
	
	
}
