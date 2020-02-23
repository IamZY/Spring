package com.ntuzy.service.service;

import com.ntuzy.service.mapper.UserMapper;
import com.ntuzy.service.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author IamZY
 * @create 2020/2/23 16:54
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User queryUserById(Long id) {
        return this.userMapper.selectByPrimaryKey(id);
    }



}
