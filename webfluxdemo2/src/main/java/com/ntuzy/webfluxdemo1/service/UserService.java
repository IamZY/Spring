package com.ntuzy.webfluxdemo1.service;

import com.ntuzy.webfluxdemo1.entity.User;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


/**
 * @Author IamZY
 * @create 2020/7/15 9:00
 */
// 用户操作借口
public interface UserService {

    // 根据id查询用户
    Mono<User> getUserById(Integer id);

    // 查询所有用户
    Flux<User> getAllUser();

    // 添加用户
    Mono<Void> saveUserInfo(Mono<User> user);

}
