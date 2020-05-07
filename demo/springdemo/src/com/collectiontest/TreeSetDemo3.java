package com.collectiontest;

import com.comparator.ComparatorByLength;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/5/6 上午11:25
 * @version 1.0
 */
public class TreeSetDemo3 {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet(new ComparatorByLength());
        treeSet.add("aaaa");
        treeSet.add("zz");
        treeSet.add("nby");
        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
