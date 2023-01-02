package kr.co.ch01;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
public class Hello {
	
	@GetMapping("/hello")
	public void hello() {
		System.out.println("Hello Spring!");
	}

}
