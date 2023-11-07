package com.basics.java;

import java.util.Scanner;

public class PrintCubeUntilNumberIsPositive {
	
	public static void main(String[] args) {
		
		System.out.print("Enter Number Which Cube Want To Print : ");
		
		Scanner scanner = new Scanner(System.in);
				
		int number=scanner.nextInt();
		
		PrintCubeUntilNumberIsPositive numb =new PrintCubeUntilNumberIsPositive(number);
		
		numb.printCube();
		
		scanner.close();
	
		
	}
	
	private int N;
	
    public PrintCubeUntilNumberIsPositive(int no) {
		
    	this.N=no;
	}
    
    public void printCube() {
    	
    	while (N>=0) {
    		
    		System.out.println("cube is : " + N*N*N);    		
    		
    		System.out.print("Enter Number Which Cube Want To Print : ");
    		
    		Scanner scanner = new Scanner(System.in);
			
    		this.N = scanner.nextInt();
    		

    
    	}
    	
    	System.out.println("you entered no<0");
 
    }
        
}

