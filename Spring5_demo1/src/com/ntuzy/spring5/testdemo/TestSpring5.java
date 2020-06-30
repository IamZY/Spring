package com.ntuzy.spring5.testdemo;

import com.ntuzy.spring5.Book;
import com.ntuzy.spring5.Orders;
import com.ntuzy.spring5.User;
import com.ntuzy.spring5.config.SpringConfig;
import com.ntuzy.spring5.service.UserService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author IamZY
 * @create 2020/5/30 17:25
 */
public class TestSpring5 {

    @Test
    public void testAdd() {
        // 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 获取配置对象
        User user = (User) context.getBean("user", User.class);

        user.add();
    }


    @Test
    public void testAdd2() {
        // 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 获取配置对象
        Book book = (Book) context.getBean("book", Book.class);

        System.out.println(book);

    }


    @Test
    public void testAdd3() {
        // 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        // 获取配置对象
        Book book = (Book) context.getBean("myBean", Book.class);

        System.out.println(book);
    }

    @Test
    public void testAdd4() {
        // 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean2.xml");

        // 获取配置对象
        Orders orders = (Orders) context.getBean("orders", Orders.class);

        System.out.println(orders);

        ((ClassPathXmlApplicationContext) context).close();

    }

    @Test
    public void testAdd5() {
        // 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean3.xml");
        // 获取配置对象
        UserService userService = (UserService) context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testAdd6() {
        // 加载spring配置文件
        ApplicationContext context = new ClassPathXmlApplicationContext("bean4.xml");
        // 获取配置对象
        UserService userService = (UserService) context.getBean("userService", UserService.class);
        userService.add();
    }

    @Test
    public void testAdd7() {
        // 加载spring配置文件
        ApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        // 获取配置对象
        UserService userService = (UserService) context.getBean("userService", UserService.class);
        userService.add();
    }


}
