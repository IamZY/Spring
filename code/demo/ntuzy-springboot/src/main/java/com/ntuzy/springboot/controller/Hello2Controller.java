package com.ntuzy.springboot.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author IamZY
 * @create 2020/2/22 15:23
 */
@RestController
@RequestMapping("hello")
@EnableAutoConfiguration   // 启用自动配置
public class Hello2Controller {
    @GetMapping("show")
    public String test() {
        return "hello world";
    }

}
