package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	private static Object continer;

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext(
				"com/springcore/stereotype/stereotypeconfig.xml");
		/*
		 * Student student=context.getBean("student", Student.class); // "student" must
		 * be small case System.out.println(student);
		 */

		// you change your bean variable name
		// simple declare your bean variable inside @component("ob") annotation
		Student student = context.getBean("ob", Student.class);
		System.out.println(student);
		System.out.println(student.getAddress().getClass().getName());

		/*
		 * bean Scope 1.singeltone -spring continer by default provied singtone means
		 * only one single obj will be created spring cointaner and provided to every
		 * time
		 * 
		 * Q) but how to cheak -create two diff obj same class and cheak this obj
		 * hashcode (both are same)
		 */

		Student student3 = context.getBean("ob", Student.class); // 558187323
		System.out.println(student3.hashCode());

		Student student4 = context.getBean("ob", Student.class); // 558187323
		System.out.println(student4.hashCode());

		/*
		 * 2.prototype - it means every time spring cointaner created different copy but
		 * spring cointaner not provied by default prototype Scope
		 * 
		 * Q) how to way Configure prototype bean scope in spring 1.xml 2.Annotation
		 * 
		 * 1.xml create bean in configure file and declare your bean scope type <bean
		 * class="com.springcore.stereotype.Teacher" name="Teacher1" scope="prototype">
		 */

		Teacher teacher1 = context.getBean("Teacher1", Teacher.class); // 2032188048
		System.out.println(teacher1.hashCode());

		Teacher teacher2 = context.getBean("Teacher1", Teacher.class); // 112466394
		System.out.println(teacher2.hashCode());
		
		/*
		 * 2.annotation go to our class and use @scope("prototype") annotation in class
		 * on the top (this time i am used student class)
		 * @Scope("prototype") 
		 * public class Student
		 */
		Student student5 = context.getBean("ob", Student.class); // 937773018
		System.out.println(student5.hashCode());

		Student student6 = context.getBean("ob", Student.class); // 1790421142
		System.out.println(student6.hashCode());
		
	}

}
