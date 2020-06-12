package com.generic;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *
 * @package com.generic
 * @author baiyutao
 * @date 2020/5/7 下午2:03
 * @version 1.0
 */
public class GenericAdvanceDemo {
    public static void main(String[] args) {
        ArrayList<String> a1 = new ArrayList<String>();
        a1.add("abc");
        a1.add("efg");


        ArrayList<Integer> a2 = new ArrayList<Integer>();
        a2.add(15);
        a2.add(28);
        printCollection(a1);
        printCollection(a2);
    }

    /**
     * 打印集合中元素
     * @param a2
     */
    private static <T> T printCollection(Collection<T> a2) {
        Iterator<T> iterator = a2.iterator();
        T t = iterator.next();
        return t;
    }
}
