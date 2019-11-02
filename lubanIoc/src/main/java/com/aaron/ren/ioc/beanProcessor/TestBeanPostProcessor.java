package com.aaron.ren.ioc.beanProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class TestBeanPostProcessor implements BeanPostProcessor {

	@Override
	public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof StudentEntity) {


			StudentEntity studentEntity = new StudentEntity();
			//System.out.println("============="+studentEntity.getName());
		//	System.out.println("============="+beanName);
		//	studentEntity.setName(beanName);
			return studentEntity;
		}
		return bean;
	}

	@Override
	public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
		if (bean instanceof StudentEntity) {
			System.out.println("============="+((StudentEntity) bean).getName());
			((StudentEntity) bean).setName("RSB");
			System.out.println(bean);
		}
		return bean;
	}
}