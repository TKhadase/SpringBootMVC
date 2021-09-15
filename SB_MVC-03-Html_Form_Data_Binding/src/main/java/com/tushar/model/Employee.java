package com.tushar.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee implements Serializable {
	
	private String fname;
	private String mname;
	private String lname;
	private String addrs;
	private String mobile;
	
	
	@Override
	public String toString() {
		return "Employee [fname=" + fname + ", mname=" + mname + ", lname=" + lname + ", addrs=" + addrs + ", mobile="
				+ mobile + "]";
	}
	
	

}

