package com.ntuzy.client;

import com.ntuzy.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;

/**
 * @Author IamZY
 * @create 2020/2/24 10:29
 */
@Component
public class UserClientFallBack implements UserClient {
    @Override
    public User queryUserById(Long id) {
        User user = new User();
        user.setUsername("服务器正忙 稍后再试");
        return user;
    }
}
