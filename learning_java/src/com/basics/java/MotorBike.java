package com.basics.java;

public class MotorBike {

	private int speed;
	
	public void setSpeed(int gati) {
		if (gati>0) {
			this.speed=gati;
		}
	}
	
	public int getSpeed() {
		
		return this.speed;
	}
	
	public void increaseSpeed(int increaseAmount) {
		setSpeed(this.speed+increaseAmount);
		
	}
	
	public void decreaseSpeed(int decreaseAmount) {
		this.setSpeed(this.speed-decreaseAmount);

	}   
}