package com.springcore.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//implementing bean life-cycle using Annotation //
// use 2 annotation and use in method

// 1.@PostConstruct  ----> same as init work 
// 2.@PreDestroy --------> same as destroy work

// you run program but not output because by default all annotation disabeld 
// you all annotation ennable then go your config file and add one tag
// <context:annotation-config/>

public class CampBurger {
	 private double Price;

	public CampBurger() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return Price;
	}

	public void setPrice(double price) {
		Price = price;
	}

	@Override
	public String toString() {
		return "CampBurger [Price=" + Price + "]";
	}
	
	@PostConstruct
	public void start() {
		
		System.out.println("Start method");
	}
	
	@PreDestroy
	public void end() {
		
		System.out.println("End method");
	}
}
