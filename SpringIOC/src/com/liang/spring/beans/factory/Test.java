package com.liang.spring.beans.factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext_factory.xml");
		Car car=(Car) ctx.getBean("car1");
		System.out.println(car);
		Car car2=(Car) ctx.getBean("car2");
		System.out.println(car2);

	}

}
