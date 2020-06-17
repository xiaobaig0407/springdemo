package com.spring.aop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.aop
 * @date 2020/4/13 上午12:18
 */


/**
 * 配置文件中添加扫描包让spring扫描，添加aop-aspectj自动代理
 * 切面上定义两个注解，组件注解@Componet,切面注解@Aspec,
 * 目标对象需要被spring管理，也要加组件标识 ，定义组件注解@Component,
 * 定义完成后，当前切面中写通知，写个方法加上@Before就是前置通知
 * main函数中自己new的对象没有关系，所以需要执行ac.getbean
 * 只写这个不行，因为要把切面作用于连接点，必须有切入点表达式execulte()，该切入点表达式的值就是作用于目标对象的方法.
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("aop.xml");
        MathI mathIml = applicationContext.getBean("mathImpl", MathI.class);
        System.out.println(mathIml.getClass().getName());
        int i = mathIml.div(18, 0);
        System.out.println(i);
      /*  TestHandler testHandler = applicationContext.getBean("testHandler", TestHandler.class);
        testHandler.test();*/
    }
}
