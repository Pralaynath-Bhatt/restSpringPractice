package com.spring.aop.aspect;

import com.spring.aop.entity.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


@Aspect
@Component
@Order(3)
public class MySecurityRecord {

    @Before("com.spring.aop.aspect.Pointcuts.addPointcut()")
    public void addSecurity(JoinPoint joinPoint){
        System.out.println("\n +++++=======>  Final security Part");

        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        System.out.println("Method: "+methodSignature);

        Object[] args = joinPoint.getArgs();

        for(Object tempArgs: args){
            System.out.println("Args are : "+tempArgs);
            if (tempArgs instanceof Account){
                Account account = (Account) tempArgs;
                account.setName("RRR");
            }

        }

    }
}
