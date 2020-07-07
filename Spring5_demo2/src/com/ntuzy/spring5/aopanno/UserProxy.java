package com.ntuzy.spring5.aopanno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

/**
 * @Author IamZY
 * @create 2020/7/6 14:54
 */
@Component
@Aspect
public class UserProxy {

    @Pointcut(value = "execution(* com.ntuzy.spring5.aopanno.User.add(..))")
    public void pointdemo() {

    }


    // 前置通知
    @Before(value = "pointdemo()")
    public void before() {
        System.out.println("before...");
    }
    
    @Around(value = "execution(* com.ntuzy.spring5.aopanno.User.add(..))")
    public void around(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("around 之前....");
        
        proceedingJoinPoint.proceed();
        
        System.out.println("around 之后...");
    }
    
}
