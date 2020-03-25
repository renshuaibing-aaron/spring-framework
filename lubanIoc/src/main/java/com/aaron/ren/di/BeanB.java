package com.aaron.ren.di;

import org.springframework.beans.factory.annotation.Autowired;

public class BeanB {
	@Autowired
	public BeanA beanA;
}