package com.spring.aop.aspect;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(2)
@Aspect
@Component
public class MyDemoApiRecords {


        @Before("com.spring.aop.aspect.Pointcuts.addPointcut()")
        public void beforeAddAccountAdvice(){
            System.out.println("\n ======> > > > Before advice API");
        }
    }

