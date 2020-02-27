package com.ntuzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @Author IamZY
 * @create 2020/2/27 16:33
 */
@SpringBootApplication
@EnableDiscoveryClient
public class LeyouUploadApplication {

    public static void main(String[] args){
        SpringApplication.run(LeyouUploadApplication.class);
    }
}
