package com.basics.java;

public class RunForLoop {
	
	public static void main(String[] args) {		
		
		ForLoop number = new ForLoop(15);
		
		System.out.println(number.isPrime());
		
		System.out.println(number.sumUpToN());
		
		System.out.println(number.sumOfDivisors());
		
		number.printATriangle();	
	}
}
