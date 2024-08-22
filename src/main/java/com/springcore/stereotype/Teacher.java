package com.springcore.stereotype;

import org.springframework.context.annotation.Scope;

@Scope("prototype")
public class Teacher {
	
	private String name;
	private int age;
	
	@Override
	public String toString() {
		return "Teacher [name=" + name + ", age=" + age + "]";
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
}
