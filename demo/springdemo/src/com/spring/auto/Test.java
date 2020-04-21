package com.spring.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.auto
 * @date 2020/4/9 下午3:50
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("auto.xml");
        Emp emp = applicationContext.getBean("emp", Emp.class);
        System.out.println(emp);
    }
}
