package com.aaron.ren.ioc.annotation;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//测试发现Configuration 这个注解不使用也可以
@Configuration
// 如果不配置扫描的路径，默认扫描配置类所在的包及其子包下面的所有类，所以会导致有些类找不到
@ComponentScan("com.aaron")
public class MyConfig {

	/*
	* spring 在进行扫描注入myconfig类时，会进行判断其注解，如果注解使用的是@Configuration
	* spring 会认为其是一个全配置类（full） 并且在容器内部会生成一个cglib代理的类
	*
	* 如果不使用@Configuration 不会影响程序的结果，只是容器里面生成的是一个普通类
	*
	* 一般情况，我们把带有@Configuration的类叫做全注解配置类，也叫Full配置类；
我们把不带@Configuration的类叫Lite配置类；
	* */


	/*
	* @Configuation总结
 @Configuation等价于<Beans></Beans>

 @Bean等价于<Bean></Bean>

 @ComponentScan等价于<context:component-scan base-package="com.dxz.demo"/>*/
}