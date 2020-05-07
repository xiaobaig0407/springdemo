package com.collectiontest;


import com.bean.Person2;

import java.util.Comparator;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/5/5 下午7:00
 * @version 1.0
 */

/**
 * 创建了一个根据person类name进行排序比较器
 */
public class ComparatorByName implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {

        Person2 p1 = (Person2)o1;
        Person2 p2 = (Person2)o2;
        int temp = p1.getName().compareTo(p2.getName());
        System.out.println(p1.getAge()-p2.getAge());
        return -1;
        //return temp==0?p2.getAge()-p1.getAge():temp;
    }
}
