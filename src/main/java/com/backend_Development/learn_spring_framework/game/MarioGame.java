package com.backend_Development.learn_spring_framework.game;

public class MarioGame implements GamingConsole{
	
	public void up() {
		System.out.println("Jump");
	}
	
	public void down() {
		System.out.println("Go into a Hole");
	}
	
	public void left() {
		System.out.println("Go back");
	}
	
	public void right() {
		System.out.println("Go front");
	}

}
