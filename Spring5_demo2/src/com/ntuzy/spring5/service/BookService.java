package com.ntuzy.spring5.service;

import com.ntuzy.spring5.dao.BookDao;
import com.ntuzy.spring5.entity.Book;
import org.aspectj.lang.annotation.Around;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author IamZY
 * @create 2020/7/7 9:32
 */
@Service
public class BookService {
    @Autowired
    private BookDao bookDao;

    public void add(Book book) {
        bookDao.add(book);
    }

}
