package com.basics.java;

public class WhieLoop {

	private int N;
	
	public WhieLoop (int number) {
		this.N=number;
	}
	
	public void printSquareUpToLimit() {
		int i=1;
		while(i*i<N) {
			System.out.println(i*i);
			i++;
		}
		
	}
	
	public void printCubeUpToLimit() {
		int i=1;
		while(i*i*i<N) {
			System.out.println(i*i*i);
			i++;
		}
		
	}
	
}
