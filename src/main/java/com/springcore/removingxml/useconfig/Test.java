package com.springcore.removingxml.useconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context =new AnnotationConfigApplicationContext(HandleConfigure.class);
		Student student1=context.getBean("firststudent",Student.class);
		System.out.println(student1);
		student1.study();
		}

}
