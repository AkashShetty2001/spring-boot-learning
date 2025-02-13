package com.backend_Development.learn_spring_framework;


import com.backend_Development.learn_spring_framework.game.GameRunner;
import com.backend_Development.learn_spring_framework.game.MarioGame;
import com.backend_Development.learn_spring_framework.game.SuperContraGame;
import com.backend_Development.learn_spring_framework.game.PacManGame;

public class AppGamingBasicJava {
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//var game = new MarioGame();
		//var game	=new SuperContraGame();
		 var game=new PacManGame();
		var gameRunner= new GameRunner(game);
		gameRunner.run();
		
		 

	}

}
