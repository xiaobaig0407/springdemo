package com.spring.aop;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.aop
 * @date 2020/4/13 下午11:59
 */

@Component
@Aspect
@Order(1)
public class TestAspect {
    @Before(value = "execution(* com.spring.aop.*.*(..)))")
    public void before(){
        System.out.println("test==>测试前置通知");
    }
}
