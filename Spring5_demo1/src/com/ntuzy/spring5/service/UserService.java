package com.ntuzy.spring5.service;

import org.springframework.stereotype.Component;

/**
 * @Author IamZY
 * @create 2020/5/31 15:36
 */
@Component(value = "userService")
public class UserService {

    public void add() {
        System.out.println("service add...");
    }

}
