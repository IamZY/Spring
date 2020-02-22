package com.ntuzy.test;

/**
 * @Author IamZY
 * @create 2020/2/21 16:01
 */
public class DynaTest {
    public static void main(String[] args){
        IHello iHello = (IHello) new DynaProxyHello().bind(new Hello());
        iHello.sayHello("111");
    }
}
