package com.construrctorinjection;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/construrctorinjection/constructorconfig.xml");
		
		 /*Person person1=(Person)context.getBean("Person1"); System.
		 out.println(person1);*/

		 Addition addition1=(Addition)context.getBean("Addition1");
		 System.out.println(addition1);
		 addition1.sum();
	}

}

/*
 * note rule
 * 
 * 1.int,int; ----------> call this constructor (String follows order Which one
 * first) 2.double,double;
 * 
 * 1.double,double; ----------> call this constructor (String follows order
 * Which one first) 2.int,int
 * 
 * 1.int,int; 2.double,double; 3.String,String----------> call this constructor
 * (but that time Spring consider by default String value because we declare all
 * value inside configuration file in " " )
 * 
 * 
 * you solve this amguity Problem simple you mention value Data type in
 * configuration file
 * 
 * <constructor-arg value="20" type="double"></constructor-arg> <constructor-arg
 * value="20" type="double"></constructor-arg>
 */
  
  
  
  
  
  
  