package com.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */

 			// Property injection with the help of setter injection and p schema //

public class App {
	public static void main(String[] args) {
		System.out.println("Hello World!");

		ApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
		/*
		 * Student student1 = (Student) context.getBean("Student1"); 
		 * Student student2 = (Student) context.getBean("Student2"); 
		 * Student student3 = (Student) context.getBean("Student3");
		 */
		Student student4 = (Student) context.getBean("Student4");
		Student student5 = (Student) context.getBean("Student5");
		
		/*
		 * System.out.println(student1); System.out.println(student2);
		 * System.out.println(student3);
		 */
		System.out.println(student4);
		System.out.println(student5);
		
		
	}
}
