package com.springcore.autowiring.withannotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/autowiring/withannotation/autowireingconfig.xml");
	
		//Emp emp1=(Emp) context.getBean("Emp1"); // you Avoid type cast so follows next step
		
		Emp emp1=context.getBean("Emp1",Emp.class);
		System.out.println(emp1);
	}

}
