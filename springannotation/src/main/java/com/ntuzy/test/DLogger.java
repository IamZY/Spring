package com.ntuzy.test;

import java.lang.reflect.Method;
import java.util.Date;

/**
 * @Author IamZY
 * @create 2020/2/21 16:26
 */
public class DLogger implements ILogger {
    public void start(Method method) {
        System.out.println(new Date() + method.getName() + "say hello start...");
    }

    public void end(Method method) {
        System.out.println(new Date() + method.getName() + "say hello end...");

    }
}
