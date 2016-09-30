package com.liang.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car>{

	//返回bean对象
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car("BMW",5000.0,300.0);
	}
	//返回bean的类型
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
