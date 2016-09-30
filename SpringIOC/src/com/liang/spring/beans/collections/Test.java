package com.liang.spring.beans.collections;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		//����Spring ��IOC��������
		//ApplicationContext ���� IOC����
		//ClassPathXmlApplicationContext : �ӿڵ�ʵ����  �����ļ�·�������ļ� 
		ApplicationContext ctx= new ClassPathXmlApplicationContext("applicationContext2.xml");
		//��IOC������beanʵ�� Ҳ���ǻ�ȡ����
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
