package com.spring.aop;

import org.springframework.stereotype.Component;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.aop
 * @date 2020/4/13 上午12:42
 */
@Component
public class TestHandler {
    public void test(){
        System.out.println("test 切入点表达式");
    }
}
