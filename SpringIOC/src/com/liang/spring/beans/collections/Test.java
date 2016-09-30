package com.liang.spring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//创建Spring 的IOC容器对象
		//ApplicationContext 代表 IOC容器
		//ClassPathXmlApplicationContext : 接口的实现类  从类文件路径加载文件 
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext2.xml");
		//从IOC容器中bean实例 也就是获取对象
		//list
		Person p=(Person) ctx.getBean("person");
		System.out.println(p);
		//map
		Person2 p2=(Person2) ctx.getBean("person2");
		System.out.println(p2);
		//util
		Person p3=(Person) ctx.getBean("person3");
		System.out.println(p3);
	}
}
