package com.basics.java;

public class RunMotorBike {

	public static void main(String[] args) {
		
		MotorBike ducati = new MotorBike();
		
		MotorBike honda = new MotorBike();
		
		ducati.setSpeed(100);
		
		honda.setSpeed(150);
		
		System.out.println(ducati.getSpeed());
		
		System.out.println(honda.getSpeed());
		
		ducati.increaseSpeed(20);
		
		honda.decreaseSpeed(40);
		
		System.out.println(ducati.getSpeed());
		
		System.out.println(honda.getSpeed());
		
		
	}
}
