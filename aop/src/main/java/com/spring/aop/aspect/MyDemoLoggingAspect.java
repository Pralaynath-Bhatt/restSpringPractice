package com.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(1)
@Aspect
@Component
public class MyDemoLoggingAspect {

    @Before("com.spring.aop.aspect.Pointcuts.addPointcut()")
    public void beforeAddAccountAdvice(){
        System.out.println("\n ======> > > > Before advice");
    }
}
