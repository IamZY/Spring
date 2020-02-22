package com.ntuzy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Stack;

/**
 * @Author IamZY
 * @create 2020/2/21 16:27
 */
public class DunaProxyHello implements InvocationHandler {

    //
    private Object proxy;
    private Object target;


    public Object bind(Object target, Object proxy) {
        this.target = target;
        this.proxy = proxy;
        return Proxy.newProxyInstance(this.target.getClass().getClassLoader(), this.target.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result = null;
        // 当前方法执行前执行的方法
        Class clazz = this.proxy.getClass();
        Method start = clazz.getDeclaredMethod("start", new Class[]{Method.class});
        start.invoke(this.proxy, new Object[]{method});
        // 当前方法
        method.invoke(this.target, args);
        Method end = clazz.getDeclaredMethod("end", new Class[]{Method.class});
        //反射执行end方法
        // 当前方法执行前执行的方法
        end.invoke(this.proxy, new Object[]{method});
        return result;
    }
}
