package com.ntuzy.test;

/**
 * @Author IamZY
 * @create 2020/2/21 15:54
 */
public class ProxyHello implements IHello {
    private IHello iHello;

    public ProxyHello(IHello iHello) {
        this.iHello = iHello;
    }

    public void sayHello(String str) {
        System.out.println("start....");
        iHello.sayHello(str);
        System.out.println("end....");
    }
}
