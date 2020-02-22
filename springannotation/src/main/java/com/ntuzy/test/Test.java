package com.ntuzy.test;

/**
 * @Author IamZY
 * @create 2020/2/21 15:53
 */
public class Test {
    public static void main(String[] args){
        ProxyHello p = new ProxyHello(new Hello());
        p.sayHello("tom");
    }
}
