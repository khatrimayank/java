package com.basics.java;

public class ForLoop {
	
	int N;
	
	public ForLoop(int number) {
		this.N=number;
	}
	
	public boolean isPrime() {
		
		if (N<0) {
			return false;
		}
		for(int i=2;i<N;i++) {
			if(N%i==0) {
				return false;
	        }
			
		}	return true;

	}
	
	public int sumUpToN() {
		
		int sum=0;
		
		for(int i=1;i<=N;i++) {
			
			sum+=i;
		}
		
		return sum;
	}
	
	public int sumOfDivisors() {
		
		int sum=0;
		
		for (int i=2;i<N;i++) {
			if(N%i==0) {
				sum+=i;
			}
		}
		return sum;
	} 
    
	public void printATriangle() {
		
		for (int i=1;i<=N;i++) {
			for (int j=1;j<=i;j++) {
				System.out.print(j + "  ");
			}
			System.out.print("\n");
		}
	}
}