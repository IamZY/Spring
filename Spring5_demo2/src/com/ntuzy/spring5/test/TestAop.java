package com.ntuzy.spring5.test;

import com.ntuzy.spring5.aopanno.User;
import com.ntuzy.spring5.entity.Book;
import com.ntuzy.spring5.service.BookService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author IamZY
 * @create 2020/7/6 15:12
 */
public class TestAop {

    @Test
    public void testAopAnno() {

        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");

        User user = context.getBean("user", User.class);

        user.add();


    }


    @Test
    public void testJdbcTemplate() {
        ApplicationContext context = new ClassPathXmlApplicationContext("bean1.xml");
        BookService bookService = context.getBean("bookService", BookService.class);

        Book book = new Book();
        book.setUserId(1);
        book.setUsername("java");
        book.setUstatus("a");

        bookService.add(book);

    }

}
