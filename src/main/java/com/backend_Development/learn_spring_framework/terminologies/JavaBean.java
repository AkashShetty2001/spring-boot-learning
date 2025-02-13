package com.backend_Development.learn_spring_framework.terminologies;

public class JavaBean {
	public static void main(String[] args) {
		var a= new javaBeanExample();
		
		//any class instance is said to be java bean if it follows these 3 principles
		/*
		 * 1. it should  contain 0 argument constructor
		 * 2.data members of the class should be private
		 * 3. should have setters and getters to access them
		 * 4.it should implement serializable interface
		 */
		
	}
}

class javaBeanExample{
	
	private  int var1;
	private int var2;
	public int getVar1() {
		return var1;
	}
	public void setVar1(int var1) {
		this.var1 = var1;
	}
	public int getVar2() {
		return var2;
	}
	public void setVar2(int var2) {
		this.var2 = var2;
	}
	public javaBeanExample(int var1, int var2) {
		super();
		this.var1 = var1;
		this.var2 = var2;
	}
	public javaBeanExample() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	
}
