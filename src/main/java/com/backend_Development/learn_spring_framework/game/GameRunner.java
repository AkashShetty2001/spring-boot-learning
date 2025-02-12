package com.backend_Development.learn_spring_framework.game;

public class GameRunner {
	
   	GamingConsole game;
	
	//constructor 
	public GameRunner(GamingConsole game) {
		this.game=game;
	}
	
	public void run() {
		System.out.println("Running the game: "+ game);
		game.up();
		game.down();
		game.left();
		game.right();
	}
	
	
}
