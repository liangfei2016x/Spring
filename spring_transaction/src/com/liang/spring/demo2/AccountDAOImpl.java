package com.liang.spring.demo2;

import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Component;

//转账的DAO实现类
//JdbcDaoSupport:注入相应的JDBC模板
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
