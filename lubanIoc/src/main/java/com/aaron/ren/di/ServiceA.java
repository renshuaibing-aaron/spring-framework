package com.aaron.ren.di;

import org.springframework.beans.factory.annotation.Autowired;

public class ServiceA {


	@Autowired
	private BeanB beanB;

	@Autowired
	private BeanA beanA;
}