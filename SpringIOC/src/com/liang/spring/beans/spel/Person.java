package com.liang.spring.beans.spel;

public class Person {
	private String name;
	private int age;
	
	private Car car;
	//����Address Bean��city����
	private String city;
	//����Car��price ȷ�� info:car��price>=3000Ϊ ���� ����Ϊ����
	private String info;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public Car getCar() {
		return car;
	}
	public void setCar(Car car) {
		this.car = car;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getInfo() {
		return info;
	}
	public void setInfo(String info) {
		this.info = info;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", car=" + car
				+ ", city=" + city + ", info=" + info + "]";
	}
	
}
