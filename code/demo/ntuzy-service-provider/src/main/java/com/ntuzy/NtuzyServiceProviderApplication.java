package com.ntuzy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.ntuzy.mapper")  // Mapper接口的报扫描
@EnableDiscoveryClient  // 启动eureka客户端 enableEurekaClient
public class NtuzyServiceProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(NtuzyServiceProviderApplication.class, args);
    }

}
