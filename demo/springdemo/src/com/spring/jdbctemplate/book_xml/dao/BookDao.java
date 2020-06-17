package com.spring.jdbctemplate.book_xml.dao;

/**
 *
 * @package com.spring.jdbctemplate.book.dao
 * @author baiyutao
 * @date 2020/6/10 下午3:38
 * @version 1.0
 */
public interface BookDao {
    Integer selectPrice(String bid);
    void updateSt(String bid);
    void updateBalance(String uid, Integer price);
}
