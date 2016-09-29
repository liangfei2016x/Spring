package com.liang.spring.demo4;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 转账案例的业务层实现
 * propagation：事务的传播行为
 * isolation:事务的隔离级别
 * readOnly:只读
 * rollbackFor：发生哪些异常回滚
 * noRollbackFor:发生哪些异常不回滚
 */
@Transactional(propagation=Propagation.REQUIRED,isolation=Isolation.DEFAULT)
public class AccountServiceImpl implements AccountService {
	//注入转账的DAO的类
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
