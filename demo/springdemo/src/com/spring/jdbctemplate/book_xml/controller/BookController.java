package com.spring.jdbctemplate.book_xml.controller;

import com.spring.jdbctemplate.book_xml.service.BookService;
import com.spring.jdbctemplate.book_xml.service.Cashier;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

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

    @Autowired
    private Cashier cashier;

    public void buyBook(){
        service.buyBook("1", "1001");
    }

    public void checkOut(){
        List<String> bids = new ArrayList<>();
        bids.add("1");
        bids.add(String.valueOf(2));
        System.out.println(bids);
        cashier.checkOut("1001", bids);
    }

}
