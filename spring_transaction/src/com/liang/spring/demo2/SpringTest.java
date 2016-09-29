
package com.liang.spring.demo2;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:applicationContext2.xml")
                                
public class SpringTest {
	
	//测试业务层类：
/*	@Resource(name="accountService")
	private AccountService accountService;*/
	//注入代理类 因为他是增强的操作
	@Resource(name="accountServiceProxy")
	private AccountService accountService;
	
	@Test
	public void demo2(){
		accountService.tranfer("aaa", "bbb", 200.0);
	}
}
