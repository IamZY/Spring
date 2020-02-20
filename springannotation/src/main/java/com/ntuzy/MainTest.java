package com.ntuzy;

import com.ntuzy.bean.Person;
import com.ntuzy.config.MainConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author IamZY
 * @create 2020/2/20 16:15
 */
public class MainTest {
    public static void main(String[] args){
//        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
//        Person person = (Person) ac.getBean("person");
//        System.out.println(person.getAge());

        AnnotationConfigApplicationContext applicationContext = new AnnotationConfigApplicationContext(MainConfig.class);

        Person p = applicationContext.getBean(Person.class);
        
        System.out.println(p.getName());

        String[] beanNamesForType = applicationContext.getBeanNamesForType(Person.class);
    
        for(String str: beanNamesForType) {
            System.out.println(str);
        }

    }
}
