package com.liang.spring.demo1;

import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallbackWithoutResult;
import org.springframework.transaction.support.TransactionTemplate;

/**
 * 转账案例的业务层实现
 * @author Administrator
 *
 */
public class AccountServiceImpl implements AccountService {
	//注入转账的DAO的类
	private AccountDAO accountDAO;
	
	public void setAccountDAO(AccountDAO accountDAO) {
		this.accountDAO = accountDAO;
	}
	//注入事务管理的模板
	private TransactionTemplate transactionTemplate;	
	public void setTransactionTemplate(TransactionTemplate transactionTemplate) {
		this.transactionTemplate = transactionTemplate;
	}

	public void tranfer(final String out,final String in,final Double money) {
		// TODO Auto-generated method stub
		//匿名内部类 俩个操作绑定在一个事务上
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
