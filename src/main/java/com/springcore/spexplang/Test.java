package com.springcore.spexplang;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/spexplang/expressionlanguageconfig.xml");
		SpringExpressionLanguage spel=context.getBean("obj" ,SpringExpressionLanguage.class);
		System.out.println(spel);
		
		SpringExpressionLanguage1 spel1=context.getBean("ob" ,SpringExpressionLanguage1.class);
		System.out.println(spel1);
	}

}
