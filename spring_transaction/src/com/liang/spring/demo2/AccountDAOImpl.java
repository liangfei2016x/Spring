package com.liang.spring.demo2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

//ת�˵�DAOʵ����
//JdbcDaoSupport:ע����Ӧ��JDBCģ��
@Component
public class AccountDAOImpl extends JdbcDaoSupport implements AccountDAO {

	public void outMoney(String out, Double money) {
		String sql="update account set money=money-? where name=?";
		this.getJdbcTemplate().update(sql,money,out);

	}

	public void inMoney(String in, Double money) {
		String sql="update account set money=money+? where name=?";
		this.getJdbcTemplate().update(sql,money,in);
	}

}
