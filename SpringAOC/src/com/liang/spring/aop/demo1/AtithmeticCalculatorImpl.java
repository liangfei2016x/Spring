package com.liang.spring.aop.demo1;

import org.springframework.stereotype.Component;

@Component
public class AtithmeticCalculatorImpl implements AtithmeticCalculator {

	public int add(int a, int b) {
		int result=a+b;
		return result;
	}

	public int sub(int a, int b) {
		// TODO Auto-generated method stub
		return a-b;
	}

	public int mul(int a, int b) {
		// TODO Auto-generated method stub
		return a*b;
	}

	public int div(int a, int b) {
		// TODO Auto-generated method stub
		int result=a/b;
		return result;
	}

}
