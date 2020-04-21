package com.spring.life;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.life
 * @date 2020/4/8 下午6:10
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("life.xml");
        Personoma person = applicationContext.getBean("personoma",
                Personoma.class);

        System.out.println(person);
        AbstractApplicationContext abstractApplicationContext =
                (AbstractApplicationContext)applicationContext;
        abstractApplicationContext.close();
       // applicationContext.close();

    }
}
