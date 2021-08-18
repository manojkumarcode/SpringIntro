package com.demo.spring.pojo;

public class Department {
	int deptId;
	String depName;
	MyEmployee emp;
	
	public Department() {
		
	}
	

	public Department(int deptId, String depName, MyEmployee emp) {
		super();
		this.deptId = deptId;
		this.depName = depName;
		this.emp = emp;
	}


	public int getDeptId() {
		return deptId;
	}

	public void setDeptId(int deptId) {
		this.deptId = deptId;
	}

	public String getDepName() {
		return depName;
	}

	public void setDepName(String depName) {
		this.depName = depName;
	}

	public MyEmployee getEmp() {
		return emp;
	}

	public void setEmp(MyEmployee emp) {
		this.emp = emp;
	}


	@Override
	public String toString() {
		return "Department [deptId=" + deptId + ", depName=" + depName + ", emp=" + emp + "]";
	}
	
	

}
