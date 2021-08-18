package com.demo.spring.main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.demo.spring.pojo.Department;
import com.demo.spring.pojo.Group;
import com.demo.spring.pojo.MyEmployee;
import com.demo.spring.pojo.Student;

public class TestMyEmployee {

	public static void main(String[] args) {

       ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
       
       System.out.println("Container has been initialized");
//       
//       MyEmployee myEmployee = (MyEmployee) context.getBean("emp_const");
//       System.out.println("Initial Object Value:" + myEmployee);
//       
//       myEmployee.setEmpName("new Name");
//       System.out.println("changed Value:" + myEmployee);
//       
//       MyEmployee m_new = (MyEmployee) context.getBean("emp_const");
//       System.out.println("On 2nd request:" + m_new);
       
     Department dept = (Department) context.getBean("dept");
     System.out.println("dept:" + dept);   
     
     
     System.out.println("dept.getEmp():" + dept.getEmp());  
     
     Student student = (Student) context.getBean("student");
     System.out.println(student);
     
     Group group = (Group) context.getBean("group");
     System.out.println(group);

	}

}
