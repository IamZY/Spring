package com.ntuzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author IamZY
 * @create 2020/2/24 16:22
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LeyouItemApplication {
    public static void main(String[] args){
        SpringApplication.run(LeyouItemApplication.class);
    }
}
