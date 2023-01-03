package kr.co.ch03.advice;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterReturnAdvice {
	
	@Pointcut("execution(* kr.co.ch03.AOPService.insert*(..))")
	public void insertPointcut() {}
	
	@Pointcut("execution(* kr.co.ch03.AOPService.select*(..))")
	public void selectPointcut() {}
	
	@Pointcut("execution(* kr.co.ch03.AOPService.update*(..))")
	public void updatePointcut() {}
	
	@AfterReturning("insertPointcut()")
	public void afterReturn1() {
		System.out.println("횡단관심 - afterReturn1...");
	}
	
	@AfterReturning("selectPointcut()")
	public void afterReturn2() {
		System.out.println("횡단관심 - afterReturn2...");
	}
	
	@AfterReturning("updatePointcut()")
	public void afterReturn3() {
		System.out.println("횡단관심 - afterReturn3...");
	}
}
