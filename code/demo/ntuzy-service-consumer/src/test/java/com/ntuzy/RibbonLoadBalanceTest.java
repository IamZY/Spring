package com.ntuzy;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.netflix.ribbon.RibbonLoadBalancerClient;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * @Author IamZY
 * @create 2020/2/23 21:11
 */
@SpringBootTest(classes = NtuzyServiceConsumerApplication.class)
@RunWith(SpringRunner.class)
public class RibbonLoadBalanceTest {

    @Autowired
    private RibbonLoadBalancerClient client;

    @Test
    public void test(){

        for(int i = 0;i < 20;i++) {
            ServiceInstance choose = client.choose("service-provider");
            System.out.println("ip " + choose.getHost() + "port " + choose.getPort());
        }

    }

}
