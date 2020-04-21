package com.spring.aopxml;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.aopxml
 * @date 2020/4/14 上午12:17
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aopxml.xml");
        MathI mathImpl = applicationContext.getBean("mathImpl", MathI.class);
        int add = mathImpl.add(12, 21);
        System.out.println(add);
    }
}
