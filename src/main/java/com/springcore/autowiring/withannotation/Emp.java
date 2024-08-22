package com.springcore.autowiring.withannotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
									// this annotation by default disable
	//@Autowired 					 //you enable simple add configuration file tag <context:annotation-config/>
	//@Qualifier("address2") // suppose you create multiple bin different names that time use @Qualifier bean and pass your bean name
	private Address address;    
 					
	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}

	public Address getAddress() {
		return address;
	}
	
	@Autowired
	@Qualifier("address1")
	public void setAddress(Address address) {
		this.address = address;
		System.out.println("Setting values");
	}
	
	//@Autowired
	//@Qualifier("address2") ------> disallowed this location
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("set value by using constructor");
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}
}
