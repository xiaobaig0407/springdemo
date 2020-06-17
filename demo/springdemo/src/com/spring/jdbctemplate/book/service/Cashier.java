package com.spring.jdbctemplate.book.service;

import java.util.List;

/**
 *
 * @package com.spring.jdbctemplate.book.service
 * @author baiyutao
 * @date 2020/6/12 下午4:31
 * @version 1.0
 */
public interface Cashier {
    void checkOut(String uid, List<String> bids);
}
