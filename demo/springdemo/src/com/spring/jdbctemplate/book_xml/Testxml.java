package com.spring.jdbctemplate.book_xml;

import com.spring.jdbctemplate.book_xml.controller.BookController;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @package com.spring.jdbctemplate.book
 * @author baiyutao
 * @date 2020/6/10 下午5:06
 * @version 1.0
 */
public class Testxml {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("booktrans_xml" +
                ".xml");
        BookController bookController = applicationContext.getBean("bookController",
                BookController.class);
        bookController.buyBook();
      //  bookController.checkOut();
    }
}
