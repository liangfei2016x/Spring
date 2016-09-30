package com.liang.spring.beans.factory;

import java.util.HashMap;
import java.util.Map;

/**
 * 静态工厂方法 
 * @author Administrator
 *
 */
public class StaticCarFactory {
	private static Map<String,Car> cars=new HashMap<String, Car>();
	//静态代码块
	static{
		cars.put("audi", new Car("audi","sz",33333.0));
		cars.put("benz", new Car("benz","bj",55555.0));
	}
	//通过名字获取对象 静态工厂方法
	public static Car getCar(String name){
		return cars.get(name);
	}
}
