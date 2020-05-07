package com.collectiontest;

import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/5/5 下午2:18
 * @version 1.0
 */
public class HashSetDemo {
    public static void main(String[] args) {
        HashSet hashSet = new HashSet();
        String stra = null;

        hashSet.add("haha");
        hashSet.add("hehe");
        hashSet.add("wawa");

        Iterator iterator = hashSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
