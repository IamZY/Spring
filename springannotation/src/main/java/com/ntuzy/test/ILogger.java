package com.ntuzy.test;

import java.lang.reflect.Method;

/**
 * @Author IamZY
 * @create 2020/2/21 16:24
 */
public interface ILogger {

    public void start(Method method);
    public void end(Method method);

}
