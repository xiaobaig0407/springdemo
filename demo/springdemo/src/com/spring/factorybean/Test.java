package com.spring.factorybean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.factorybean
 * @date 2020/4/7 上午12:45
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("factory-bean.xml");
        Object object = applicationContext.getBean("factory");
        Object object2 = applicationContext.getBean("factory");
        System.out.println(object.hashCode());
        System.out.println(object2.hashCode());
    }
}
