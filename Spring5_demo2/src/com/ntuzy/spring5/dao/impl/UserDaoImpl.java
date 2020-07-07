package com.ntuzy.spring5.dao.impl;

import com.ntuzy.spring5.dao.UserDao;

/**
 * @Author IamZY
 * @create 2020/6/30 10:27
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int add(int a, int b) {
        System.out.println("add方法执行....");
        return a + b;
    }

    @Override
    public String update(String id) {
        return id;
    }
}
