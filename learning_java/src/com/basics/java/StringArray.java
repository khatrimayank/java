package com.basics.java;

public class StringArray {

	public static void main(String[] args) {
		
		StringArray longestDayOfWeek = new StringArray();
		
		System.out.println(longestDayOfWeek.dayOfWeek());
		
	}
		
	public String dayOfWeek() {
		
		int l=0;
		
		String res=null;
		
		String[] days = {"Sunday","Monday","Tuesday","Wednesday","Thursday","Friday","Saturday"};
			
		for(String day:days) {
				
			if (day.length()>l) {
				l=day.length();
				res=day;
			}
				
		}
			
		return res;
			
	}
}

