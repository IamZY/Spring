package com.ntuzy.controller;

import com.ntuzy.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * @Author IamZY
 * @create 2020/2/20 16:22
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;
}
