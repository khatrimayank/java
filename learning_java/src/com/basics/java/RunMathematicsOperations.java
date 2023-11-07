package com.basics.java;

public class RunMathematicsOperations {
	
	public static void main(String[] args) {
		
		MathematicsOperations Binumber = new MathematicsOperations(9,3);
		
		System.out.println(Binumber.addNumbers());
		System.out.println(Binumber.multiply());
		System.out.println(Binumber.doubleNumber());
		System.out.println(Binumber.get1());
	}

}
