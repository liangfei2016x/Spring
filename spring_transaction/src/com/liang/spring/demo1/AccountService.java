package com.liang.spring.demo1;
/**
 * ����ӿ�
 * ת�˰�����ҵ��ӿ�
 * @author Administrator
 *
 */
public interface AccountService {
	/**
	 * 
	 * @param out ��ת���˺�
	 * @param in	��ת���˺�
	 * @param money	��ת�˽��
	 */
	public void tranfer(String out,String in,Double money);
}
