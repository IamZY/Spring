package com.ntuzy.spring;

/**
 * @Author IamZY
 * @create 2020/2/19 20:32
 */
public class HelloWorld {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sayHello() {
        System.out.println("sayHello " + this.name);
    }

}
