package com.liang.spring.demo2;
//ת��ҵ��Ľӿ�

public interface AccountDAO {
	/**
	 * @param out :ת�����˺�
	 * @param money ��ת���Ľ��
	 */
	public void outMoney(String out,Double money);
	/**
	 * @param in :ת����˺�
	 * @param money ��ת��Ľ��
	 */
	public void inMoney(String in,Double money);
}
