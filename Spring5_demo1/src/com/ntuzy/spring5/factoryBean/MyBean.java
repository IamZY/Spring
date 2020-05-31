package com.ntuzy.spring5.factoryBean;

import com.ntuzy.spring5.Book;
import org.springframework.beans.factory.FactoryBean;

/**
 * @Author IamZY
 * @create 2020/5/31 14:26
 */
public class MyBean implements FactoryBean<Book> {

    // 定义返回的bean的对象
    @Override
    public Book getObject() throws Exception {
        Book book = new Book();
        book.setBname("a");
        return book;
    }

    @Override
    public Class<?> getObjectType() {
        return null;
    }
}
