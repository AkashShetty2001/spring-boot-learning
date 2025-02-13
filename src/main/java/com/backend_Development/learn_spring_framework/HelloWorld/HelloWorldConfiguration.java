package com.backend_Development.learn_spring_framework.HelloWorld;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;


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
	
	
	//when there are multiple bean candidate use primary to fetch one of them
	@Bean(name = "address2")
	@Qualifier("AddressQualifier")
	public Address address() {
		return new Address("Kodihalli", "Bengaluru");
	}
	
	@Bean
	@Primary
	public Address address1() {
		return new Address("mumbai", "navi");
	}
	
	@Bean
	//i have used an existing bean to create another bean using method call approach.
	public Person person2MethodCall() {
		return new Person(name(),age(),address());
	}
	
	@Bean
	//i have used an existing bean to create another bean using parameter approach.
	public Person person3Parameters(String name,int age,Address address) {
		return new Person(name,age,address);
	}
	
	@Bean
	//using@Qualifier
	@Qualifier("PersonQualifier")
	public Person person4(String name,int age,@Qualifier("AddressQualifier")Address address) {
		return new Person("chinmay",age,address);
	}
}
