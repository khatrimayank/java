package com.basics.java;

import java.util.ArrayList;

public class ArrayListExample {
	
	public static void main(String[] args) {
		
		ArrayListExample students = new ArrayListExample("Mayank",91,92,93,49,90,98,99);
		
		students.printnumbers();
		
		System.out.println(students.getMaxMarks());
		
	}
	
	
	private int numbers;
	
	private String name;
	
	private int[] array;
	
	private ArrayList<Integer> arraylist =new ArrayList<>();
	
	public ArrayListExample(String name , int... numbers) {
		
		this.name=name;
		
		this.array=numbers;
		
		for (int number:numbers) {
			
			arraylist.add(number);
		}
	}
	
	public void printnumbers() {
		
		System.out.print("marks obtained by " + name +" using array : ");
		
		for(int mark:array) {
			System.out.print(mark+" ");
		}
		System.out.println();
		
        System.out.print("marks obtained by " + name +"using arraylist :");
		
		for(int mark:arraylist) {
			System.out.print(mark+" ");
		}
		System.out.println();
	}
	
	public int getMaxMarks() {
		
		int maxNumber=0;
		
		for (int i=0;i<array.length;i++) {
			if(array[i]>maxNumber) {
				maxNumber=array[i];
			}
		}
		return maxNumber;
	}
	
	

}
