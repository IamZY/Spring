package com.ntuzy.test;

/**
 * @Author IamZY
 * @create 2020/2/21 15:54
 */
public class Hello implements IHello {
    
    public void sayHello(String str) {
        System.out.println("Hello " + str);
    }
}
