package com.aaron.ren.lifeciyle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanLifeCycle {

	public static void main(String[] args) {

		System.out.println("【现在开始初始化容器】");

		ApplicationContext factory = new ClassPathXmlApplicationContext("springbeanlifecycle.xml");
		System.out.println("【容器容器初始化成功】");
		//得到Preson，并使用
		Person person = factory.getBean("person",Person.class);
		System.out.println(person);

		System.out.println("【现在开始关闭容器】！");
		((ClassPathXmlApplicationContext)factory).registerShutdownHook();
	}
}
/*
       【现在开始初始化容器】
		【这是BeanFactoryPostProcessor实现类构造器！！】
		【BeanFactoryPostProcessor调用postProcessBeanFactory方法】
		【这是BeanPostProcessor实现类构造器！！】
		【这是InstantiationAwareBeanPostProcessorAdapter实现类构造器！！】
		【InstantiationAwareBeanPostProcessor调用postProcessBeforeInstantiation方法】
		【构造器】调用Person的构造器实例化
		【InstantiationAwareBeanPostProcessor调用postProcessPropertyValues方法】
		【注入属性】address
		【注入属性】name
		【注入属性】phone
		【BeanNameAware接口】调用setBeanName方法
		【BeanFactoryAware接口】调用setBeanFactory方法
		【BeanPostProcessor接口方法postProcessBeforeInitialization对属性进行更改！！】
		【InitializingBean接口】调用afterPropertiesSet方法
		【init-method】调用<bean>的init-method属性指定的初始化方法
		【BeanPostProcessor接口方法postProcessAfterInitialization对属性进行更改】
		【InstantiationAwareBeanPostProcessor调用postProcessAfterInitialization方法】
		【容器容器初始化成功】
		【现在开始关闭容器】！
		【DiposibleBean接口】调用destroy方法
		【destroy-method】调用<bean>的destroy-method属性指定的初始化方法
 */
