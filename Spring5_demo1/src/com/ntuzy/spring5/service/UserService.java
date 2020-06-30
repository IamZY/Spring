package com.ntuzy.spring5.service;

import com.ntuzy.spring5.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/**
 * @Author IamZY
 * @create 2020/5/31 15:36
 */
//@Component(value = "userService")
@Service
public class UserService {

    @Autowired
    @Qualifier(value = "userDaoImpl")
    private UserDao userDao;


    public void add() {
        System.out.println("service add....");
        userDao.add();
    }

}
