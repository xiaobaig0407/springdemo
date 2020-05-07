package com.collectiontest;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/4/28 下午5:56
 * @version 1.0
 */
public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addFirst("abc1");
        linkedList.addFirst("abc2");
        linkedList.addFirst("abc3");
        linkedList.addFirst("abc4");
        Iterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println("next:" + iterator.next());
        }
        System.out.println("-----");
        //获取第一个但不删除
        System.out.println(linkedList.getFirst());
        //获取元素但是会删除
        System.out.println(linkedList.removeFirst());
        System.out.println(linkedList.getFirst());
        System.out.println(linkedList.get(2));
        System.out.println("----");
        while (!linkedList.isEmpty()) {
            System.out.println(linkedList.removeLast());
        }
        System.out.println(linkedList);
    }
}
