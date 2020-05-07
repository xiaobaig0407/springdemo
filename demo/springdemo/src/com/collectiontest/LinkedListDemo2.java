package com.collectiontest;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/4/28 下午6:13
 * @version 1.0
 */

/**
 * 使用linkedlist模拟堆栈
 * 队列：先进先出 排队
 * 堆栈：后进先出
 */

public class LinkedListDemo2 {
    public static void main(String[] args) {
        DuiLie dui  = new DuiLie();
        dui.myAdd("abc1");
        dui.myAdd("abc2");
        dui.myAdd("abc3");
        dui.myAdd("abc4");
        System.out.println(dui.myGet());
        System.out.println(dui.isEmpty());
    }
}
