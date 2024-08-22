package com.springcore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//implementing bean life-cycle using interface //	
/*
	1.your class implements---->  InitializingBean interface
	2.add unimplements method---> public void afterPropertiesSet() throws Exception
	
	3.implements another interface ------> DisposableBean this interface provied destroy functionality
	4.add unimplements method ------->public void destroy() throws Exception 
*/
public class Pepsi implements InitializingBean, DisposableBean {

	private double price;

	public Pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Pepsi [price=" + price + "]";
	}

	// this method similar As init method
	@Override
	public void afterPropertiesSet() throws Exception {

		System.out.println("Taking Pepsi: init");
	}

	// this method similar As destroy method
	@Override
	public void destroy() throws Exception {
		
		System.out.println("Going to put bottel back to shop: destroy");
	}

}
