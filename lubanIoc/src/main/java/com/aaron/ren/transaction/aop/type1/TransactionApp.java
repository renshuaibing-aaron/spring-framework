package com.aaron.ren.transaction.aop.type1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TransactionApp {



	public static void main(String[] args) {
		ApplicationContext ac = new ClassPathXmlApplicationContext("transaction/transactionaop1.xml");
		UserServiceImpl userServiceImpl = ac.getBean(UserServiceImpl.class);
		User user = getUser();
		userServiceImpl.insert(user);
	}
	private static User getUser() {
		User user = new User();
		user.setName("rsb");
		user.setAge(27);
		return user;
	}
}