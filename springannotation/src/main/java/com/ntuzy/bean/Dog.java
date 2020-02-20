package com.ntuzy.bean;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @Author IamZY
 * @create 2020/2/20 20:11
 */
@Component
public class Dog implements ApplicationContextAware {

    private ApplicationContext applicationContext;

    public void Dog() {
        System.out.println("Dog constructor ..");
    }
    
    @PostConstruct
    public void init() {
        System.out.println("Dog init ..");
    }
    
    @PreDestroy
    public void destory() {
        System.out.println("Dog destory....");
    }

    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
