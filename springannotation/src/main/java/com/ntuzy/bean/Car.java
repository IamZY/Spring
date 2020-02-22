package com.ntuzy.bean;

/**
 * @Author IamZY
 * @create 2020/2/20 19:59
 */
public class Car {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Car() {
        System.out.println("car cosntructor ... ");
    }
    
    public void init() {
        System.out.println("car .. init ...");
    }

    public void destory() {
        System.out.println("car .. destory...");
    }

    @Override
    public String toString() {
        return "Car{" +
                "name='" + name + '\'' +
                '}';
    }
}
