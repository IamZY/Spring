package com.ntuzy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author IamZY
 * @create 2020/2/21 15:57
 */
public class DynaProxyHello implements InvocationHandler {

    private Object target; // 目标对象

    public Object bind(Object o) {
        this.target = o;
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(),this.target.getClass().getInterfaces(),this);
    }


    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        System.out.println("start ... ");
        result = method.invoke(this.target, args);
        System.out.println("end ... ");
        return result;
    }
}
