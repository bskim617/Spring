package kr.co.ch03;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

/*
 *  날짜 : 2023/01/03
 *  이름 : 김보성
 *  내용 : 스프링 AOP 실습하기
 */

public class AOPmain {
	public static void main(String[] args) {
		
		ApplicationContext ctx = new GenericXmlApplicationContext("application.xml");
		
		AOPService service = (AOPService)ctx.getBean("AOPService");
		
		System.out.println("====================");
		service.insert();
		
		System.out.println("====================");
		service.select();
		
		System.out.println("====================");
		service.update();
		
		System.out.println("====================");
		service.delete();
		
	}
}
