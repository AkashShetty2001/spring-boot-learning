package com.backend_Development.learn_spring_framework;


import com.backend_Development.learn_spring_framework.game.GameRunner;
import com.backend_Development.learn_spring_framework.game.MarioGame;
import com.backend_Development.learn_spring_framework.game.SuperContraGame;

public class AppGamingBasicJava {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//var game = new MarioGame();
		var game	=new SuperContraGame();
		var gameRunner= new GameRunner(game);
		gameRunner.run();
		
		 

	}

}
