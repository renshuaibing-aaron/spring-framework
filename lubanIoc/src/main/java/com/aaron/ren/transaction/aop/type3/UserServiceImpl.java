package com.aaron.ren.transaction.aop.type3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

public class UserServiceImpl  {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public void insert(User user) {
		jdbcTemplate.update("insert into user (name) value (?)", user.getName());
		//System.out.println(12/0);
	}
}