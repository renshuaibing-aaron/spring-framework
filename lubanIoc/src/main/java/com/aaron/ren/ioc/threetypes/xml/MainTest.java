package com.aaron.ren.ioc.threetypes.xml;

import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class MainTest {
	public static void main(String[] args) {

		System.out.println("========【context 开始启动】===========");
		System.out.println("0000000");
		ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		// 用我们的配置文件来启动一个 ApplicationContext
		System.out.println("========【context 启动成功 准备获取getBean 】===========");

		// 从 context 中取出我们的 Bean，而不是用 new PrototypeBean() 这种方式
		BraveKnightXml braveKnightXml = context.getBean(BraveKnightXml.class);
		//braveKnightXml.setWeaponXml(null);

		// 这句将输出: hello world
		System.out.println(braveKnightXml.getWeaponXml());


	/*	ClassPathResource resource = new ClassPathResource("spring.xml"); // <1>
		DefaultListableBeanFactory factory = new DefaultListableBeanFactory(); // <2>
		XmlBeanDefinitionReader reader = new XmlBeanDefinitionReader(factory); // <3>
		reader.loadBeanDefinitions(resource);*/

	}

}
