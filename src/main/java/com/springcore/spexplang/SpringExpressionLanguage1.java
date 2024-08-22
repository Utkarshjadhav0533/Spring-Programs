package com.springcore.spexplang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/*SpEL - Spring Expression Language
Q)how to invoke static method ,variables and creating object
syntax
method -  T(class).method(param)
variable- T(class).variable 

Q)how to create object
syntax
object- new objectName('value')  value define in single code (' ') do not define in double code (" ")

Boolean type value with SpEL
1.you declare only boolean type variable and not set value then
private boolean isActive;  ---> that time output false .because by default value boolean is false 

2.you declare boolean type variable and set value then
@Value("#{8>2}")
private boolean isActive;-----> that time output true or false depend up on your Expression condition, value...etc
*/


@Component("ob")
public class SpringExpressionLanguage1 {
	
	@Value("#{T(java.lang.Math).sqrt(144)}") // method (Math) it is a predefine method present in java.lang package  
	private int z;
	
	@Value("#{T(java.lang.Math).PI}")  // variable (PI) it is a in java.lang.math class 
	private int p;
	
	@Value("#{new java.lang.String('Utkarsh Jadhav')}") // try create different type of object
	private String name;
	
	@Value("#{8>2}")
	private boolean isActive;

	public int getP() {				
		return p;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setP(int p) {
		this.p = p;
	}

	
	public int getZ() {
		return z;
	}

	public void setZ(int z) {
		this.z = z;
	}

	@Override
	public String toString() {
		return "SpringExpressionLanguage1 [z=" + z + ", p=" + p + ", name=" + name + ", isActive=" + isActive + "]";
	}

	
	
	
}
