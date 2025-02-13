package com.backend_Development.learn_spring_framework;


import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend_Development.learn_spring_framework.game.GameRunner;
import com.backend_Development.learn_spring_framework.game.GamingConsole;


public class App03GamingUsingSpring {
	

	public static void main(String[] args) {

		
		try(var context = 
			       new AnnotationConfigApplicationContext(GamingConfiguration.class);){
			
			// i have use the type of the bean
			context.getBean(GamingConsole.class).up();
			
			context.getBean(GameRunner.class).run();
			
		}
		
		 

	}

}
