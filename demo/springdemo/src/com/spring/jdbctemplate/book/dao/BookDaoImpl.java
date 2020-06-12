package com.spring.jdbctemplate.book.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 *
 * @package com.spring.jdbctemplate.book.dao
 * @author baiyutao
 * @date 2020/6/10 下午3:39
 * @version 1.0
 */

@Repository
public class BookDaoImpl implements BookDao {

    @Override
    public Integer selectPrice(String bid) {
        Integer price = jdbcTemplate.queryForObject("select price from book where id = ?",
                new Object[]{bid},
                Integer.class);
        return price;

    }

    @Override
    public void updateSt(String bid) {
        //get stock
        Integer st = jdbcTemplate.queryForObject("select st from stock where id = ?",
                new Object[]{bid},
                Integer.class);
        if(st<=0){
            throw new RuntimeException();
        }else{
            int update = jdbcTemplate.update("update stock set st= st-1 where id = ?", bid);

        }
    }

    @Override
    public void updateBalance(String uid, Integer price) {
        Integer balan = jdbcTemplate.queryForObject("select balance from money where id = ?",
                new Object[]{uid},
                Integer.class);
        if(balan <price){
            throw new RuntimeException("wrong");
        }else{
            jdbcTemplate.update("update money set balance = balance - ? where id = ?", price, uid);
        }
    }

    @Autowired
    private JdbcTemplate jdbcTemplate;
}
