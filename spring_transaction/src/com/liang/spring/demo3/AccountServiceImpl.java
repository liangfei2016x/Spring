package com.liang.spring.demo3;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * ת�˰�����ҵ���ʵ��
 * @author Administrator
 *
 */
public class AccountServiceImpl implements AccountService {
	//ע��ת�˵�DAO����
	private AccountDAO accountDAO;
	
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	public void tranfer(final String out,final String in,final Double money) {
		// TODO Auto-generated method stub
		//�����ڲ��� ������������һ��������

				// TODO Auto-generated method stub
				accountDAO.outMoney(out, money);
				int i=1/0;
				accountDAO.inMoney(in, money);

	}

}
