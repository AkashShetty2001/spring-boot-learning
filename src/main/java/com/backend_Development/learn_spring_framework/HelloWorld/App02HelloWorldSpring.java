package com.backend_Development.learn_spring_framework.HelloWorld;

//import java.util.Arrays;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App02HelloWorldSpring {
	
	public static void main(String[] args) {
		
		
		//try with resource feature
		//1.Lunch a spring context
		try(var context = 
			new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);){
			//System.out.println(context);
			// with in the parenthesis ,
			//   if any exception occurs context.close() is called automatically
			
			//2.configure the things that we want spring to manage -@Configuration.class
			//created a configuration class to manage beans by using spring
			
			//Retrieving the bean that is managed by the spring..
			System.out.println(context.getBean("name"));
			
			System.out.println(context.getBean("age"));
			
			System.out.println(context.getBean("person"));
			
			//able to retrieve the bean which is managed by the spring using the name
			System.out.println(context.getBean("address2"));
			
			//able to retrieve the bean which is managed by the spring using the type
			System.out.println(context.getBean(Address.class));
					
			System.out.println(context.getBean("person2MethodCall"));
			
			System.out.println(context.getBean("person3Parameters"));
			
			// how to know the list of beans that are managed by the spring
//			String a[]=context.getBeanDefinitionNames();
//			for(int i=0;i<a.length;i++) {
//				System.out.println(a[i]);
//			}
			
			
			//we can make use of @Primary in case of multiple bean candidate or @Qualifier
			System.out.println(context.getBean("person4"));
		}
		
		
	}

}
