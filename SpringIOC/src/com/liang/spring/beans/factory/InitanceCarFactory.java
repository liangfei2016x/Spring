package com.liang.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;
//ʵ����������
//�ȴ����������� �ڴ�������ʵ��
public class InitanceCarFactory {
	
	private Map<String,Car> cars;
	
	public InitanceCarFactory(){
		cars=new HashMap<String, Car>();
		cars.put("Audi", new Car("audi","beijin",12345.7));
		cars.put("Benz", new Car("benz","shenzhen",12345.8));
	}
	public Car getCar(String name){
		return cars.get(name);
	}
}
