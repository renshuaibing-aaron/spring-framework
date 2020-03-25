package com.aaron.ren.transaction.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class UserService {

	@Autowired
	private UserDao userDao;

	// 加上事务注解
	@MyAnnotation
	public void add() {
		userDao.add("test001", 20);
		int i = 1 / 0;
		userDao.add("test002", 21);
		//        // 如果非要try,那么出现异常不会被aop的异常通知监测到,必须手动在catch里面回滚事务。
		//        try {
		//            userDao.add("test001", 20);
		//            int i = 1 / 0;
		//            userDao.add("test002", 21);
		//        } catch (Exception e) {
		//            // 回滚当前事务
		//            System.out.println("回滚");
		//            TransactionAspectSupport.currentTransactionStatus().setRollbackOnly();
		//        }
	}

	public void del() {
		System.out.println("del...");
	}
}