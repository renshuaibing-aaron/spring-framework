package com.aaron.ren.aop.test.service.imple;

import com.aaron.ren.aop.test.model.User;
import com.aaron.ren.aop.test.service.UserService;


public class UserServiceImpl implements UserService {

    @Override
    public User createUser(String firstName, String lastName, int age) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setAge(age);
        return user;
    }

    @Override
    public User queryUser() {
        User user = new User();
        user.setFirstName("test");
        user.setLastName("test");
        user.setAge(20);
        return user;
    }
}
