package com.ntuzy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author IamZY
 * @create 2020/2/19 20:37
 */
public class Main {
    public static void main(String[] args) {
        // ApplicationContext  IOC 容器
        // ClassPathXmlApplication 类路径下创建 xml
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        HelloWorld helloWorld = (HelloWorld) ac.getBean("helloWorld");
//        HelloWorld helloWorld2 = ac.getBean(HelloWorld.class);  // 只能存在一种HelloWorld

        helloWorld.sayHello();
//        helloWorld2.sayHello();


        Car car = (Car) ac.getBean("car");

        System.out.println(car);

        car = (Car) ac.getBean("car2");

        System.out.println(car);

    }
}
