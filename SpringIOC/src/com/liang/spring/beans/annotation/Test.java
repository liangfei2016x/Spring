package com.liang.spring.beans.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.liang.spring.beans.annotation.controller.UserController;
import com.liang.spring.beans.annotation.repository.UserRepository;
import com.liang.spring.beans.annotation.service.UserService;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ctx=new ClassPathXmlApplicationContext("applicationContext_annotation.xml");
		//
/*		TestObject to=(TestObject)ctx.getBean("testObject");
		System.out.println(to);*/
		
		UserController uc=(UserController)ctx.getBean("userController");
		System.out.println(uc);
		uc.execute();
		
		
	/*	UserService us=(UserService) ctx.getBean("userService");
		System.out.println(us);
		
		UserRepository ur=(UserRepository)ctx.getBean("userRepository");
		System.out.println(ur);*/
	}

}
