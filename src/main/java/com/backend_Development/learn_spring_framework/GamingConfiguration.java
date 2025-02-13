package com.backend_Development.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.backend_Development.learn_spring_framework.game.GameRunner;
import com.backend_Development.learn_spring_framework.game.GamingConsole;
import com.backend_Development.learn_spring_framework.game.PacManGame;

@Configuration
public class GamingConfiguration {
	
	@Bean
	public GamingConsole game() {
		var game = new PacManGame();
		return game;
	}
	
	@Bean
	                            //parameter wiring
	public GameRunner gameRunner(GamingConsole game) {
		var gameRunner = new GameRunner(game);
		return gameRunner;
	}

}
