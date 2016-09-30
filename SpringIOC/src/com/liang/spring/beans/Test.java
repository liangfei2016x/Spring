package com.liang.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//创建Spring 的IOC容器对象
		//ApplicationContext 代表 IOC容器
		//ClassPathXmlApplicationContext : 接口的实现类  从类文件路径加载文件 
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		//从IOC容器中bean实例 也就是获取对象
		HelloWorld hw=(HelloWorld) ctx.getBean("helloWorld");
		//调用方法
		hw.hello();
		Car car=(Car) ctx.getBean("car");
		System.out.println(car);
		Car car2=(Car) ctx.getBean("car2");
		System.out.println(car2);
		Person p=(Person) ctx.getBean("person");
		System.out.println(p);
		//内部Bean
		p=(Person) ctx.getBean("person2");
		System.out.println(p);
	}
}
