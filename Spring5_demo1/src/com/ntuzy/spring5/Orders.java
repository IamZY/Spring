package com.ntuzy.spring5;

/**
 * @Author IamZY
 * @create 2020/5/31 14:44
 */
public class Orders {
    private String oname;

    public void setOname(String oname) {
        System.out.println("set方法");
        this.oname = oname;
    }

    public Orders() {
        System.out.println("无参构造方法...");
    }

    public void initMethod() {
        System.out.println("init-method");
    }

    public void destoryMethod() {
        System.out.println("destory-method");
    }

    @Override
    public String toString() {
        return "Orders{" +
                "oname='" + oname + '\'' +
                '}';
    }
}
