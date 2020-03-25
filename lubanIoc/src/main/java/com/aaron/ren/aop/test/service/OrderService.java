package com.aaron.ren.aop.test.service;

import com.aaron.ren.aop.test.model.Order;


public interface OrderService {

    Order createOrder(String username, String product);

    Order queryOrder(String username);
}
