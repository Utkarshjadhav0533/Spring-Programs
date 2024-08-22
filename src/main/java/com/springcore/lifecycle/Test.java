package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Test {

	public static void main(String[] args) {
		
		/*
		 * ApplicationContext context=new ClassPathXmlApplicationContext(
		 * "com/springcore/lifecycle/beanlifecycleconfig.xml"); Samosa samosa1=(Samosa)
		 * context.getBean("Samosa1"); System.out.println(samosa1);
		 */
		
		// you Execute destroy method then you add one method
		// registerShutdownHook()--> and this method present in AbstractApplicationContext
		
		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/beanlifecycleconfig.xml");
		/*
		 * Samosa samosa1=(Samosa) context.getBean("Samosa1");
		 * System.out.println(samosa1);
		 */
		
		/*
		 * Pepsi pepsi1=(Pepsi) context.getBean("Pepsi1"); 
		 * System.out.println(pepsi1); 
		 */
		
		CampBurger campburger1=(CampBurger) context.getBean("CampBurger1"); 
		 System.out.println(campburger1);
		context.registerShutdownHook();
		
	}

}
