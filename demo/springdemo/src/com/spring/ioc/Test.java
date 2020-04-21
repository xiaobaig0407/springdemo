package com.spring.ioc;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.ioc
 * @date 2020/4/8 下午5:01
 */
public class Test {
    public static void main(String[] args) {
        /**
         * 若spring中有单例模式bean,在初始时就会创建此对象
         * 而多例即原型的bean，会在使用时候再创建
         */
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("ioc-scope.xml");
//        Studen  t student = applicationContext.getBean("student", Student.class);
    }
}
