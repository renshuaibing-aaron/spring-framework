package com.aaron.ren.transaction.demo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
//@Transaction可以作用在类和方法上, 我们这里只作用在方法上。
@Target(value = ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
/**
 * 自定义事务注解
 */
public @interface MyAnnotation {

}