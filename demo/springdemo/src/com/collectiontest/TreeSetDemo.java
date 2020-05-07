package com.collectiontest;

import java.util.Iterator;
import java.util.TreeSet;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/5/5 下午5:52
 * @version 1.0
 */
public class TreeSetDemo {
    public static void main(String[] args) {
        TreeSet treeSet = new TreeSet();
        treeSet.add("abc");
        treeSet.add("zaa");
        treeSet.add("aa");
        treeSet.add("abd");
        treeSet.add("bbd");
        treeSet.add("abe");
        Iterator iterator = treeSet.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
