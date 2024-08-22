package com.springcore.removingxml.useconfig;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/*removing xml file and create connection with class with the help of Annotation
 following steps
 
 1.create simple java class ---> but how will he  know java of which class handle configure 
 .so simple use @Configuration annotation class on the top.
 .at be that time java he will know that class handle configure
 @Configuration
 public class HandleConfigure
 
 2.use @componentscan annotation and pass youe package  
.that time cointaner scan this package .and he will get the bean
@Configuration
@ComponentScan(basePackages = "com.springcore.removingxml.useconfig")
public class HandleConfigure
 
 3.use new class 
 .because we have not use xml file so  that time i am not use ClassPathXmlApplicationContext class
 .but this time we use Annotation based configure so i am use  new one class 
 .and in that we will pass our className .not use " "
 AnnotationConfigApplicationContext(HandleConfigure.class)*/
 
@Component("firststudent")
public class Student {
	
	public void study() {
		
		System.out.println("Student is reading book");
	}
}
