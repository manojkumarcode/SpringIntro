package com.demo.spring.pojo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Group {
	
	@Value(value = "300")
	private int groupId;
	
	@Autowired // by default autowiring works with ByType
	@Qualifier(value = "stu")
	private Student student1;
	

	public Group(int groupId, Student student) {
		super();
		this.groupId = groupId;
		this.student1 = student;
	}
	
	

	public Group() {
		super();
		// TODO Auto-generated constructor stub
	}



	public int getGroupId() {
		return groupId;
	}

	public void setGroupId(int groupId) {
		this.groupId = groupId;
	}

	public Student getStudent() {
		return student1;
	}

	public void setStudent(Student student) {
		this.student1 = student;
	}



	@Override
	public String toString() {
		return "Group [groupId=" + groupId + ", student=" + student1 + "]";
	}
	
	

}
