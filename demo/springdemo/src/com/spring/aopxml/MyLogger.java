package com.spring.aopxml;

import org.springframework.stereotype.Component;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.aopxml
 * @date 2020/4/14 上午12:11
 */

@Component
public class MyLogger {

    public void before(){
        System.out.println("前置通知");
    }
}
