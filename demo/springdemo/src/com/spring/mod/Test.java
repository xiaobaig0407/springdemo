package com.spring.mod;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.mod
 * @date 2020/4/5 下午10:50
 */
public class Test {
    public static void main(String[] args) {
        /* Person per = new Person();
         per.setId(8);
         per.setName("xiaoming");
         System.out.println(per);*/
        //初始化容器
        ConfigurableApplicationContext applicationContext =
                new ClassPathXmlApplicationContext("applicationContext.xml");
        /*//获取对象
        Object obj = applicationContext.getBean("person");
        System.out.println(obj);
        Person per = (Person) obj;*/
        //使用此方法获取对象时，要求spring所管理 的此类型的对象只能有一个
//        Person person = applicationContext.getBean(Person.class);
        applicationContext.getBean("person2", Person.class);
        applicationContext.close();


    }
}
