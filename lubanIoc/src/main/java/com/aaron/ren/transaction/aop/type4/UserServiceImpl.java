package com.aaron.ren.transaction.aop.type4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public void insert(User user) {
		System.out.println("=======进行事务处理================"+user);
		jdbcTemplate.update("insert into user (name) value (?)", user.getName());

	//System.out.println(12/0);
	}
}