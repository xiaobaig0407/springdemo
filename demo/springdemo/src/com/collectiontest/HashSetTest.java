package com.collectiontest;

import com.bean.Person;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/5/5 下午3:37
 * @version 1.0
 */

/**
 * 往hashset集合中存储person，如果姓名和年龄相同，视为同一个元素
 */
public class HashSetTest {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();

        /**
         * HashSet集合数据结果是哈希表，所以存储元素的时候
         * 使用的元素hashcode方法来确定位置，如果位置相同，再通过元素的equals来确定是否相同
         */
        Person p3 = new Person("list7", 3);
        Person p4 = p3;
        hashSet.add(new Person("lista", 1));
        hashSet.add(new Person("lista", 1));
        hashSet.add(p3);
       /* hashSet.add(new Person("listb", 2));
        hashSet.add(new Person("listb", 2));
        hashSet.add(p3);
        hashSet.add(p4);*/

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            Person pera = (Person) next;
            System.out.println(pera.getName()+"..."+ pera.getAge());

        }


    }
}
