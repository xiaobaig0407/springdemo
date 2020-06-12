package com.spring.jdbctemplate.book.controller;

import com.spring.jdbctemplate.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @package com.spring.jdbctemplate.book.controller
 * @author baiyutao
 * @date 2020/6/10 下午3:34
 * @version 1.0
 */

@Controller
public class BookController {
    @Autowired
    private BookService service;

    public void buyBook(){
        service.buyBook("1", "1001");
    }

}
