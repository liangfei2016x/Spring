package com.liang.spring.demo1;

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
	//ע����������ģ��
	private TransactionTemplate transactionTemplate;	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public void tranfer(final String out,final String in,final Double money) {
		// TODO Auto-generated method stub
		//�����ڲ��� ������������һ��������
		transactionTemplate.execute(new TransactionCallbackWithoutResult() {
			
			@Override
			protected void doInTransactionWithoutResult(TransactionStatus transactionStatus) {
				// TODO Auto-generated method stub
				accountDAO.outMoney(out, money);
				//int i=1/0;
				accountDAO.inMoney(in, money);
			}
		});
	}

}
