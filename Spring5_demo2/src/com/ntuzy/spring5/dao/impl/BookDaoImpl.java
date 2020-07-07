package com.ntuzy.spring5.dao.impl;

import com.ntuzy.spring5.dao.BookDao;
import com.ntuzy.spring5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author IamZY
 * @create 2020/7/7 9:32
 */
@Repository
public class BookDaoImpl implements BookDao {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void add(Book book) {

        String sql = "insert into t_book values(?,?,?)";

        int update = jdbcTemplate.update(sql, book.getUserId(), book.getUsername(), book.getUstatus());

        System.out.println(update);
    }


}
