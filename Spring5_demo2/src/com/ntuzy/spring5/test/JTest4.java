package com.ntuzy.spring5.test;

import com.ntuzy.spring5.service.BookService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * @Author IamZY
 * @create 2020/7/9 9:09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:bean1.xml")
public class JTest4 {
    @Autowired
    private BookService bookService;

    @Test
    public void test1() {
//        bookService.add();
    }
}
