package com.liang.spring.aop.demo1;

import java.util.Arrays;
import java.util.List;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

//�����������Ϊһ������
/**
 * 1.��������뵽IOC���� 
 * 2.����һ������
 * @author Administrator
 *
 */
@Aspect
@Component
public class LoggingAspect {
	//֪ͨ  �е�
	//ǰ��֪ͨ
	@Before("execution(* com.liang.spring.aop.demo1.AtithmeticCalculatorImpl.*(int,int))")
	//֯��� JoinPoint
	public void beforeMethod(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("The "+methodName+" method begins:"+args);
	}
	//����֪ͨ
	@After("execution(* com.liang.spring.aop.demo1.AtithmeticCalculatorImpl.*(int,int))")
	public void afterMethod(JoinPoint joinPoint){
		String methodName=joinPoint.getSignature().getName();
		List<Object> args=Arrays.asList(joinPoint.getArgs());
		System.out.println("The "+methodName+" method end:"+args);		
	}
/*	@Around("execution(* com.liang.spring.aop.demo1.AtithmeticCalculatorImpl.*(int,int))")
	public void afterMethod(ProceedingJoinPoint joinPoint) throws Throwable{
		joinPoint.proceed();
		System.out.println("The method end:");		
	}*/
}
