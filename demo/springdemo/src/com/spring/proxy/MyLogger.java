package com.spring.proxy;

/**
 * @author baiyutao
 * @version 1.0
 * @package com.spring.proxy
 * @date 2020/4/12 上午1:12
 */
public class MyLogger {
    public static void before(String methodName, String args){
        System.out.println("method"+methodName+"arguments:"+args);
    }

    public static void after(String methodName, Object result){
        System.out.println("method"+methodName+"result:"+result);
    }

    public static void throwing(){
        System.out.println("有异常");
    }
}
