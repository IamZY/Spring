package com.ntuzy.service;

import com.ntuzy.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

/**
 * @Author IamZY
 * @create 2020/2/20 16:23
 */
@Service
public class BookService {
    @Autowired
    public BookDao bookDao;

    @Override
    public String toString() {
        return "BookService{" +
                "bookDao=" + bookDao.getLabel() +
                '}';
    }
}
