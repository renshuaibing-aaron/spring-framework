package com.aaron.ren.ioc.typeconvert;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.format.support.FormattingConversionService;

public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		FormattingConversionService service = new FormattingConversionService();
		service.addConverter(new StringToDateConverter());
		beanFactory.setConversionService(service);
	}
}
