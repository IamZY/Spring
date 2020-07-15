package com.ntuzy.webfluxdemo1.service.impl;

import com.ntuzy.webfluxdemo1.entity.User;
import com.ntuzy.webfluxdemo1.service.UserService;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author IamZY
 * @create 2020/7/15 9:05
 */
@Repository
public class UserServiceImpl implements UserService {

    private final Map<Integer, User> users = new HashMap<>();

    public UserServiceImpl() {
        users.put(1, new User("lucy", "nan", 20));
        users.put(2, new User("lucy1", "nan", 22));
        users.put(3, new User("lucy2", "nv", 21));
    }


    @Override
    public Mono<User> getUserById(Integer id) {
        return Mono.justOrEmpty(this.users.get(id));
    }

    @Override
    public Flux<User> getAllUser() {
        return Flux.fromIterable(this.users.values());
    }

    @Override
    public Mono<Void> saveUserInfo(Mono<User> userMono) {
        return userMono.doOnNext(person -> {
            // 想map中
            int id = this.users.size() + 1;
            users.put(id, person);
        }).thenEmpty(Mono.empty());
    }
}
