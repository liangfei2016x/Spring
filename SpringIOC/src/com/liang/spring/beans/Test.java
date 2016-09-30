package com.liang.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//����Spring ��IOC��������
		//ApplicationContext ���� IOC����
		//ClassPathXmlApplicationContext : �ӿڵ�ʵ����  �����ļ�·�������ļ� 
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext.xml");
		//��IOC������beanʵ�� Ҳ���ǻ�ȡ����
		HelloWorld hw=(HelloWorld) ctx.getBean("helloWorld");
		//���÷���
		hw.hello();
		Car car=(Car) ctx.getBean("car");
		System.out.println(car);
		Car car2=(Car) ctx.getBean("car2");
		System.out.println(car2);
		Person p=(Person) ctx.getBean("person");
		System.out.println(p);
		//�ڲ�Bean
		p=(Person) ctx.getBean("person2");
		System.out.println(p);
	}
}
