package com.spring.jdbctemplate;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.List;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.jdbctemplate
 * @date 2020/4/14 下午11:38
 */
public class TestjdbcTemplate {
    ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("jdbc.xml");
    JdbcTemplate jdbcTemplate = applicationContext.getBean("jdbcTemplate",
            JdbcTemplate.class);

    @Test
    public void testUpdate() {
//        jdbcTemplate.update("insert into user_info values(null, 18,'男')");
        String sql = "insert into user_info values(null, ?, ?)";
        jdbcTemplate.update(sql, 67, "boy");//单个增删改

        String eids = "74,75,76";
        String sqla = "delete from user_info where userid in (" + eids + ")";
        String args = "74,75,76";
        jdbcTemplate.update(sqla);
        //如果是字符串默认为2边加单引号
        String mohu = "a";
        //可以使用相当于 '%','a','%'  ====> '%(',')a(',')%'国为括号内没有其它字符串可以当成括号内为空
        //        =》'%a%'
        String sqld = "select * from user_info where avatar like concat('%', ?, '%')";
        String sqlerror = "select * from user_info where avatar like '%?%'";
        //不能使用
    }

    @Test
    public void testBatchUpdate() {
        String sql = "insert into user_info values(null, ?, ?)";
        List<Object[]> list = new ArrayList<>();
        list.add(new Object[]{74, "男"});
        list.add(new Object[]{75, "girl"});
        list.add(new Object[]{76, "男"});
        jdbcTemplate.batchUpdate(sql, list);//批量增删改
    }

    @Test
    public void testQueryForObjetct() {
//        jdbcTemplate.queryForObject(sql, requiredType)用来获取单个的值 sum,count
//          jdbcTemplate.queryForObject(sql, rowMapper)用来获取单条数据
        RowMapper<Emp> rowMapper = new BeanPropertyRowMapper<Emp>(Emp.class);//将列名（字段名或字段名的别名）与属性名映射
        String sql = "select userid,avatar from user_info where id = ?";
        Emp emp = jdbcTemplate.queryForObject(sql, new Object[]{7}, rowMapper);
        System.out.println(emp);

        String sqlm = "select count(*) from user_info";
        Integer integera  = jdbcTemplate.queryForObject(sqlm, Integer.class);
        System.out.println(integera);
        System.out.println(Integer.class);
        System.out.println(Integer.class.getTypeName());
    }

    @Test
    public void testQuery(){
        RowMapper<Emp> rowmapper = new BeanPropertyRowMapper<>(Emp.class);
        String sql = "select userid,avatar from user_info";
        List<Emp> list = jdbcTemplate.query(sql, rowmapper);
        for(Emp em : list ){
            System.out.println(em);
        }
    }


}