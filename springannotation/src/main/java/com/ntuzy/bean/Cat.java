package com.ntuzy.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @Author IamZY
 * @create 2020/2/20 20:06
 */
@Component
public class Cat implements InitializingBean, DisposableBean {
    public void destroy() throws Exception {
        System.out.println("cat destory...");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("cat init ...");
    }

    public Cat() {
        System.out.println("car construtor...");
    }
}
