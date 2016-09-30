package com.liang.spring.beans.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext_factorybean.xml");
		Car car=(Car) ctx.getBean("car");
		System.out.println(car);
	}

}
