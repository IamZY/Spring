package com.ntuzy.controller;

import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.ntuzy.client.UserClient;
import com.ntuzy.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author IamZY
 * @create 2020/2/23 17:20
 */
@Controller
@RequestMapping("consumer/user")
//@DefaultProperties(defaultFallback = "fallBackMethod")
public class UserController {

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private DiscoveryClient discoveryClient;

    @Autowired
    private UserClient userClient;

    @GetMapping
    @ResponseBody
//    @HystrixCommand  // 声明熔断的方法
    public User queryUserById(@RequestParam("id") Long id) {
//        List<ServiceInstance> instances = discoveryClient.getInstances("service-provider");
//        ServiceInstance instance = instances.get(0);
//        return this.restTemplate.getForObject("http://"+ instance.getHost() +":"+ instance.getPort() +"/user/" + id, User.class);

//        if (id == 1) {
//            throw new RuntimeException();
//        }
//
//        String baseUrl = "http://service-provider/user/" + id;
//        return this.restTemplate.getForObject(baseUrl, String.class);
        User user = this.userClient.queryUserById(id);
        return user;

    }

//    public String fallBackMethod() {
//        return "服务异常,请稍后再试";
//    }


}
