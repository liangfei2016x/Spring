package com.liang.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * ��̬�������� 
 * @author Administrator
 *
 */
public class StaticCarFactory {
	private static Map<String,Car> cars=new HashMap<String, Car>();
	//��̬�����
	static{
		cars.put("audi", new Car("audi","sz",33333.0));
		cars.put("benz", new Car("benz","bj",55555.0));
	}
	//ͨ�����ֻ�ȡ���� ��̬��������
	public static Car getCar(String name){
		return cars.get(name);
	}
}
