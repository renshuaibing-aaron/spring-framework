package com.aaron.ren.aop.aopproblem;

import org.springframework.aop.framework.AopContext;
import org.springframework.beans.factory.annotation.Autowired;


//注意这个地方并不是jdk 动态代理的锅
public class UserDaoImpl implements UserDao {
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	private  UserDao userDao;
	@Override
	public void addUser() {
		userDao.deleteUser();
		System.out.println("add user ");
	}

	@Override
	public void deleteUser() {
		((UserDao) AopContext.currentProxy()).addUser();
		System.out.println("delete user ");
	}

	/**
	 * todo
	 *   为了解决spring aop中调用自身方法 代理失效的问题
	 *   这里有两个解决办法
	 *   1.使用注入自身的依赖保证
	 *   2.使用((UserDao) AopContext.currentProxy()).addUser();  这个地方本质是使用了threadlocal原理
	 */

}