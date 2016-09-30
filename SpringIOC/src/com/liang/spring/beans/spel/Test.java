package com.liang.spring.beans.spel;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//∂¡»°≈‰÷√Œƒº˛
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext4.xml");
		Address address=(Address) ctx.getBean("address");
		System.out.println(address);
		Car car=(Car) ctx.getBean("car");
		System.out.println(car);
		Person p=(Person) ctx.getBean("person");
		System.out.println(p);
	}
}
