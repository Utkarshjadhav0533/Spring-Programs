package com.springcore.spexplang;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;


/*SpEL - Spring Expression Language
1.its supports parsing and executing expression with the help of @value annotations
@value("#{expression}")
2.we have use ternory opreator and conditional statement in spel
3.we call static method and static variable and objects with the help of spel*/
	
	
@Component("obj")
public class SpringExpressionLanguage {
	
	@Value("#{27+9}")
	private int x;

	@Value("#{8<6?99:33}")
	private int y;
	
	public int getX() {
		return x;
	}
	public void setX(int x) {
		this.x = x;
	}
	public int getY() {
		return y;
	}
	public void setY(int y) {
		this.y = y;
	}
	@Override
	public String toString() {
		return "SpringExpressionLanguage [x=" + x + ", y=" + y + "]";
	}
}
