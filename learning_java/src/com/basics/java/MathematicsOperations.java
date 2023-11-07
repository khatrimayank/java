package com.basics.java;

public class MathematicsOperations {
	
	private int x1;
	private int x2;
	
	public MathematicsOperations(int x,int y) {
		this.x1=x;
		this.x2=y;
	}
	
	public int addNumbers() {
		return this.x1+this.x2;
	}
	
	public int multiply() {
		return this.x1*this.x2;
	}
	
	public int doubleNumber() {
		return (this.x1*2);
	}
	
	public int get1() {
		return this.x1;
	}
	
	public int get2() {
		return this.x2;
	}
	
}
