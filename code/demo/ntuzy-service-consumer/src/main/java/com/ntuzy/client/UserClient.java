package com.ntuzy.client;

import com.ntuzy.pojo.User;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author IamZY
 * @create 2020/2/24 10:13
 */
@FeignClient(value = "service-provider", fallback = UserClientFallBack.class)
public interface UserClient {

    @GetMapping("user/{id}")
    public User queryUserById(@RequestParam("id") Long id);

}
