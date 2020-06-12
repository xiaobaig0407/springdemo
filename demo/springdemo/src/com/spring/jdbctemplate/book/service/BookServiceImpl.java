package com.spring.jdbctemplate.book.service;

import com.spring.jdbctemplate.book.dao.BookDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 *
 * @package com.spring.jdbctemplate.book.service
 * @author baiyutao
 * @date 2020/6/10 下午3:37
 * @version 1.0
 */

@Service
public class BookServiceImpl implements BookService {
    @Autowired
    private BookDao dao;

    @Override
    @Transactional
    public void buyBook(String bid, String uid) {
        Integer price = dao.selectPrice(bid);
        dao.updateSt(bid);
        dao.updateBalance(uid, price);
    }
}
