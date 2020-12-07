package com.aaron.ren.ioc.customerioc.test.cn.thinkinjava.myspring.test;

import com.aaron.ren.ioc.customerioc.factory.AutowireBeanFactory;
import com.aaron.ren.ioc.customerioc.factory.BeanFactory;
import com.aaron.ren.ioc.customerioc.util.BeanDefinition;
import com.aaron.ren.ioc.customerioc.util.PropertyValue;
import com.aaron.ren.ioc.customerioc.util.PropertyValues;

/**
 * 测试
 *
 * @author stateis0
 */
public class BeanFactoryTest {

	// 类全名称
	private final String classname = "cn.thinkinjava.myspring.test.HelloWorld";
	// 属性名称
	private final String property = "text";
	// 属性值
	private String value = "测试自动机";
	// 类id
	private final String name = "hello";

	public void test() throws Exception {

		// 创建自动注册bean工厂
		BeanFactory beanfactory = new AutowireBeanFactory();
		// 创建一个bean定义对象
		BeanDefinition beandefinition = new BeanDefinition();
		// 给bean定义对象设置类名并创建class对象
		beandefinition.setClassname(classname);

		// 创建一个成员变量集合
		PropertyValues pv = new PropertyValues();

		// 给bean定义设置成员变量集合
		beandefinition.setPropertyValues(pv);

		// 向bean定义添加成员变量集合
		beandefinition.getPropertyValues().addPropertyValue(new PropertyValue(property, value));

		// bean工厂将bean定义注册到容器中
		beanfactory.registerBeanDefinition(name, beandefinition);

		// 从容器中获取bean实例
		HelloWorld hello = (HelloWorld) beanfactory.getBean(name);

		// 调用实例方法
		hello.say();


	}

}