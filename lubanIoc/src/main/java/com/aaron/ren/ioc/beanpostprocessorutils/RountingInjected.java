package com.aaron.ren.ioc.beanpostprocessorutils;

import org.springframework.stereotype.Component;

import java.lang.annotation.*;

/**
 * @author renshuaibing
 * @version 1.0
 * @description: TODO
 * @date 2020/11/17 21:39
 */


@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Component
public @interface RountingInjected {
	String value() default "helloServiceImpl1";

}
