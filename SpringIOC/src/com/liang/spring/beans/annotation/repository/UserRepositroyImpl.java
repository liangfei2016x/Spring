package com.liang.spring.beans.annotation.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.liang.spring.beans.annotation.TestObject;

@Repository("userRepository")
public class UserRepositroyImpl implements UserRepository {
	//过滤没有在Bean中的组件
	@Autowired(required=false)
	private TestObject testObject;

	public void save() {
		// TODO Auto-generated method stub
		System.out.println("UserRepository Save... ");
	}

}
