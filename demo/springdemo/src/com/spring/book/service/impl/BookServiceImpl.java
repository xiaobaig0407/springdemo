package com.spring.book.service.impl;

import com.spring.book.dao.BookDao;
import com.spring.book.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @package com.spring.book.controller.service
 * @author baiyutao
 * @date 2020/5/29 下午6:03
 * @version 1.0
 */
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao bookDao;


}
