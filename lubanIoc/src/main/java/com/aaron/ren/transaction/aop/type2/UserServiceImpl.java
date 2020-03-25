package com.aaron.ren.transaction.aop.type2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserServiceImpl  {
	@Autowired
	private JdbcTemplate jdbcTemplate;



	public void insert(User user) {
		jdbcTemplate.update("insert into user (name) value (?)", user.getName());
		System.out.println(12/0);
	}
}