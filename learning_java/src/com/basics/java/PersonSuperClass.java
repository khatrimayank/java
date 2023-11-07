package com.basics.java;

public class PersonSuperClass {
	
	private String name;
	
	private String mobileNo;
	
	private String email;
	
	public PersonSuperClass(){
		
	}
	
	public PersonSuperClass(String name,String phone,String gmail) {
		
		this.name=name;
		
		this.mobileNo=phone;
		
		this.email=gmail;
	}

	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}	

	public String getMobileNo() {
		return mobileNo;
	}

	
	public String getEmail() {
		return email;
	}
	
	public String toString() {
		return String.format("Name is %s and mobileNo is %s and email is %s ",name,mobileNo,email);
	}
}

