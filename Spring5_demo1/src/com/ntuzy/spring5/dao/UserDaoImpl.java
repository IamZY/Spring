package com.ntuzy.spring5.dao;

import org.springframework.stereotype.Repository;

/**
 * @Author IamZY
 * @create 2020/6/30 9:34
 */
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public void add() {
        System.out.println("dao userDaoImpl...");
    }
}
