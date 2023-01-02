package kr.co.ch01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main {
	
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
		
		Hello bean = (Hello) ctx.getBean("hello");
		bean.hello();
		
	}
	
}
