package com.basics.java;

import java.math.BigDecimal;

public class Inhertance {

	public static void main(String[] args) {

		
		PersonSuperClass person=new PersonSuperClass("Mayank","9414567469","modimayank7@gmail.com");
		
		System.out.println(person.toString());
		
		EmployeeSubClass employee= new EmployeeSubClass();
		
		employee.setTitle("SDE");
		
		employee.setEmployerName("DentalStack");
		
		employee.setEmployeeGrade('A');
		
		BigDecimal salary=new BigDecimal(500000);
		
		employee.setSalary(salary);
		
		
		
		System.out.println(employee.toString());		
		
		
	}

}
