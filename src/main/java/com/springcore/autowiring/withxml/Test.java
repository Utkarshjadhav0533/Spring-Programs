package com.springcore.autowiring.withxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowiring/withxml/autowireconfig.xml");
	
		//Emp emp1=(Emp) context.getBean("Emp1"); // you Avoid type cast so follows next step
		
		Emp emp1=context.getBean("Emp1",Emp.class );
		System.out.println(emp1);
		
		
		Emp emp2=context.getBean("Emp2",Emp.class );
		System.out.println(emp2);
		
		
	}

}
