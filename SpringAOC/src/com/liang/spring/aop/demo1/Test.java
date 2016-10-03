package com.liang.spring.aop.demo1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext.xml");
		AtithmeticCalculator ac=ctx.getBean(AtithmeticCalculator.class);
		int result=ac.add(1, 2);
		System.out.println(result);
		
		result=ac.div(4, 2);
		System.out.println(result);
	}

}
