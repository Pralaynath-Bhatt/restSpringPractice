package com.spring.aop.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AfterThrowingAspect {

    @AfterThrowing(pointcut = "com.spring.aop.aspect.Pointcuts.addPointcut()",
    throwing = "bhai")
    public void timepass(JoinPoint joinPoint,
                         Throwable bhai){

        System.out.println("INSIDE the expection Error Aspect");

    }

}
