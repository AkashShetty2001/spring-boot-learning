package com.backend_Development.learn_spring_framework;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	
	public static void main(String[] args) {
		
		//1.Lunch a spring context
		var context = 
				new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);
		//System.out.println(context);
		
		//2.configure the things that we want spring to manage -@Configuration.class
		//created a configuration class to manage beans by using spring
		
		//retreving the bean that is managed by the spring..
		System.out.println(context.getBean("name"));
		
		System.out.println(context.getBean("age"));
		
		System.out.println(context.getBean("person"));
		
		//able to retrive the bean which is managed by the spring using the name
		System.out.println(context.getBean("address2"));
		
		//able to retrive the bean which is managed by the spring using the type
				System.out.println(context.getBean(Address.class));
				
		System.out.println(context.getBean("person2MethodCall"));
		
		System.out.println(context.getBean("person3Parameters"));
	}

}
