package com.aaron.ren.transaction.programtransaction.newtemplate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionApp {



	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("transaction/transactionnew.xml");
		UserService userService = ac.getBean(UserService.class);
		User user = getUser();
		userService.insert(user);
	}
	private static User getUser() {
		User user = new User();
		user.setName("rsb");
		user.setAge(27);
		return user;
	}
}