package com.ntuzy.test;

import com.ntuzy.bean.Car;
import com.ntuzy.config.MainConfigOfLifeCycle;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author IamZY
 * @create 2020/2/20 20:01
 */
public class IOTest_LifeCycle {
    @Test
    public void test() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
        Car ca = annotationConfigApplicationContext.getBean(Car.class);
        System.out.println(ca);
        annotationConfigApplicationContext.close();
    }
}
