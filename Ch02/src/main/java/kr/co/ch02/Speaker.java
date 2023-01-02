package kr.co.ch02;

import org.springframework.stereotype.Component;

// component 빈등록
@Component
public class Speaker {
	
	public void soundUp() {
		System.out.println("Speaker soundUp...");
	}
	public void soundDown() {
		System.out.println("Speaker soundDown...");
	}
	
	
}
