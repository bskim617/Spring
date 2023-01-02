package kr.co.ch02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("ltv")
public class LgTV implements TV {
	
	@Autowired
	private Speaker speaker;
	
	public void powerOn() {
		System.out.println("LgTV powerOn...");
	}
	public void powerOff() {
		System.out.println("LgTV powerOff...");
	}
	
	public void chUp() {
		System.out.println("LgTV chUp...");
	}
	public void chDown() {
		System.out.println("LgTV chDown...");
	}
	
	public void soundUp() {
		speaker.soundUp();
	}
	public void soundDown() {
		speaker.soundDown();
	}
	
}
