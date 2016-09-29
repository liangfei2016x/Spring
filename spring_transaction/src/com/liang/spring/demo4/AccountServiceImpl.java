package com.liang.spring.demo4;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * ת�˰�����ҵ���ʵ��
 * propagation������Ĵ�����Ϊ
 * isolation:����ĸ��뼶��
 * readOnly:ֻ��
 * rollbackFor��������Щ�쳣�ع�
 * noRollbackFor:������Щ�쳣���ع�
 */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class AccountServiceImpl implements AccountService {
	//ע��ת�˵�DAO����
	private AccountDAO accountDAO;
	
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}

	public void tranfer(String out,String in,Double money) {
		// TODO Auto-generated method stub

				// TODO Auto-generated method stub
		accountDAO.outMoney(out, money);
		//int i=1/0;
		accountDAO.inMoney(in, money);
	}

}
