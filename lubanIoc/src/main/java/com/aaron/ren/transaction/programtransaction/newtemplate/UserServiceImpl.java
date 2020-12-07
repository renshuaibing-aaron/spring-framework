package com.aaron.ren.transaction.programtransaction.newtemplate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import javax.annotation.Resource;

@Service
public class UserServiceImpl implements UserService {
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Resource
	TransactionTemplate transactionTemplate;

	@Override
	public void insert(User user) {
		transactionTemplate.execute(new TransactionCallback() {

			@Override
			public Object doInTransaction(TransactionStatus transactionStatus) {

				jdbcTemplate.update("insert into user (name) value (?)", user.getName());
				System.out.println(12/0);
				//transactionStatus.setRollbackOnly();
				return null;
			}
		});
	}
}