package com.basics.java;

import java.util.Scanner;

public class SwitchEx1 {
    
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("enter day number :" );
		
		int dayNumber=scanner.nextInt();
		
		System.out.println(isWeekDay(dayNumber));
		
	}
	
	public static String isWeekDay(int dayNumber) {
		
		switch (dayNumber) {
		
		case 0 : return "SUNDAY";
		case 1 : return "MONDAY";
		case 2 : return "TUESDAY";
		case 3 : return "THURSDAY";
		case 4: return "FRIDAY";
		case 5 : return "SATURDAY";
		default: return "INVALID INPUT OF DAY OF WEEK";
		}
	
	 
	}
	
	
}
