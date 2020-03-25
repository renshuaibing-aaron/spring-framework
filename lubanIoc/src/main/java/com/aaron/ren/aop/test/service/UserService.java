package com.aaron.ren.aop.test.service;

import com.aaron.ren.aop.test.model.User;


public interface UserService {

    User createUser(String firstName, String lastName, int age);

    User queryUser();
}
