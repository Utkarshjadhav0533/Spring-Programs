package com.construrctorinjection;

public class Certificate {
	
	private String name;

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return this.name;
	}

	public Certificate(String name) {
		super();
		this.name = name;
	}
}
