package com.spring.aop.aspect;

import com.spring.aop.entity.Account;
import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;
@Order(2)
@Aspect
@Component
public class MyDemoApiRecords {


        @AfterReturning(pointcut="com.spring.aop.aspect.Pointcuts.addPointcut()"
                ,returning = "result"
                )
        public void beforeAddAccountAdvice(JoinPoint joinPoint
            , Account result
        ){

            System.out.println("\n ======> > > > After return Advice API");
             System.out.println("Password == "+ result.toString());

        }
    }

