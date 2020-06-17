package com.spring.jdbctemplate.book_xml.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 *
 * @package com.spring.jdbctemplate.book.service
 * @author baiyutao
 * @date 2020/6/12 下午4:32
 * @version 1.0
 */

@Service
@Transactional
public class CashierImpl implements Cashier {
    @Autowired
    private BookService service;

    @Override
    public void checkOut(String uid, List<String> bids) {
        for(String bid: bids){
            service.buyBook(bid, uid);
        }
    }
}
