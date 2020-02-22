package com.ntuzy.test;

/**
 * @Author IamZY
 * @create 2020/2/21 16:34
 */
public class DynamicProxyTest {
    public static void main(String[] args) {
        IHello hello = (IHello) new DunaProxyHello().bind(new Hello(), new DLogger());//如果我们需要日志功能，则使用代理类
        //IHello hello = new Hello();//如果我们不需要日志功能则使用目标类
        hello.sayHello("明天");
    }
}
