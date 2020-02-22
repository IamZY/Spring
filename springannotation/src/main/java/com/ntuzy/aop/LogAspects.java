package com.ntuzy.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;

import java.util.Arrays;

/**
 * @Author IamZY
 * @create 2020/2/21 14:44
 */
@Aspect
public class LogAspects {

    @Pointcut("execution(public int com.ntuzy.aop.MathCalculator.*(..))")
    public void pointCut() {
    }


    // 在目标方法之前切入
    @Before("pointCut()")
    public void logStart(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println(joinPoint.getSignature().getName() + "除法运行 参数列表" + Arrays.asList(args));
    }

    @After("pointCut()")
    public void logEnd(JoinPoint joinPoint) {
        System.out.println(joinPoint.getSignature().getName() + "除法结束");
    }

    @AfterReturning(value = "pointCut()", returning = "result")
    public void logReturn(Object result) {
        System.out.println("除法返回.... 返回值是 " + result);
    }

    @AfterThrowing(value = "pointCut()", throwing = "exception")
    public void logException(Exception exception) {
        System.out.println(exception.getStackTrace() + "除法异常");
    }

}
