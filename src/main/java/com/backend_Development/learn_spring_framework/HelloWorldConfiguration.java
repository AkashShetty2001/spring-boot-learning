package com.backend_Development.learn_spring_framework;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


record Person(String name, int age,Address address) {};

record Address(String firstLine,String city) {};

@Configuration
public class HelloWorldConfiguration {

	@Bean
	public String name() {
		return "Akash";
	}
	
	@Bean
	public int age() {
		return 23;
	}
	
	@Bean
	public Person person() {
		Person p= new Person("Ravi",22,new Address("chennai","tamilNadu"));
		return p;
		
	}
	
	@Bean(name = "address2")
	public Address address() {
		return new Address("Kodihalli", "Bengaluru");
	}
	
	@Bean
	//i have used an exsisting bean to create another bean using methocall approach.
	public Person person2MethodCall() {
		return new Person(name(),age(),address());
	}
	
	@Bean
	//i have used an exsisting bean to create another bean using parameter approach.
	public Person person3Parameters(String name,int age,Address address) {
		return new Person(name,age,address);
	}
}
