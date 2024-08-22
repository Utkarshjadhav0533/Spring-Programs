package com.springcore.standalone.collection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/standalone/collection/standaloneconfig.xml");
		/*
		 * Person person1=context.getBean("Person1", Person.class);
		 * System.out.println(person1);
		 * 
		 * // you find your class name then follows next step
		 * System.out.println(person1.getFriends().getClass().getName());
		 * 
		 * Person person2=context.getBean("Person2", Person.class);
		 * System.out.println(person2);
		 */
		
		/*
		 * Person person3=context.getBean("Person3", Person.class);
		 * System.out.println(person3);
		 */
		
		Person person4=context.getBean("Person4", Person.class);
		  System.out.println(person4);
	}
}
