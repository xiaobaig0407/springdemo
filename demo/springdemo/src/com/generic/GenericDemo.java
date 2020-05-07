package com.generic;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @package com.generic
 * @author baiyutao
 * @date 2020/5/6 下午6:24
 * @version 1.0
 */
public class GenericDemo {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("abc");
        //public boolen add(object obj)
        arrayList.add("haha");

        //a1.add(new Inter(4))
        Iterator<String> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            String next = iterator.next();
            System.out.println(next);
        }
    }
}
