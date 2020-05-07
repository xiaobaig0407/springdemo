package com.collectiontest;

import com.bean.Person;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/5/5 下午5:58
 * @version 1.0
 */
public class TreeSetDemo2 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();

        /**
         * age从小到大排序
         */
        treeSet.add(new Person("zhangsan", 92));
        treeSet.add(new Person("zhan", 18));
        treeSet.add(new Person("tianhua", 18));
        treeSet.add(new Person("lisi", 29));
     /*   treeSet.add(new Person("wangyu", 26));
        treeSet.add(new Person("lisi", 39));*/

        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){
            Person pr = (Person) iterator.next();
            System.out.println(pr.getName()+":"+pr.getAge());
        }
    }
}
