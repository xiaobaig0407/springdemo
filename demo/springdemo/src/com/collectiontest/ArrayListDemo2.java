package com.collectiontest;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/5/5 下午4:31
 * @version 1.0
 */
public class ArrayListDemo2 {
    public static void main(String[] args) {
        ArrayList arrayList = new ArrayList();
        arrayList.add("abc");
        arrayList.add("abd");
        arrayList.add("abe");
        arrayList.add("abc");
        System.out.println(arrayList);
        arrayList = getSingleEle(arrayList);
        System.out.println(arrayList);

    }

    private static ArrayList getSingleEle(ArrayList arrayList) {
        //1定义一个临时容器
        ArrayList temp = new ArrayList();
        //迭代集合
        Iterator iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Object obj = iterator.next();
            //判断被迭代的元素是否在temp
            if (!temp.contains(obj)) {
                temp.add(obj);
            }
        }
        return temp;
    }


}
