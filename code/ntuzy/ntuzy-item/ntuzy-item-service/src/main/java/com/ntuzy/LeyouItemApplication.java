package com.ntuzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

/**
 * @Author IamZY
 * @create 2020/2/24 16:22
 */
@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.ntuzy.item.mapper")
public class LeyouItemApplication {
    public static void main(String[] args){
        SpringApplication.run(LeyouItemApplication.class);
    }
}
