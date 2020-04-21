package com.spring.datasource;

import com.alibaba.druid.pool.DruidDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.datasource
 * @date 2020/4/9 下午2:14
 */
public class Test {
    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("datasource.xml");
        DruidDataSource bean = applicationContext.getBean("datasource", DruidDataSource.class);
        System.out.println(bean.getConnection());

    }
}
