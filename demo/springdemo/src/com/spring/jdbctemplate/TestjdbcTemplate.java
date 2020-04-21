package com.spring.jdbctemplate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import static org.junit.Assert.*;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.jdbctemplate
 * @date 2020/4/14 下午11:38
 */
public class TestjdbcTemplate {
    ApplicationContext applicationContext = new ClassPathXmlApplicationContext("jdbc.xml");
    JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate", JdbcTemplate.class);

    @Test
    public void test(){
//        jdbcTemplate.update("insert into user_info values(null, 18,'男')");
         String sql = "insert into user_info values(null, ?, ?)";
         jdbcTemplate.update(sql, 67, "boy");
    }


}