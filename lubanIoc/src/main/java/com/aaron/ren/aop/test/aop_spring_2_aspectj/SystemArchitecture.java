package com.aaron.ren.aop.test.aop_spring_2_aspectj;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class SystemArchitecture {


    @Pointcut("within(com.aaron.ren.aop.test.service..*)")
    public void inServiceLayer() {}


    @Pointcut("execution(* com.aaron.ren.aop.test.service.*.*(..))")
    public void businessService() {}

}
