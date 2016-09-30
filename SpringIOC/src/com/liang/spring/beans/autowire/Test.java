package com.liang.spring.beans.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//∂¡»°≈‰÷√Œƒº˛
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext3.xml");
		Person p=(Person) ctx.getBean("person");
		System.out.println(p);
		//autowire
		Person p2=(Person) ctx.getBean("person2");
		System.out.println(p2);
	}
}
