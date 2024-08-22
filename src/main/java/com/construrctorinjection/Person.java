package com.construrctorinjection;

public class Person {
	
	private int personId;
	private String name;
	private Certificate certi;
	
	
	public Person(int personId, String name ,Certificate certi){
		
		this.personId=personId;
		this.name=name;
		this.certi=certi;
	}


	@Override
	public String toString() {
		
		return this.personId+" : "+this.name+"{ "+this.certi+" }";
	}


	
}
