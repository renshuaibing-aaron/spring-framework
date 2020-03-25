package com.aaron.ren.aop.test.aop_spring_2_schema_based;

import org.aspectj.lang.annotation.Pointcut;

public class SystemArchitecture {

    @Pointcut("within(com.aaron.ren.aop.test.web..*)")
    public void inWebLayer() {
    }

    @Pointcut("within(com.aaron.ren.aop.test.service..*)")
    public void inServiceLayer() {
    }

    @Pointcut("execution(* com.aaron.ren.aop.test.service.*.*(..))")
    public void businessService() {
    }

}
