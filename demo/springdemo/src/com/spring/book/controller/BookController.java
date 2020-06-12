package com.spring.book.controller;

import com.spring.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 *
 * @package com.spring.book.controller
 * @author baiyutao
 * @date 2020/5/29 下午6:03
 * @version 1.0
 */

@Controller
public class BookController {
    @Autowired
    private BookService service;
}
