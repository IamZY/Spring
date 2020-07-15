package com.ntuzy.webfluxdemo1.controller;

import com.ntuzy.webfluxdemo1.entity.User;
import com.ntuzy.webfluxdemo1.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @Author IamZY
 * @create 2020/7/15 9:13
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;


    // id查询
    @GetMapping("/user/{id}")
    public Mono<User> getUserId(@PathVariable Integer id) {
        return userService.getUserById(id);
    }


    // 查询所有
    @GetMapping("/user")
    public Flux<User> getUsers() {
        return userService.getAllUser();
    }


    // 添加用户
    @PostMapping("/saveuser")
    public Mono<Void> saveUser(@RequestBody User user) {
        Mono<User> userMono = Mono.just(user);
        return userService.saveUserInfo(userMono);
    }

}
