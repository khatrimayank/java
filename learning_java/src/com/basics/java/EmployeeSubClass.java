package com.basics.java;

import java.math.BigDecimal;

public class EmployeeSubClass extends PersonSuperClass {
	
	private String title;
	
	private String employerName;
	
	private char employeeGrade;
	
	private BigDecimal salary;
	
	public EmployeeSubClass() {
		super("a","b","c");
	}
	
   
	
	public void setTitle(String title) {
		this.title=title;
	}
	
	public String getTitle() {
		return  title;
	}
    
	public void setEmployerName(String employerName) {
		
		this.employerName=employerName;
		
	}
	
	public String getEmployerName() {
		return  employerName;
	}
	
    public void setEmployeeGrade(char grade) {
		this.employeeGrade=grade;
	}
	
	public char getEmployerGrade() {
		return employeeGrade;
	}
	
    public void setSalary(BigDecimal salary) {
		
    	this.salary=salary;
	}
	
	public BigDecimal getSalary() {
		return salary;
	}
	
	
	public String toString() {
	
		String res=super.toString();
		return res+String.format ("Title is %s , EmployerName is %s , EmployeeGrade is %c , Salary is %s",title,employerName,employeeGrade,salary);
	
	
	}
}
