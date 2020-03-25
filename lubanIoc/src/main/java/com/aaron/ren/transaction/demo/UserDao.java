package com.aaron.ren.transaction.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
/*
 CREATE TABLE `t_users` (
   `name` varchar(20) NOT NULL,
   `age` int(5) DEFAULT NULL,
   PRIMARY KEY (`name`)
 ) ENGINE=InnoDB DEFAULT CHARSET=utf8;
 */
@Repository
public class UserDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	public int add(String name, Integer age) {
		String sql = "INSERT INTO t_users(NAME, age) VALUES(?,?);";
		int result = jdbcTemplate.update(sql, name, age);
		System.out.println("插入成功");
		return result;
	}
}