package com.ntuzy.test;

import com.ntuzy.bean.Car;
import com.ntuzy.bean.Person;
import com.ntuzy.config.MainConfigOfLifeCycle;
import com.ntuzy.config.MainConfig_Pro;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @Author IamZY
 * @create 2020/2/20 20:43
 */
public class IOTest_Property {

    @Test
    public void test() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(MainConfig_Pro.class);
        Person person = (Person) annotationConfigApplicationContext.getBean("person");
        System.out.println(person);
        annotationConfigApplicationContext.close();
    }


}
