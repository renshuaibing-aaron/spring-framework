package com.aaron.ren.ioc.beanfactorypostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;


/**
 * 和BeanPostProcessor原理一致，Spring提供了对BeanFactory进行操作的处理器BeanFactoryProcessor，简单来说就是获取容器BeanFactory，这样就可以在真正初始化bean之前对bean做一些处理操作。
 * 允许我们在工厂里所有的bean被加载进来后但是还没初始化前，对所有bean的属性进行修改也可以add属性值。
 * **/
public class CustomBeanFactoryPostProcessor implements BeanFactoryPostProcessor{

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("postProcessBeanFactory");
		//获取BeanDefinition
       /* TestService testService = (TestService) beanFactory.getBean("testServiceImpl");
        //System.out.println("得到 testService ");
        ////testService.doMessage(); */

		BeanDefinition beanDefinition = beanFactory.getBeanDefinition("myTestBean");
		System.out.println("修改属性name值");
		beanDefinition.getPropertyValues().add("name", "王五");


	}

}