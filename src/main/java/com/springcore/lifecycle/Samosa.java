package com.springcore.lifecycle;


					// implementing bean life-cycle using xml  //
public class Samosa {

	private double price;

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
	// create bean life-cycle method but how this method call..?
	// this method call spring ioc automatically
	// you just wanted to say that in configuration file this method call only initilization and this method call only destroy
	// <bean class="com.springcore.lifecycle.Samosa" name="Samosa1" init-method="init" destroy-method="destroy">
	// by default init method call, but where call destroy method..?
	// you simple call registerShutdownHook() method
	
	/*
	 * public void init() {
	 * 
	 * System.out.println("inside init method"); }
	 * 
	 * public void destroy() {
	 * 
	 * System.out.println("inside destroy method "); }
	 */
	
	// you change the name this method

	public void hey() {

		System.out.println("hey how are you");
	}

	public void bye() {

		System.out.println("bye i am going to home ");
	}

}
