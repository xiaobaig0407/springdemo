package com.spring.di;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.di
 * @date 2020/4/6 下午3:10
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(
                "beans-di.xml");
//        Student student = applicationContext.getBean("s1", Student.class);
//        Student student = applicationContext.getBean("s2", Student.class);
//         Student student = applicationContext.getBean("s5", Student.class);
//         Student student = applicationContext.getBean("s7", Student.class);
//        Teacher ta = applicationContext.getBean("t2", Teacher.class);
//        Teacher ta = applicationContext.getBean("t3", Teacher.class);
        Teacher ta = applicationContext.getBean("t4", Teacher.class);
        System.out.println(ta);
    }
}
