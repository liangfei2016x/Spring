package com.liang.spring.demo2;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * ת�˰�����ҵ���ʵ��
 * 
 * @author Administrator
 * 
 */
public class AccountServiceImpl implements AccountService {
	// ע��ת�˵�DAO����
	private AccountDAO accountDAO;

	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	public void tranfer(String out,String in,Double money) {
		// TODO Auto-generated method stub
		accountDAO.outMoney(out, money);
		accountDAO.inMoney(in, money);
	}

}
