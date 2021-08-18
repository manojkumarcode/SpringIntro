package com.demo.spring.pojo;

public class MyEmployee {
	private int empId;
	private String empName;
	public MyEmployee(int empId, String empName) {
		super();
		System.out.println("Parameterized constructor");
		this.empId = empId;
		this.empName = empName;
	}
	public MyEmployee() {
		super();
		System.out.println("Default constructor");
	}
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	@Override
	public String toString() {
		return "MyEmployee [empId=" + empId + ", empName=" + empName + "]";
	}
	
	

}
