package com.collectiontest;

import com.bean.Person2;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/5/5 下午6:54
 * @version 1.0
 */
public class ArrayListDemo3 {
    public static void main(String[] args) {

        TreeSet treeSet = new TreeSet(new ComparatorByName());
        treeSet.add(new Person2("zhan", 18));
        treeSet.add(new Person2("zhangsan", 92));
        treeSet.add(new Person2("lisi", 29));
        treeSet.add(new Person2("lisi", 15));
        treeSet.add(new Person2("lisi", 59));
     //   treeSet.add(new Person2("ama", 29));

        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){
            // System.out.println(iterator.next());
            Object next = iterator.next();
            Person2 person = (Person2) next;
            System.out.println(person.getName()+"--"+person.getAge());
        }
    }
}
