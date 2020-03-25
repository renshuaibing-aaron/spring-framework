package com.aaron.ren.transaction.aop.type1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;

public class UserServiceImpl  {
	@Autowired
	private JdbcTemplate jdbcTemplate;



	public void insert(User user) {
		jdbcTemplate.update("insert into user (name) value (?)", user.getName());
		System.out.println(12/0);
	}
}