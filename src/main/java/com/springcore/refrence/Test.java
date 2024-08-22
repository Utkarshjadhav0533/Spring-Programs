package com.springcore.refrence;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;


				//Property inject reference types//

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/refrence/refrenceconfig.xml");
		A a=(A) context.getBean("refA");
		System.out.println(a.getX());
		
		System.out.println(a.getObj().getY());

	}

}
