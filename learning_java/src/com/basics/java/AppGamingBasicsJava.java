package com.basics.java;

public class AppGamingBasicsJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		var supercontra = new SuperContraGame();
		
		var mariogame=new MarioGame();
		
		//var gameRunner = new GameRunner(mariogame);
		
		var gameRunner = new GameRunner(supercontra);
		
		gameRunner.run();

	}

}
