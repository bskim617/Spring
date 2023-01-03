package kr.co.ch03.advice;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AroundAdvice {
	
	@Pointcut("execution(* kr.co.ch03.AOPService.insert*(..))")
	public void insertPointcut() {}
	
	@Pointcut("execution(* kr.co.ch03.AOPService.delete*(..))")
	public void deletePointcut() {}
	
	@Around("deletePointcut()")
	public void around1(ProceedingJoinPoint pjp) throws Throwable {
	
		System.out.println("횡단관심 - around1 - before");
		pjp.proceed();
		System.out.println("횡단관심 - around1 - after");
	}
	
	@Around("insertPointcut()")
	public void around2(ProceedingJoinPoint pjp) throws Throwable {
	
		System.out.println("횡단관심 - around2 - before");
		pjp.proceed();
		System.out.println("횡단관심 - around2 - after");
	}
}
