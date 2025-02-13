package com.backend_Development.learn_spring_framework.terminologies;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.backend_Development.learn_spring_framework.HelloWorld.HelloWorldConfiguration;

public class SpringBean {
	
	public static void main(String[] args) {
		var container=new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//i have spring container/spring context/IOC container refers to same as above
		//the beans which are managed by the spring are said to be spring bean.
	}
	
	

}
