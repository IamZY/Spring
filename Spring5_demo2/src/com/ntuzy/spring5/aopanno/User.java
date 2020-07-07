package com.ntuzy.spring5.aopanno;

import org.springframework.stereotype.Component;

/**
 * @Author IamZY
 * @create 2020/7/6 14:53
 */
@Component
public class User {
    public void add() {
        System.out.println("add...");
    }
}
