package com.collectiontest;

import java.util.ArrayList;
import java.util.Collection;

/**
 *
 * @package com.collectiontest
 * @author baiyutao
 * @date 2020/4/26 上午12:54
 * @version 1.0
 */
public class Test {
    public static void main(String[] args) {
        Collection coll = new ArrayList();
       // show(coll);
        Collection c1 = new ArrayList();
        Collection c2 = new ArrayList();
        show(c1, c2);
    }

    public static void show(Collection c1, Collection c2){
        //c1,c2添加元素
        c1.add("a1");
        c1.add("a2");
        c1.add("a3");
        c1.add("a4");

        c2.add("a2");
        c2.add("a3");
        c2.add("a4");

        boolean bma = c1.containsAll(c2);
        System.out.println("containsAll:"+bma);
        System.out.println(c1);

        //addAll
        System.out.println("c1:"+c1);
        System.out.println("c2:"+c2);
        c1.addAll(c2);//将c2中元素添加到c1中
        System.out.println(c1);
        //removeAll,将两个集合中的相同元素从调用removeAll的集合中删除
        boolean  b  = c1.removeAll(c2);
        System.out.println("removeAll:"+b);
        System.out.println(c1);
        //containsAll
        boolean bm = c1.containsAll(c2);
        System.out.println("containsAll:"+bm);
        System.out.println(c1);
        c2.add("a2");
        c2.add("a4");
        //retainAll,取交集，保留和指定的集合相同的元素，而删除不同的元素
        //与remove功能相反
        boolean bp = c1.retainAll(c2);
        System.out.println("retainAll:"+bp);
        System.out.println(c1);


    }

    public static void show(Collection coll) {
        //1添加元素 add
        coll.add("abcd");
        coll.add("abcd2");
        coll.add("abcd3");
        System.out.println(coll);
        //2删除元素
        coll.remove("abcd2");//会改变集合的长度
        System.out.println(coll);
        //集合包含
        System.out.println(coll.contains("abcd2"));
        //清空集合
        coll.clear();
        System.out.println(coll);
    }
}
