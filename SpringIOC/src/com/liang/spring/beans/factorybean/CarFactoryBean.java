package com.liang.spring.beans.factorybean;

import org.springframework.beans.factory.FactoryBean;

public class CarFactoryBean implements FactoryBean<Car>{

	//����bean����
	public Car getObject() throws Exception {
		// TODO Auto-generated method stub
		return new Car("BMW",5000.0,300.0);
	}
	//����bean������
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Car.class;
	}

	public boolean isSingleton() {
		// TODO Auto-generated method stub
		return true;
	}

}
