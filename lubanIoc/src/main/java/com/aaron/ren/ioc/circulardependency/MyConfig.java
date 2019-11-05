package com.aaron.ren.ioc.circulardependency;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//测试发现Configuration 这个注解不使用也可以
@Configuration
// 如果不配置扫描的路径，默认扫描配置类所在的包及其子包下面的所有类，所以会导致有些类找不到
@ComponentScan("com.aaron.ren.ioc.circulardependency")
public class MyConfig {


}