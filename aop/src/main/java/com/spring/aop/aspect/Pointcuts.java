package com.spring.aop.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class Pointcuts {
    @Pointcut("execution(* com.spring.aop.dao.*.*(..))")
    public  void addPointcut(){};

}
