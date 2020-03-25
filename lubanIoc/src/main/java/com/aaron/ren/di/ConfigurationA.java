package com.aaron.ren.di;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;

public class ConfigurationA {
	@Autowired
	public BeanB beanB;

	@Bean
	public BeanA beanA() {
		return new BeanA();
	}
}