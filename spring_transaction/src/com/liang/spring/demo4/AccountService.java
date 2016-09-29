package com.liang.spring.demo4;
/**
 * 定义接口
 * 转账案例的业务接口
 * @author Administrator
 *
 */
public interface AccountService {
	/**
	 * 
	 * @param out ：转出账号
	 * @param in	：转入账号
	 * @param money	：转账金额
	 */
	public void tranfer(String out,String in,Double money);
}
