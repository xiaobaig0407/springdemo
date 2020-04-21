package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.aop
 * @date 2020/4/13 上午12:18
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");
        MathI mathIml = applicationContext.getBean("mathImpl", MathI.class);
        System.out.println(mathIml);
        System.out.println(mathIml.getClass().getName());
        int i = mathIml.div(18, 9);
        System.out.println(i);
      /*  TestHandler testHandler = applicationContext.getBean("testHandler", TestHandler.class);
        testHandler.test();*/
    }
}
