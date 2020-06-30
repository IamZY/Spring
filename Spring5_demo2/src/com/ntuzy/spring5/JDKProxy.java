package com.ntuzy.spring5;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author IamZY
 * @create 2020/6/30 10:28
 */
public class JDKProxy {
    public static void main(String[] args) {
        // 创建接口实现类

        Class[] interfaces = {UserDao.class};


        UserDao userDao = new UserDaoImpl();

        UserDao dao = (UserDao) Proxy.newProxyInstance(JDKProxy.class.getClassLoader(), interfaces, new UserDaoProxy(userDao));


        int add = dao.add(1, 2);

        System.out.println(add);

    }
}

class UserDaoProxy implements InvocationHandler {

    // 被代理的对象
    private Object obj;

    public UserDaoProxy(Object obj) {
        this.obj = obj;
    }

    // 增强逻辑
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

        // 方法之前
        System.out.println("方法之前执行" + method.getName() + "传递的参数->" + Arrays.toString(args));

        // 增强的方法
        Object res = method.invoke(obj, args);

        // 方法之后
        System.out.println("方法之后执行..." + obj);
        return res;
    }
}
