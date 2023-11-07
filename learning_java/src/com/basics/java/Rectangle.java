package com.basics.java;

public class Rectangle {
	
	public static void main(String[] args) {
		
		Rectangle obj=new Rectangle (4.0,5.5);
		
		System.out.println("width="+obj.getwidth());
		
		System.out.println("length="+obj.getlength());
		
		System.out.println("area="+obj.area());
		
		System.out.println("perimeter="+obj.perimeter());
		
		obj.print();
	}
	
	private double length;
	private double width;
	
	public  Rectangle(double length,double width) {
		
		this.length=length;
		
		this.width=width;
	}
	
	public void setwidth(int width) {
		this.width=width;
	}
	
	public double getwidth() {
		return width;
	}
	
	public void setlength(int length) {
		this.length=length;
	}
	
	public double getlength() {
		return length;
	}
	
	public double area() {
		return length*width;
	}
	
	public double perimeter() {
		return 2*(length+width);
	}
	
	public void print() {
		System.out.printf("width- %f , length- %f ,area- %f , perimeter- %f",width,length,area(),perimeter());
	}

}
