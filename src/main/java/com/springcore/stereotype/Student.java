package com.springcore.stereotype;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

                   //it is a stereotype annotation
@Component("ob")	// you change your Object variable  name  by default is same as your class name (student) small case but you change
@Scope("prototype")
public class Student {
	@Value("Rajput")
	private String studentName;
	@Value("Rajasthan")
	private String city;
	@Value("#{area}")
	private List<String> address;
	
	
	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", address=" + address + "]";
	}
	public List<String> getAddress() {
		return address;
	}
	public void setAddress(List<String> address) {
		this.address = address;
	}
	public String getStudentName() {
		return studentName;
	}
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	
}
