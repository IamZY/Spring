package com.ntuzy.springboot;

import com.ntuzy.springboot.controller.HelloController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @Author IamZY
 * @create 2020/2/22 15:30
 */
@EnableAutoConfiguration
@ComponentScan
@SpringBootApplication  // 组合注解  Enable+ComponentScan
public class TestApplication {
    public static void main(String[] args) {
        SpringApplication.run(TestApplication.class, args);
    }
}
