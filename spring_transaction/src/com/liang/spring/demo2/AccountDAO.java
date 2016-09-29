package com.liang.spring.demo2;
//转账业务的接口

public interface AccountDAO {
	/**
	 * @param out :转出的账号
	 * @param money ：转出的金额
	 */
	public void outMoney(String out,Double money);
	/**
	 * @param in :转入的账号
	 * @param money ：转入的金额
	 */
	public void inMoney(String in,Double money);
}
