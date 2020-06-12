package com.exceptiontest;

import java.lang.Exception;
/*
 *异常处理的捕捉形式：这是可以对异常进行针对性处理的方式
 * 具体格式是
 * try{
 *   //需要被检测异常的代码 。
 * }
 * catch(异常类 变量){该变量用于接收发生的异常对象
 *   //处理异常的代码
 * }
 * finnaly{
 *
 * }
 *
 * 异常处理的原则
 * 1.函数内部如果抛出需要检测的异常，那么函数上必须要声明。
 *      否则必须在函数内用trycatch捕捉，否则编译失败。
 * 2.如果调用到了声明异常的函数，要么try catch要么throw,否则编译失败
 * 3.什么时候catch,什么时候throw?
 *      功能内部可以解决，用catch。
 *      解决不了，用throws告诉调用者，由调用者解决
 *4.一个功能如果抛出了多个异常，那么调用进必须对应多个catch进行针对性处理。
 *      内部有几个需要检测的异常，就抛几个异常，抛出几个，就catch几个
 */


/**
 *
 * @package com.exceptiontest
 * @author baiyutao
 * @date 2020/5/24 下午12:57
 * @version 1.0
 */

class Fushu2IndexException extends Exception {
    Fushu2IndexException() {

    }

    public Fushu2IndexException(String message) {
        super(message);
    }
}


class Demo3 {
    public int method(int[] arr, int index) throws Fushu2IndexException,
            NullPointerException {

        if (arr == null) {
            throw new NullPointerException("没有任何数据实体");
        }
        if (index < 0) {
            throw new Fushu2IndexException("角标变成负数了");
        }


        return arr[index];
    }
}

public class ExcepDemo4 {
    public static void main(String[] args) throws FushuIndexException {
        int[] arr = new int[3];
        Demo3 d = new Demo3();
        try {
            int num = d.method(null, -40);
            System.out.println("aaaa");
        } catch (NullPointerException e) {
            System.out.println(e.toString());
        } catch (Fushu2IndexException e) {
            System.out.println("message:" + e.getMessage());
            System.out.println("stringeee:" + e);
            System.out.println("负数角标异常");
            e.printStackTrace();//jvm默认的异常处理机制就是调用异常对象的这个方法
        } finally {
            System.out.println("ccccc");
        }

    }
}
